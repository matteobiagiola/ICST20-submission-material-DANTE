package com.dante.coverage;

import java.util.Objects;

public class CovUnit {

    private final int unit;
    private final String scriptName;

    public CovUnit(int unit, String scriptName) {
        this.unit = unit;
        this.scriptName = scriptName;
    }

    public String getScriptName() {
        return scriptName;
    }

    public int getUnit() {
        return unit;
    }

    @Override
    public boolean equals(Object other){
        if(other == this)
            return true;

        if(other instanceof CovUnit){
            CovUnit otherCovUnit = (CovUnit) other;
            return Objects.equals(this.scriptName, otherCovUnit.scriptName) &&
                    Objects.equals(this.unit, otherCovUnit.unit);
        }

        return false;
    }

    // this is what makes a unit unique: script name + unit number
    @Override
    public int hashCode(){
        return Objects.hash(this.scriptName + "-" + this.unit);
    }
}
