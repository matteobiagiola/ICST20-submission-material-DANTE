package coverage;

import utils.SetsUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Line {

    private final String line;
    private final int lineNumber;
    private static List<String> partiallyCoveredLinesToIgnore
            = Arrays.asList("}","};","})",");","});","}));");
    private final CoverageRangeWrapper charactersRange;
    private CoverageRangeWrapper rangePartiallyCoveringLine;
    private Covered covered = Covered.NO;

    public enum Covered {
        YES, NO, PARTIALLY, IGNORE
    }

    public Line(int lineNumber, String line, CoverageRangeWrapper charactersRange) {
        this.lineNumber = lineNumber;
        this.line = line;
        this.charactersRange = charactersRange;
    }

    public CoverageRangeWrapper getCharactersRange() {
        return charactersRange;
    }

    public boolean isComment() {
        return this.line.startsWith("//");
    }

    public Covered isLineCovered(TreeSet<Integer> allCharactersCovered) {

        Set<Integer> intersection = SetsUtils.intersection(allCharactersCovered,
                new HashSet<>(this.charactersRange.flattenRangeEndsExcluded()));

        if(intersection.size() > 1 && !isSpecialCharacter(this.line)) {
            this.covered = Covered.YES;
            return this.covered;
        }

//        // -1 in the end offset (flattenRangeEndExcluded) is because character range is 1 based
//        if(allCharactersCovered.containsAll(this.charactersRange.flattenRangeEndExcluded())
//                && !isSpecialCharacter(this.line)) {
//            this.covered = Covered.YES;
//            return this.covered;
//        }
//        else if(isSpecialCharacter(this.line)) {
//            this.covered = Covered.IGNORE;
//            return this.covered;
//        } else if((scriptCharactersCovered.contains(this.charactersRange.getStartOffset())
//                || scriptCharactersCovered.contains(this.charactersRange.getEndOffset() - 1))
//                && !this.isTernaryExpression()) {
//            this.covered = Covered.YES;
//            return this.covered;
//        } else if(scriptCharactersCovered.contains(this.charactersRange.getStartOffset())) {
//            this.covered = Covered.YES;
//            return this.covered;
//        } else if(scriptCharactersCovered.contains(this.charactersRange.getEndOffset() - 1)) {
//            this.covered = Covered.YES;
//            return this.covered;
//        }

        // -1 in the end offset (flattenRangeEndExcluded) is because character range is 1 based
//        if(scriptCharactersCovered.containsAll(this.charactersRange.flattenRangeEndExcluded())
//                && !isSpecialCharacter(this.line)) {
//            this.covered = Covered.YES;
//            return this.covered;
//        } else if(scriptCharactersCovered.contains(this.charactersRange.getStartOffset())
//                && scriptCharactersCovered.contains(this.charactersRange.getEndOffset() - 1)
//                && !isSpecialCharacter(this.line)) {
//            throw new UnsupportedOperationException("Bounds of this line " + this.charactersRange
//                    + " are covered but not all the characters inside these bounds. Line: "
//                    + line);
//        } else if(isSpecialCharacter(this.line)) {
//            this.covered = Covered.IGNORE;
//            return this.covered;
//        } else if((scriptCharactersCovered.contains(this.charactersRange.getStartOffset())
//                || scriptCharactersCovered.contains(this.charactersRange.getEndOffset() - 1))
//                && !this.isTernaryExpression()) {
//            // we consider the line as covered
//            this.covered = Covered.YES;
//            return this.covered;
//        } else if(scriptCharactersCovered.contains(this.charactersRange.getStartOffset())) {
//            int endOffset;
//            int count = 1;
//            for (Integer characterCovered : scriptCharactersCovered) {
//                if(characterCovered > this.charactersRange.getStartOffset()
//                        && characterCovered < this.charactersRange.getEndOffset()) {
//                    count++;
//                } else if(characterCovered >= this.charactersRange.getEndOffset()) {
//                    break;
//                }
//            }
//            endOffset = this.charactersRange.getStartOffset() + count;
//            this.rangePartiallyCoveringLine
//                    = new CoverageRangeWrapper(this.charactersRange.getStartOffset(), endOffset, 0);
//            this.covered = Covered.PARTIALLY;
//            return this.covered;
//        } else if(scriptCharactersCovered.contains(this.charactersRange.getEndOffset() - 1)) {
//            int startOffset;
//            int count = 1;
//            Iterator<Integer> it = scriptCharactersCovered.descendingIterator();
//            while(it.hasNext()) {
//                int characterCovered = it.next();
//                if(characterCovered < this.charactersRange.getEndOffset()
//                        && characterCovered >= this.charactersRange.getStartOffset()) {
//                    count++;
//                } else if(characterCovered < this.charactersRange.getStartOffset()) {
//                    break;
//                }
//            }
//            startOffset = this.charactersRange.getEndOffset() - count;
//            this.rangePartiallyCoveringLine
//                    = new CoverageRangeWrapper(startOffset, this.charactersRange.getEndOffset(), 0);
//            this.covered = Covered.PARTIALLY;
//            return this.covered;
//        }

        return this.covered;
    }

    public String getLine() {
        return line;
    }

    public Covered getCovered() {
        return this.covered;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public Optional<CoverageRangeWrapper> getRangePartiallyCoveringLine() {
        if(rangePartiallyCoveringLine == null) {
            return Optional.empty();
        }
        return Optional.of(rangePartiallyCoveringLine);
    }

    @Override
    public String toString() {
        if(this.getCovered().equals(Covered.YES)) {
//            return this.lineNumber + "Y " + this.getLine() + "\n"; // debug
            return String.valueOf(this.lineNumber);
        } else if(this.getCovered().equals(Covered.NO)) {
            return this.lineNumber + "N"; // debug
        } else if(this.getCovered().equals(Covered.PARTIALLY)) {
            Optional<CoverageRangeWrapper> rangePartiallyCoveringLine
                    = this.getRangePartiallyCoveringLine();
            if(rangePartiallyCoveringLine.isPresent()) {
                return this.lineNumber + "P[" // debug
                        + rangePartiallyCoveringLine.get().getStartOffset()
                        + "-" + rangePartiallyCoveringLine.get().getEndOffset() + "]";
            }
            throw new RuntimeException("Covered is partial but the partial range was not assigned!");
        } else if (this.getCovered().equals(Covered.IGNORE)) {
            return this.lineNumber + "I"; // debug
        }
        throw new RuntimeException("Unknown value of covered: " + this.getCovered());
    }

    public boolean isTernaryExpression() {
        Pattern pattern = Pattern.compile("(.*)?(.*):(.*)");
        Matcher matcher = pattern.matcher(this.getLine());
        return matcher.find();
    }

    public static boolean isSpecialCharacter(String line) {
        for (String lineToIgnore : partiallyCoveredLinesToIgnore) {
            if(line.trim().equals(lineToIgnore)){
                return true;
            }
        }
        return false;
    }
}
