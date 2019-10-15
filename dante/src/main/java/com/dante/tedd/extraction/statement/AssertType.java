package com.dante.tedd.extraction.statement;

public enum AssertType {
    TRUE ("True"),
    EQUALS ("Equals");

    private String name;

    AssertType(String name){
        this.name = name;
    }

    public String getValue(){
        return name;
    }
}
