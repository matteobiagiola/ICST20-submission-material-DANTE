package com.dante.suitegenerator.atusa.extraction;

import java.util.List;

public class ClickableLocator {

    public String type;
    public String id;
    public String value;
    public List<InputFieldLocator> inputFieldLocators;

    public String getValue() {
        return value;
    }
    public void setValue(String value) { this.value = value; }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public List<InputFieldLocator> getInputFieldLocators() { return inputFieldLocators; }
    public void setInputFieldLocators(List<InputFieldLocator> inputFieldLocators) { this.inputFieldLocators = inputFieldLocators; }

}
