package coverage;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class LineRange {

    private final Integer startOffset;
    private final Integer endOffset;

    public LineRange(Integer startOffset, Integer endOffset) {
        this.startOffset = startOffset;
        this.endOffset = endOffset;
    }

    public Integer getStartOffset() {
        return startOffset;
    }

    public Integer getEndOffset() {
        return endOffset;
    }

    @Override
    public int hashCode() {
        return Objects.hash(startOffset, endOffset);
    }

    @Override
    public boolean equals(Object otherObject){
        if (otherObject == this) {
            return true;
        }
        if(!(otherObject instanceof LineRange)){
            return false;
        }
        LineRange otherCoverageRangeWrapper = (LineRange) otherObject;
        return this.startOffset.equals(otherCoverageRangeWrapper.getStartOffset())
                && this.endOffset.equals(otherCoverageRangeWrapper.getEndOffset());
    }

    @Override
    public String toString() {
        return "[" + this.startOffset + "," + this.endOffset + "]";
    }

    public List<Integer> flattenRange() {
        List<Integer> result = new LinkedList<>();
        for (int i = this.startOffset; i <= this.endOffset; i++) {
            result.add(i);
        }
        return result;
    }

    public List<Integer> flattenRangeEndExcluded() {
        List<Integer> result = new LinkedList<>();
        for (int i = this.startOffset; i < this.endOffset; i++) {
            result.add(i);
        }
        return result;
    }
}
