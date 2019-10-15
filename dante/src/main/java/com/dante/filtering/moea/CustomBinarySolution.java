package com.dante.filtering.moea;

import org.uma.jmetal.problem.BinaryProblem;
import org.uma.jmetal.solution.BinarySolution;
import org.uma.jmetal.solution.Solution;
import org.uma.jmetal.solution.impl.AbstractGenericSolution;
import org.uma.jmetal.util.binarySet.BinarySet;

import java.util.*;

public class CustomBinarySolution extends AbstractGenericSolution<BinarySet, BinaryProblem> implements BinarySolution {

    public CustomBinarySolution(BinaryProblem problem) {
        super(problem);
        this.initializeBinaryVariables();
        this.initializeObjectiveValues();
    }

    public CustomBinarySolution(CustomBinarySolution solution) {
        super(solution.problem);

        int i;
        for(i = 0; i < this.problem.getNumberOfVariables(); ++i) {
            this.setVariableValue(i, (BinarySet)(solution.getVariableValue(i)).clone());
        }

        for(i = 0; i < this.problem.getNumberOfObjectives(); ++i) {
            this.setObjective(i, solution.getObjective(i));
        }

        this.attributes = new HashMap(solution.attributes);
    }

    private void initializeBinaryVariables() {
        for(int i = 0; i < this.problem.getNumberOfVariables(); ++i) {
            this.setVariableValue(i, this.createNewBitSet(this.problem.getNumberOfBits(i)));
        }
    }

    private BinarySet createNewBitSet(int numberOfBits) {
        BinarySet bitSet = new BinarySet(numberOfBits);

        for(int i = 0; i < numberOfBits; ++i) {
            double rnd = this.randomGenerator.nextDouble();
            if (rnd < 0.5D) {
                bitSet.set(i);
            } else {
                bitSet.clear(i);
            }
        }

        return bitSet;
    }


    @Override
    public int getNumberOfBits(int index) {
        return this.getVariableValue(index).getBinarySetLength();
    }

    @Override
    public int getTotalNumberOfBits() {
        int sum = 0;

        for(int i = 0; i < this.getNumberOfVariables(); ++i) {
            sum += this.getVariableValue(i).getBinarySetLength();
        }

        return sum;
    }

    @Override
    public String getVariableValueString(int index) {
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < this.getVariableValue(index).getBinarySetLength(); ++i) {
            if (this.getVariableValue(index).get(i)) {
                builder.append("1");
            } else {
                builder.append("0");
            }
        }

        return builder.toString();
    }

    @Override
    public Solution<BinarySet> copy() {
        return new CustomBinarySolution(this);
    }

    @Override
    public Map<Object, Object> getAttributes() {
        return this.attributes;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < this.problem.getNumberOfVariables(); i++) {
            builder.append(this.getVariableValueString(i));
            if(i != this.problem.getNumberOfVariables() - 1) {
                builder.append("-");
            }
        }

        return builder.toString();
    }

    @Override
    public boolean equals(Object other) {

        if(!(other instanceof CustomBinarySolution)) {
            return false;
        }

        if(other == this) {
            return true;
        }

        CustomBinarySolution otherCustomBinarySolution = (CustomBinarySolution) other;
        return this.toString().equals(otherCustomBinarySolution.toString());
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.toString());
    }
}
