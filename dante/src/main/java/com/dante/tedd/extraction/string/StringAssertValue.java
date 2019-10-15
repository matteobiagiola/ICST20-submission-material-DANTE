package com.dante.tedd.extraction.string;

import com.dante.tedd.extraction.statement.Action;
import com.dante.tedd.extraction.statement.LiteralParameter;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class StringAssertValue implements StringValue {

    private Action locator;
    private Action driverAction;
    private LiteralParameter valueToBeChecked;

    public StringAssertValue(Action locator, Action driverAction, LiteralParameter valueToBeChecked){

        if(!locator.isLocator()) {
            throw new IllegalArgumentException("Action " + locator + " is not a locator");
        }

        this.locator = locator;
        this.driverAction = driverAction;
        this.valueToBeChecked = valueToBeChecked;
    }

    @Override
    public String toString(){
        return "(locator: " + this.locator + " -- action : " + this.driverAction
                + " -- value to be checked: " + this.valueToBeChecked + ")";
    }

    @Override
    public boolean equals(Object other){

        if(other == this) return true;

        if(other instanceof StringAssertValue){
            StringAssertValue otherStringAssertValue = (StringAssertValue) other;
            return Objects.equals(this.locator, otherStringAssertValue.locator) &&
                    Objects.equals(this.driverAction, otherStringAssertValue.driverAction) &&
                    Objects.equals(this.valueToBeChecked, otherStringAssertValue.valueToBeChecked);
        }
        return false;
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.locator, this.driverAction, this.valueToBeChecked);
    }

    @Override
    public ValueType getValueType() {
        return ValueType.ASSERT;
    }

    @Override
    public List<String> getValues() {
        return Arrays.asList(this.valueToBeChecked.getValue());
    }
}
