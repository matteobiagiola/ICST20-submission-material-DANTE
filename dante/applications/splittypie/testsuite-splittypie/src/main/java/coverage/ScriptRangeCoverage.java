package coverage;

import utils.SetsUtils;

import java.util.*;

public class ScriptRangeCoverage {

    private final String scriptName;
    private Set<CoverageRangeWrapper> rangesCovered;
    private String scriptSource;
    private List<Line> scriptLines = new LinkedList<>();
    private Set<Integer> lineRangesFlatten = new LinkedHashSet<>();
    private int scriptSourceLength;

    private TreeSet<Integer> allCharacters = new TreeSet<>();

    public ScriptRangeCoverage(String scriptName, String scriptSource, Set<LineRange> lineRanges) {
        if(scriptSource == null)
            throw new IllegalArgumentException("Script source of "
                    + scriptName + " cannot be null!");
        this.scriptName = scriptName;
        this.rangesCovered = new LinkedHashSet<>();
        this.scriptSource = scriptSource;

        for (LineRange lineRange : lineRanges) {
            lineRangesFlatten.addAll(lineRange.flattenRange());
        }

        this.buildScriptLine();
    }

    private void buildScriptLine() {

        List<String> lines = Arrays.asList(this.scriptSource.split("\n"));

        int initialStartOffset = 1;
        int startOffset = initialStartOffset;
        int endOffset = 0;
        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            endOffset = startOffset + line.length();
            CoverageRangeWrapper charactersRange
                    = new CoverageRangeWrapper("main", startOffset,
                    endOffset, 0);
            if(lineRangesFlatten.contains(i + 1) || lineRangesFlatten.isEmpty()) {
                this.scriptLines.add(new Line(i + 1, line, charactersRange));
                this.allCharacters.addAll(charactersRange.flattenRange());
            }
            startOffset = endOffset + 1;
        }

        if(startOffset == initialStartOffset && endOffset == 0)
            throw new RuntimeException("No line in script " + scriptName);

        int totNumOfBytes = endOffset - initialStartOffset;
        int diff = Math.abs(totNumOfBytes - this.scriptSource.length());
        this.scriptSourceLength = this.scriptSource.length();

        if(diff > 1) {
            throw new IllegalStateException("Tot num of bytes in all lines of script "
                    + this.scriptName + " (" + totNumOfBytes + ") is different from tot num of bytes "
                    + "of script as string (" + this.scriptSource.length() + ")");
        }
    }

    public int getScriptSourceLength() {
        return scriptSourceLength;
    }

    public boolean canAddRange(CoverageRangeWrapper range) {
        return this.allCharacters.containsAll(range.flattenRangeEndsExcluded());
    }

    public Set<CoverageRangeWrapper> getOverlappingCoverageObjects(CoverageRangeWrapper range) {

        Set<CoverageRangeWrapper> result = new HashSet<>();

        String functionUnderAnalysis;
        try {
            try {
                functionUnderAnalysis = this.scriptSource.substring(range.getStartOffset(), range.getEndOffset() + 1);
            } catch (IndexOutOfBoundsException ex) {
                functionUnderAnalysis = this.scriptSource.substring(range.getStartOffset(), range.getEndOffset());
            }
        } catch (IndexOutOfBoundsException ex) {
            functionUnderAnalysis = this.scriptSource.substring(range.getStartOffset(), range.getEndOffset() - 1);
        }

        LinkedList<Integer> indexesOfFunctionKeywords = new LinkedList<>();
        int startIndex = 0;
        int index = functionUnderAnalysis.indexOf("function", startIndex);
        while(index != -1) {
            indexesOfFunctionKeywords.add(index);
            startIndex = index + "function".length();
            index = functionUnderAnalysis.indexOf("function", startIndex);
        }

        if(indexesOfFunctionKeywords.isEmpty()) {
            return result;
        }

        indexesOfFunctionKeywords.removeFirst();
        TreeSet<Integer> charactersFunctions = new TreeSet<>();
        for (int i = 0; i < indexesOfFunctionKeywords.size(); i++) {
            int snippetIndex = indexesOfFunctionKeywords.get(i);
            String snippet = functionUnderAnalysis.substring(snippetIndex);
            int indexCloseBrace = -1;
            LinkedList<Integer> indexesOpenBraces = new LinkedList<>();
            LinkedList<Integer> indexesCloseBraces = new LinkedList<>();
            char[] chars = snippet.toCharArray();
            for (int j = 0; j < chars.length; j++) {
                char c = chars[j];
                if(c == '{') {
                    indexesOpenBraces.add(j);
                } else if(c == '}') {
                    indexesCloseBraces.add(j);
                    if(indexesOpenBraces.size() == 1) {
                        indexCloseBrace = j;
                        break;
                    }
                }
            }
            if(indexCloseBrace == -1) {
                try {
                    indexCloseBrace = indexesCloseBraces.getLast();
                } catch (NoSuchElementException ex) {
                    // happens when # characters of actual file != # characters in file given by chrome
                    // when this happen approximate the close brace position with the length of the char array
                    indexCloseBrace = chars.length;
//                    System.out.println("Snippet: " + snippet);
//                    System.out.println("Function under analysis: " + functionUnderAnalysis);
//                    String approx = this.scriptSource.substring(snippetIndex, snippetIndex + indexCloseBrace + 1);
//                    System.out.println("Approx: " + approx);
                }
            }
            CoverageRangeWrapper functionCoverageRange = new CoverageRangeWrapper("", snippetIndex,
                    snippetIndex + indexCloseBrace + 1, range.getCount());
            charactersFunctions.addAll(functionCoverageRange.flattenRangeWithOffset(range.getStartOffset()));
        }

        List<CoverageRangeWrapper> coveredCoverageRanges = new LinkedList<>();
        List<Integer> charactersDifference = new LinkedList<>(SetsUtils
                .setsDifference(new LinkedHashSet<>(range.flattenRange()), charactersFunctions));
        int rangeStartOffset = -1;
        int rangeEndOffset;
        for (int i = 0; i < charactersDifference.size() - 1; i++) {
            Integer firstCharacter = charactersDifference.get(i);
            if(rangeStartOffset == -1) {
                rangeStartOffset = firstCharacter;
            }
            Integer secondCharacter = charactersDifference.get(i + 1);
            int diff = Math.abs(firstCharacter - secondCharacter);
            if(diff > 1) {
                rangeEndOffset = firstCharacter;
                coveredCoverageRanges.add(new CoverageRangeWrapper(range.getFunctionName(), rangeStartOffset,
                        rangeEndOffset, 1));
                rangeStartOffset = -1;
            }
        }

        if(!charactersDifference.isEmpty()) {
            rangeEndOffset = charactersDifference.get(charactersDifference.size() - 1);
            coveredCoverageRanges.add(new CoverageRangeWrapper(range.getFunctionName(), rangeStartOffset,
                    rangeEndOffset, 1));
        }

        result.addAll(coveredCoverageRanges);

        return result;
    }

    public void addRange(CoverageRangeWrapper range) {
        this.rangesCovered.add(range);
    }

    public Set<CoverageRangeWrapper> getRangesCovered() {
        return new LinkedHashSet<>(rangesCovered);
    }

    public List<Line> getScriptLines() {
        return new LinkedList<>(scriptLines);
    }
}
