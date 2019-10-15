package com.dante.suitegenerator.atusa.extraction;

import java.util.ArrayList;
import java.util.List;

public class InputFieldLocator {

    public String type;
    public String id;
    public List<String> values;
    public String value; //it seems that pebble does not support lists when they are fields of an object

    public InputFieldLocator() {
        this.type = "none";
        this.id = "none";
        this.values = new ArrayList<>();
        this.value = "none";
    }

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

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
