package com.dante.tedd.statement;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LiteralParameter {

    private String value;
    private boolean isRegex = false;
    private Matcher matcher;
    private Pattern pattern;

    public LiteralParameter(String value){
        this.value = value;
    }

    public LiteralParameter(String value, boolean isRegex){
        this(value);
        this.isRegex = isRegex;
        if(this.isRegex){
            pattern = Pattern.compile("(\\w+){2}");
        }
    }

    public String getValue() {
        if(this.isRegex){
            this.matcher = this.pattern.matcher(this.value);
            StringBuilder builder = new StringBuilder();
            while(this.matcher.find()){
                builder.append(this.matcher.group());
                builder.append(" ");
            }
            if(!builder.toString().isEmpty()){
                // remove the last space
                return builder.toString().substring(0, builder.toString().length() - 1);
            }
            return this.value;
        } else {
            return this.value;
        }
    }

    @Override
    public String toString(){
        return this.getValue();
    }

    public boolean isLiteral() {
        return true;
    }

    public boolean isAction() {
        return false;
    }

    @Override
    public boolean equals(Object other){

        if(other == this) return true;

        if(other instanceof LiteralParameter){
            LiteralParameter otherLiteralParameter = (LiteralParameter) other;
            if(this.isRegex && !otherLiteralParameter.isRegex){
                return this.value.replaceAll("\"", "")
                        .contains(otherLiteralParameter.value.replaceAll("\"", ""));
            } else if(otherLiteralParameter.isRegex && !this.isRegex){
                return otherLiteralParameter.value.replaceAll("\"", "")
                        .contains(this.value.replaceAll("\"", ""));
            }

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
        return false;
    }
}
