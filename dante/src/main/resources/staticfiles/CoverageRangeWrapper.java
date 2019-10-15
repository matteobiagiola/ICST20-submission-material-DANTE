package coverage;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class CoverageRangeWrapper {

    private final String functionName;
    private final Integer startOffset;
    private final Integer endOffset;
    private final Integer count;


    public CoverageRangeWrapper(String functionName, Integer startOffset,
                                Integer endOffset, Integer count) {
        this.functionName = functionName;
        this.startOffset = startOffset;
        this.endOffset = endOffset;
        this.count = count;
    }

    /**
     * JavaScript script source offset for the range start.
     */
    public Integer getStartOffset() {
        return startOffset;
    }

    /**
     * JavaScript script source offset for the range end.
     */
    public Integer getEndOffset() {
        return endOffset;
    }


    /**
     * Collected execution count of the source range.
     */
    public Integer getCount() {
        return count;
    }

    public String getFunctionName() { return functionName; }


    @Override
    public int hashCode() {
        return Objects.hash(functionName, startOffset, endOffset, count);
    }

    @Override
    public boolean equals(Object otherObject){
        if (otherObject == this) {
            return true;
        }
        if(!(otherObject instanceof CoverageRangeWrapper)){
            return false;
        }
        CoverageRangeWrapper otherCoverageRangeWrapper = (CoverageRangeWrapper) otherObject;
        return this.startOffset.equals(otherCoverageRangeWrapper.startOffset)
                && this.endOffset.equals(otherCoverageRangeWrapper.endOffset)
                && this.count.equals(otherCoverageRangeWrapper.count)
                && this.functionName.equals(otherCoverageRangeWrapper.functionName);
    }

    @Override
    public String toString() {
        return functionName + " [" + this.startOffset + ","
                + this.endOffset + "]: " + this.count;
    }

    public List<Integer> flattenRangeEndsExcluded() {
        if(this.startOffset.equals(this.endOffset)) {
            return Arrays.asList(this.startOffset);
        }
        List<Integer> result = new LinkedList<>();
        for (int i = this.startOffset + 1; i < this.endOffset; i++) {
            result.add(i);
        }
        return result;
    }

    public List<Integer> flattenRangeWithOffset(int offset) {
        List<Integer> result = new LinkedList<>();
        for (int i = this.startOffset; i <= this.endOffset; i++) {
            result.add(offset + i);
        }
        return result;
    }

    public List<Integer> flattenRange() {
        List<Integer> result = new LinkedList<>();
        for (int i = this.startOffset; i <= this.endOffset; i++) {
            result.add(i);
        }
        return result;
    }

    public List<Integer> flattenRange(int endOffset) {
        List<Integer> result = new LinkedList<>();
        for (int i = this.startOffset; i <= endOffset; i++) {
            result.add(i);
        }
        return result;
    }

    public List<Integer> flattenRangeEndExcluded() {
        if(this.startOffset.equals(this.endOffset)) {
            return Arrays.asList(this.startOffset);
        }
        List<Integer> result = new LinkedList<>();
        for (int i = this.startOffset; i < this.endOffset; i++) {
            result.add(i);
        }
        return result;
    }

}
