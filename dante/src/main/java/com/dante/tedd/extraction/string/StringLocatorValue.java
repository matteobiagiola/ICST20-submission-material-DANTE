package com.dante.tedd.extraction.string;

import com.dante.tedd.extraction.statement.Action;
import com.dante.tedd.extraction.statement.ActionParameter;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StringLocatorValue implements StringValue {

    private Action locator;

    public StringLocatorValue(Action locator){

        if(!locator.isLocator()) {
            throw new IllegalArgumentException("Action " + locator + " is not a locator");
        }
        this.locator = locator;
    }

    @Override
    public String toString(){
        return "(locator: " + this.locator + " -- no action)";
    }

    @Override
    public boolean equals(Object other){

        if(other == this) return true;

        if(other instanceof StringLocatorValue){
            StringLocatorValue otherStringLocatorValue = (StringLocatorValue) other;
            return Objects.equals(this.locator, otherStringLocatorValue.locator);
        }
        return false;
    }

    public Action getLocator(){
        return this.locator;
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.locator);
    }

    @Override
    public ValueType getValueType() {
        return ValueType.LOCATOR;
    }

    @Override
    public List<String> getValues() {
        return this.locator.getActionParameters()
                .stream()
                .map(ActionParameter::toString)
                .collect(Collectors.toList());
    }
}
