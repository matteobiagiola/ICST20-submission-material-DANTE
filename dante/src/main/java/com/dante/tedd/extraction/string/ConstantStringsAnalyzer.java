package com.dante.tedd.extraction.string;

import com.dante.parsing.TestCaseFinder;
import com.dante.parsing.TestCaseParser;
import com.dante.tedd.extraction.DependencyGraphExtractor;
import com.dante.tedd.extraction.statement.*;
import com.dante.tedd.graph.DependencyGraphManager;
import com.dante.tedd.graph.GraphEdge;
import com.dante.tedd.graph.GraphNode;
import org.apache.log4j.Logger;
import org.jgrapht.Graph;

import com.dante.utils.Properties;
import spoon.reflect.declaration.CtMethod;

import java.util.*;
import java.util.stream.Collectors;

public class ConstantStringsAnalyzer implements DependencyGraphExtractor {

    private final static Logger logger = Logger.getLogger(ConstantStringsAnalyzer.class.getName());

    public ConstantStringsAnalyzer(){
    }

    @Override
    public Graph<GraphNode<String>, GraphEdge> computeDependencies(){
        Map<String, List<SeleniumStatement>> map = new LinkedHashMap<>(this.mapTestsToSeleniumStatements(new TestCaseFinder().getCtMethodRepresentation()));
        List<String> testNames = Arrays.asList(Properties.tests_order);
        List<String> testsToAnalyze = new ArrayList<>(testNames);
        DependencyGraphManager<String> dependencyGraphManager = new DependencyGraphManager<>();
        for (int i = 0; i < testNames.size() - 1; i++) {
            String testName = testNames.get(i);
            testsToAnalyze.remove(testName);
            Set<StringValue> writtenValues = this.findStringValuesWrittenInTestCase(map.get(testName));
            GraphNode<String> graphTargetNode = new GraphNode<>(testName, i);
            for (String testToAnalyze : testsToAnalyze) {
                Set<StringValue> readValues = this.findStringValuesInTestCase(map.get(testToAnalyze), writtenValues);
                if (!readValues.isEmpty()) {
                    int indexOfTestToAnalyze = testNames.indexOf(testToAnalyze);
                    GraphNode<String> graphSourceNode = new GraphNode<>(testToAnalyze, indexOfTestToAnalyze);
                    GraphEdge graphEdge = new GraphEdge(readValues, graphSourceNode, graphTargetNode);
                    dependencyGraphManager.addDependency(graphSourceNode, graphTargetNode, graphEdge);
                }
            }
        }

        return dependencyGraphManager.getDependencyGraph();
    }

    private List<SeleniumStatement> getTestSeleniumStatements(CtMethod ctMethod){
        TestCaseParser testCaseParser = new TestCaseParser();
        return testCaseParser.getSeleniumStatements(ctMethod);
    }

    private Map<String, List<SeleniumStatement>> mapTestsToSeleniumStatements(List<CtMethod> testMethods){
        Map<String, List<SeleniumStatement>> map = new LinkedHashMap<>();
        List<String> testNames = new ArrayList<>();
        for(CtMethod testMethod: testMethods){
            testNames.add(testMethod.getSimpleName());
            map.put(testMethod.getSimpleName(), this.getTestSeleniumStatements(testMethod));
        }
        this.checkMethodNamesWithInputTestNames(testNames);
        return map;
    }

    private void checkMethodNamesWithInputTestNames(List<String> testNames){
        List<String> testInputNames = Arrays.asList(Properties.tests_order);
        for (String testInputName: testInputNames){
            if(!testNames.contains(testInputName)){
                throw new IllegalArgumentException("There is no test named " + testInputName + " in " + Properties.TEST_SUITE_PATH);
            }
        }
    }

    /**
     *
     * @implNote assumption: locator container actions are always read action
     * @implNote assumption: locator container has only one parameter that is an action && a locator
     * @see com.dante.tedd.extraction.statement.DriverStatement#getLocator()
     * */
    private Set<StringValue> findStringValuesWrittenInTestCase(List<SeleniumStatement> testCaseStatements){
        List<String> writeActionNames = Arrays.asList(Properties.WRITE_ACTIONS);
        Set<StringValue> stringValues = new LinkedHashSet<>();
        for (SeleniumStatement seleniumStatement: testCaseStatements){
            List<Action> actions = seleniumStatement.getActions();
            List<Action> writeActions = actions.stream()
                    .filter(action -> {
                        List<ActionParameter> actionParameters = action.getActionParameters();
                        return this.paramsContainWriteAction(writeActionNames, actionParameters)
                                || writeActionNames.contains(action.getName());
                    })
                    .collect(Collectors.toList());
            for (Action writeAction : writeActions) {
                StringValue stringValue;
                if(writeAction.isLocatorContainer()){
                    // should arrive here only because locator container contains a locator whose name
                    // is a write action
                    List<ActionParameter> actionParameters = writeAction.getActionParameters();
                    Optional<Action> locatorActionOptional = actionParameters.stream()
                            .filter(actionParameter -> {
                                if(actionParameter.isAction()){
                                    Action action = (Action) actionParameter;
                                    if(action.isLocator())
                                        return writeActionNames.contains(action.getName());
                                    return false;
                                }
                                return false;
                            })
                            .map(actionParameter -> (Action) actionParameter)
                            .findAny();
                    if(!locatorActionOptional.isPresent()) {
                        throw new IllegalStateException("No locator contained in " +
                                "locator container action " + writeAction);
                    }
                    stringValue = new StringLocatorValue(locatorActionOptional.get());
                } else {
                    Action locator = seleniumStatement.getLocator();
                    stringValue = new StringDriverValue(locator, writeAction);
                }
                stringValues.add(stringValue);
            }
        }
        return stringValues;
    }

    /**
     * @return true if there is at least one action in @param actionParameters
     * that has the same name of an item of @param writeActionNames (i.e. is a
     * write action)
     * */
    private boolean paramsContainWriteAction(List<String> writeActionNames, List<ActionParameter> actionParameters){
        boolean result = false;
        for (ActionParameter actionParameter : actionParameters) {
            if(actionParameter.isAction()){
                Action action = (Action) actionParameter;
                result = writeActionNames.contains(action.getName())
                        || this.paramsContainWriteAction(writeActionNames, action.getActionParameters());
            } else if(actionParameter.isLiteral()) {
                result = false;
            } else {
                throw new IllegalStateException("Unknown action parameter type: " + actionParameter);
            }
        }
        return result;
    }

    private Set<StringValue> findStringValuesInTestCase(List<SeleniumStatement> testCaseStatements,
                                                        Set<StringValue> writtenValues){
        Set<StringValue> stringValues = new LinkedHashSet<>();
        for(SeleniumStatement testCaseStatement: testCaseStatements){
            Action locator = testCaseStatement.getLocator();
            if(testCaseStatement instanceof DriverStatement || testCaseStatement instanceof FlakinessFixerStatement) {
                stringValues.addAll(this.getReadActionsInDriverLikeStatement(testCaseStatement, locator,
                        writtenValues, false));
            } else if(testCaseStatement instanceof AssertStatement) {
                AssertStatement assertStatement = (AssertStatement) testCaseStatement;
                if(assertStatement.getAssertType().equals(AssertType.EQUALS)){
                    AssertEqualsStatement assertEqualsStatement = (AssertEqualsStatement) assertStatement;
                    LiteralParameter valueToBeChecked = assertEqualsStatement.getValueToBeChecked();
                    boolean match = writtenValues.stream()
                            .anyMatch(writtenValue -> {
                                if(writtenValue.getValueType().equals(ValueType.DRIVER)){
                                    StringDriverValue stringDriverValue = (StringDriverValue) writtenValue;
                                    Action driverAction = stringDriverValue.getDriverAction();
                                    return driverAction.getActionParameters().stream()
                                            .anyMatch(actionParameter -> actionParameter.equals(valueToBeChecked));
                                }
                                return false;
                            });
                    if(match){
                        List<Action> assertStatementActions = assertEqualsStatement.getDriverStatement().getActions();
                        Action lastAction = assertStatementActions.get(assertStatementActions.size() - 1);
                        stringValues.add(new StringAssertValue(locator, lastAction, valueToBeChecked));
                    }
                } else if(assertStatement.getAssertType().equals(AssertType.TRUE)) {
                    stringValues.addAll(this.getReadActionsInDriverLikeStatement(assertStatement.getDriverStatement(),
                            locator, writtenValues, true));
                } else {
                    throw new IllegalStateException("Unknown assert type " + assertStatement.getAssertType().getValue()
                            + " in assert statement " + assertStatement);
                }
            } else {
                throw new IllegalStateException("Unknown statement " + testCaseStatement);
            }
        }
        return stringValues;
    }

    /**
     * @implNote It assumes that the last action of a driver statement and the locator of that driver statement
     * may contain written values
     * */
    private Set<StringValue> getReadActionsInDriverLikeStatement(SeleniumStatement seleniumStatement,
                                                                 Action locator,
                                                                 Set<StringValue> writtenValues,
                                                                 boolean actionInAssert){
        Set<StringValue> writtenAndReadValues = new LinkedHashSet<>();
        Action lastAction = seleniumStatement.getActions().get(seleniumStatement.getActions().size() - 1);
        if(this.isReadAction(writtenValues, lastAction, actionInAssert)){
            writtenAndReadValues.add(new StringDriverValue(locator, lastAction));
        }
        if(this.isReadAction(writtenValues, locator, true)){
            writtenAndReadValues.add(new StringLocatorValue(locator));
        }
        return writtenAndReadValues;
    }

    /**
     * @param containsComparison if true values are compared using a contains operation; if false equals operation is applied
     * */
    private boolean isReadAction(Set<StringValue> writtenValues, Action action, boolean containsComparison){
        return writtenValues.stream()
                .anyMatch(writtenValue -> {
                    if(writtenValue.getValueType().equals(ValueType.DRIVER)){
                        StringDriverValue writtenDriverValue = (StringDriverValue) writtenValue;
                        Action writtenDriverAction = writtenDriverValue.getDriverAction();
                        List<ActionParameter> writtenActionParameters = writtenDriverAction.getActionParameters();
                        List<ActionParameter> actionParameters = action.getActionParameters();
                        return this.anyMatch(writtenActionParameters, actionParameters, containsComparison);
                    } else if(writtenValue.getValueType().equals(ValueType.LOCATOR)){
                        StringLocatorValue stringLocatorValue = (StringLocatorValue) writtenValue;
                        List<ActionParameter> writtenActionParameters = stringLocatorValue.getLocator().getActionParameters();
                        List<ActionParameter> actionParameters = action.getActionParameters();
                        return this.anyMatch(writtenActionParameters, actionParameters, containsComparison);
                    }
                    throw new UnsupportedOperationException("Written value " + writtenValue + " with type "
                            + writtenValue.getValueType() + " not supported in read/write matching");
                });
    }

    /**
     * @param containsComparison if true values are compared using a contains operation; if false equals operation is applied
     * @return true if a written parameter is equals to a parameter of an action
     * */
    private boolean anyMatch(List<ActionParameter> writtenActionParameters, List<ActionParameter> actionParameters, boolean containsComparison){
        if(containsComparison){
            return writtenActionParameters.stream()
                    .anyMatch(writtenActionParameter ->
                        actionParameters.stream().anyMatch(actionParameter -> {
                            if(writtenActionParameter.isLiteral() && actionParameter.isLiteral()){
                                LiteralParameter writtenLiteralParameter = (LiteralParameter) writtenActionParameter;
                                LiteralParameter literalParameter = (LiteralParameter) actionParameter;
                                return literalParameter.contains(writtenLiteralParameter);
                            }
                            return false;
                        })
                    );
        }
        return writtenActionParameters.stream()
                .anyMatch(writtenActionParameter ->
                    actionParameters.stream().anyMatch(actionParameter -> {
                        if(writtenActionParameter.isAction() || actionParameter.isAction())
                            return false;
                        return actionParameter.equals(writtenActionParameter);
                    })
                );
    }


}
