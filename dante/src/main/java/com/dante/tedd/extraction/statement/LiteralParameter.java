package com.dante.tedd.extraction.statement;


import com.dante.utils.Properties;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class LiteralParameter implements ActionParameter {

    private String value;

    public LiteralParameter(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString(){
        return this.value;
    }

    @Override
    public boolean isLiteral() {
        return true;
    }

    @Override
    public boolean isAction() {
        return false;
    }

    @Override
    public boolean equals(Object other){

        if(other == this) return true;

        if(other instanceof LiteralParameter){
            LiteralParameter otherLiteralParameter = (LiteralParameter) other;
            return Objects.equals(this.value, otherLiteralParameter.value);
        }
        return false;
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.value);
    }

    public boolean contains(LiteralParameter otherLiteralParameter){
        if(this.equals(otherLiteralParameter))
            return true;

        for (String separator: Properties.knownWordsSeparators){
            List<String> words = Arrays.asList(this.getValue().split(separator));
            for(String word: words){
                if(word.replaceAll("\"","")
                        .equals(otherLiteralParameter.getValue().replaceAll("\"",""))){
                    return true;
                }
            }
        }
        return false;
    }
}
