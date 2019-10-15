package com.dante.tedd.extraction.statement;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DriverStatement implements SeleniumStatement {

    private List<Action> actions;

    public DriverStatement(List<Action> actions){
        // actions are collected recursively, therefore in the reverse order
        this.actions = new LinkedList<>(actions);
        Collections.reverse(this.actions); // check if it works
    }

    @Override
    public List<Action> getActions() {
        return actions;
    }

    /**
     * @implNote assumption: the locator action (e.g. By.id("id")) is always a parameter of another driver action (e.g. findElement/findElements)
     * */
    @Override
    public Action getLocator() {
        Optional<Action> actionWithLocatorOptional = this.actions.stream()
                .filter(action -> action.getActionParameters()
                        .stream()
                        .anyMatch(actionParameter -> {
                            if(actionParameter.isAction()){
                                return ((Action) actionParameter).isLocator();
                            }
                            return false;
                        }))
                .findFirst();
        if(!actionWithLocatorOptional.isPresent()) {
            throw new IllegalStateException("Selenium statement "
                    + this.toString() + " has no action with locator");
        }
        Action actionWithLocator = actionWithLocatorOptional.get();
        List<ActionParameter> actionParameters = actionWithLocator.getActionParameters();
        Optional<Action> locatorOptional = actionParameters.stream()
                .filter(ActionParameter::isAction)
                .map(actionParameter -> (Action) actionParameter)
                .findAny();
        if(!locatorOptional.isPresent()) {
            throw new IllegalStateException("Selenium statement "
                    + this.toString() + " has no locator");
        }
        return locatorOptional.get();
    }

    @Override
    public String toString(){
        return "driver." + this.actions.stream().map(Action::toString).collect(Collectors.joining("."));
    }
}
