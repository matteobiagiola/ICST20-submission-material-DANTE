package com.dante.parsing;

import com.dante.tedd.extraction.statement.*;
import org.apache.log4j.Logger;
import spoon.Launcher;
import spoon.SpoonAPI;
import spoon.reflect.code.*;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.CtExecutableReference;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestCaseParser {

    private final static Logger logger = Logger.getLogger(TestCaseParser.class.getName());
    private Factory factory;
    private SpoonAPI spoon;

    public TestCaseParser(File classFile){
        SpoonAPI spoon = new Launcher();
        spoon.getEnvironment().setNoClasspath(true);
        JavaFormatter.removeComments(classFile);
        spoon.addInputResource(classFile.getAbsolutePath());
        spoon.buildModel();
        this.spoon = spoon;
        this.factory = spoon.getFactory();
    }

    public TestCaseParser(){

    }

    /**
     * @implNote if the parsed class is a PO, it transforms it according to rules
     * defined by the creation of the CUT.
     * */
    public Optional<CtClass<?>> getCtRepresentationOfClass(){

        Optional<CtClass<?>> ctClassOptional;
        List<CtClass<?>> ctClasses = this.spoon.getModel().getElements(ctClass -> true);
        if(ctClasses.isEmpty()){
            ctClassOptional = Optional.empty();
        }else{
            CtClass<?> ctClass = ctClasses.get(0);
            ctClassOptional = Optional.of(ctClass);
        }
        return ctClassOptional;
    }

    public List<SeleniumStatement> getSeleniumStatements(CtMethod testMethod){
        List<SeleniumStatement> result =
                testMethod.getBody().getStatements().stream().filter(statementToSelect).map(TestCaseParser::handleStatement).collect(Collectors.toList());
        if(result.isEmpty())
            logger.warn("No selenium statements in test method " + testMethod.getSimpleName());
        return result;
    }


    private static Predicate<CtStatement> statementToSelect = statement -> {
        if(statement instanceof CtInvocation){
            CtInvocation invocation = (CtInvocation) statement;
            if(isAssertStatement(invocation) || isDriverStatement(invocation) || isFlakinessFixerStatement(invocation)) return true;
            else logger.warn("Invocation statement " + statement + " " + statement.getClass() + " ignored");
        }
        logger.warn("Statement " + statement + " " + statement.getClass() + " ignored");
        return false;
    };

    private static boolean isAssertStatement(CtInvocation<?> invocation){
        int indexFirstParenthesis = invocation.toString().indexOf("(");
        return invocation.toString().substring(0, indexFirstParenthesis).contains("assert"
                    + AssertType.TRUE.getValue()) || invocation.toString().substring(0, indexFirstParenthesis).contains("assert" + AssertType.EQUALS.getValue());
    }

    private static boolean isDriverStatement(CtInvocation<?> invocation){
        int indexFirstParenthesis = invocation.toString().indexOf("(");
        return invocation.toString().substring(0, indexFirstParenthesis).contains("driver.findElement");
    }

    /**
     * @implNote filter all actions that has as a parameter a WebElement (action without locator)
     * */
    private static boolean isFlakinessFixerStatement(CtInvocation<?> invocation){
        return SeleniumActions.isContained(invocation.toString())
                && invocation.getExecutable().getParameters()
                .stream().anyMatch(executableParameter
                        -> !executableParameter.getSimpleName().equals("WebElement"));
    }

    private static SeleniumStatement handleStatement(CtStatement statement){
        logger.debug("Statement: " + statement + ": " + statement.getClass());
        if(statement instanceof CtInvocation){
            CtInvocation invocation = (CtInvocation) statement;
            if(isDriverStatement(invocation)) {
                DriverStatement driverStatement = handleDriverStatement(invocation);
                logger.debug("Driver statement: " + driverStatement);
                return driverStatement;
            } else if(isAssertStatement(invocation)){
                AssertStatement assertStatement = handleAssertStatement(invocation);
                logger.debug("Assert statement: " + assertStatement);
                return assertStatement;
            } else if(isFlakinessFixerStatement(invocation)){
                FlakinessFixerStatement flakinessFixerStatement = handleFlakinessFixerStatement(invocation);
                logger.debug("Flakiness fixer statement: " + flakinessFixerStatement);
                return flakinessFixerStatement;
            }
            else {
                throw new IllegalStateException("Statement " + statement + " is neither a driver nor an assert statement nor a flakiness fixer statement");
            }
        } else {
            throw new UnsupportedOperationException("Statement " + statement + " " + statement.getClass() + " not supported");
        }
    }

    private static DriverStatement handleDriverStatement(CtInvocation<?> invocation){
        return new DriverStatement(handleInvocationStatement(invocation));
    }

    private static FlakinessFixerStatement handleFlakinessFixerStatement(CtInvocation<?> invocation){
        String callerName = invocation.getTarget().toString();
        if(invocation.getTarget() instanceof CtInvocation){
            throw new UnsupportedOperationException("Flakiness fixer statement supports only one method call after caller name "
                    + callerName + ". Found " + invocation);
        } else if(invocation.getTarget() instanceof CtFieldRead
                || invocation.getTarget() instanceof CtTypeAccess){
            List<ActionParameter> actionParameters = handleInvocationArgumentsStatement(invocation.getArguments());
            String actionName = handleExecutableStatement(invocation.getExecutable());
            Optional<Action> optionalLocator = actionParameters.stream()
                    .filter(actionParameter -> {
                        if(actionParameter.isAction()){
                            Action action = (Action) actionParameter;
                            return action.isLocator();
                        }
                        return false;
                    })
                    .map(actionParameter -> (Action) actionParameter)
                    .findAny();
            if(!optionalLocator.isPresent()) {
                throw new IllegalStateException("Flakiness fixer statement has no locator: " + invocation);
            }
            Action locator = optionalLocator.get();
            List<ActionParameter> actionParametersWithoutLocator = actionParameters.stream()
                    .filter(actionParameter -> {
                        if(actionParameter.isAction()){
                            Action action = (Action) actionParameter;
                            return !action.isLocator();
                        }
                        return true;
                    })
                    .collect(Collectors.toList());
            Action seleniumAction = new Action(actionName, actionParametersWithoutLocator);
            return new FlakinessFixerStatement(locator, callerName, seleniumAction);
        }
        else {
            throw new IllegalStateException("Invocation statement target unknown: " + invocation + " " + invocation.getTarget() + " " + invocation.getTarget().getClass());
        }
    }

    private static AssertStatement handleAssertStatement(CtInvocation<?> invocation){
        if(invocation.getArguments().isEmpty()) {
            throw new IllegalArgumentException("Invocation assert " + invocation + " must have at least one argument");
        }
        if(invocation.getArguments().size() == 2){
            CtExpression<?> firstArgument = invocation.getArguments().get(0);
            CtExpression<?> secondArgument = invocation.getArguments().get(1);
            if(firstArgument instanceof CtLiteral){
                String valueToBeChecked = firstArgument.toString();
                if(secondArgument instanceof CtInvocation){
                    LiteralParameter literalParameter = new LiteralParameter(valueToBeChecked);
                    return new AssertEqualsStatement(literalParameter,
                            handleDriverStatement((CtInvocation<?>) secondArgument));
                } else {
                    throw new UnsupportedOperationException("second argument of assertion "
                            + invocation + " must be a driver invocation. Found " + secondArgument.getClass());
                }
            } else {
                throw new UnsupportedOperationException("first argument of assertion "
                        + invocation + " must be a literal. Found " + firstArgument.getClass());
            }
        } else if(invocation.getArguments().size() == 1) {
            CtExpression<?> firstArgument = invocation.getArguments().get(0);
            if(firstArgument instanceof CtInvocation){
                return new AssertTrueStatement(handleDriverStatement((CtInvocation<?>) firstArgument));
            } else {
                throw new UnsupportedOperationException("first argument of assertion "
                        + invocation + " must be a driver invocation. Found " + firstArgument.getClass());
            }
        } else {
            throw new IllegalArgumentException("Invocation assert "
                    + invocation + " cannot have " + invocation.getArguments().size() + " arguments. Required 1 or 2.");
        }
    }

    private static List<Action> handleInvocationStatement(CtInvocation<?> invocation){
        List<Action> result = new ArrayList<>();
        if(invocation.getTarget() instanceof CtInvocation){
            List<CtExpression<?>> driverActionArguments = invocation.getArguments();
            List<ActionParameter> driverActionArgumentStrings = handleInvocationArgumentsStatement(driverActionArguments);
            Action action = new Action(handleExecutableStatement(invocation.getExecutable()),
                    driverActionArgumentStrings);
            result.add(action);
            logger.debug("Invocation statement target invocation: " + invocation + ", action: " + action);
            result.addAll(handleInvocationStatement((CtInvocation) invocation.getTarget()));
        } else if(invocation.getTarget() instanceof CtFieldRead
                || invocation.getTarget() instanceof CtTypeAccess){
            List<CtExpression<?>> driverActionArguments = invocation.getArguments();
            List<ActionParameter> driverActionArgumentStrings = handleInvocationArgumentsStatement(driverActionArguments);
            Action action = new Action(handleExecutableStatement(invocation.getExecutable()),
                    driverActionArgumentStrings);
            result.add(action);
            logger.debug("Invocation statement target fieldRead/typeAccess: " + invocation + ", action: " + action);
        }
        else {
            logger.debug("Invocation statement target unknown: " + invocation + " " + invocation.getTarget() + " " + invocation.getTarget().getClass());
        }
        return result;
    }

    private static String handleExecutableStatement(CtExecutableReference executableReference){
        return executableReference.getSimpleName();
    }

    private static List<ActionParameter> handleInvocationArgumentsStatement(List<CtExpression<?>> arguments){
        List<ActionParameter> result = new ArrayList<>();
        for(CtExpression<?> argument: arguments){
            if(argument instanceof CtInvocation){
                List<Action> actions = handleInvocationStatement((CtInvocation<?>) argument);
                result.addAll(actions);
            } else if(argument instanceof CtLiteral){
                result.add(new LiteralParameter(argument.toString()));
            } else if(argument instanceof CtFieldRead){
                logger.warn("Ignoring field with value assigned at runtime as a parameter of a selenium action: " + argument);
            }
            else {
                throw new IllegalStateException("Unknown argument type: " + argument + " " + argument.getClass());
            }
        }
        return result;
    }

}
