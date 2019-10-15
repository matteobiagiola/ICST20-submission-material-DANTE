package com.dante.filtering.moea;

public class Dependency {

    private final int source;
    private final int target;
    private final boolean present;
    private int missingIndirect = -1;

    public Dependency(int source, int target, boolean present) {
        this.source = source;
        this.target= target;
        this.present = present;
    }

    public Dependency(int source, int target, boolean present, int missingIndirect) {
        this.source = source;
        this.target= target;
        this.present = present;
        if(missingIndirect == 0 || missingIndirect == 1)
            this.missingIndirect = missingIndirect;
        else
            throw new IllegalArgumentException("Missing indirect can be either 0 or 1");
    }

    public int getSource() {
        return source;
    }

    public int getTarget() {
        return target;
    }

    public boolean isPresent() {
        return present;
    }

    public void setMissingIndirect(int missingIndirect) {
        this.missingIndirect = missingIndirect;
    }

    public boolean isMissingIndirect() {
        if(missingIndirect == -1)
            throw new RuntimeException("Missing indirect not set");
        return missingIndirect == 1;
    }


    @Override
    public String toString() {
        if(!present)
            return source + "->" + target + " (in: 0), (missingIndirect: " + (missingIndirect == 1 ? "1" : "0") + ")" ;
        return source + "->" + target + " (in: 1)";

    }
}
