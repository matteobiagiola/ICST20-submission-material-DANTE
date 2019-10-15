package main;

import coverage.CoverageRangeWrapper;
import utils.Properties;
import utils.SetsUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Collectors;

public class CheckOverlappingCoverageObjectsTest {

    public static void main(String[] args) throws FileNotFoundException {


        BufferedReader reader = new BufferedReader(new FileReader(Properties.user_dir
                + "/src/main/resources/splittypie.js"));
        String script = reader.lines().collect(Collectors.joining("\n"));


        CoverageRangeWrapper range = new CoverageRangeWrapper("",42155,43882, 1);
        String functionUnderAnalysis = script.substring(range.getStartOffset(), range.getEndOffset() + 1);


        LinkedList<Integer> indexesOfFunctionKeywords = new LinkedList<>();
        int startIndex = 0;
        int index = functionUnderAnalysis.indexOf("function", startIndex);
        while(index != -1) {
            indexesOfFunctionKeywords.add(index);
            startIndex = index + "function".length();
            index = functionUnderAnalysis.indexOf("function", startIndex);
        }

        if(indexesOfFunctionKeywords.isEmpty()) {
            return;
        }

        indexesOfFunctionKeywords.removeFirst();
        System.out.println("Indexes: " + indexesOfFunctionKeywords);
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
                indexCloseBrace = indexesCloseBraces.getLast();
            }
            String functionSnippet = functionUnderAnalysis.substring(snippetIndex, snippetIndex + indexCloseBrace + 1);
            CoverageRangeWrapper functionCoverageRange = new CoverageRangeWrapper("", snippetIndex,
                    snippetIndex + indexCloseBrace + 1, 1);
            charactersFunctions.addAll(functionCoverageRange.flattenRangeWithOffset(range.getStartOffset()));
            System.out.println("----- Start function snippet");
            System.out.println(functionSnippet);
            System.out.println("----- End function snippet");
        }
        System.out.println();

        System.out.println("Functions: " + charactersFunctions);
        List<CoverageRangeWrapper> coveredCoverageRanges = new LinkedList<>();
        List<Integer> charactersDifference = new LinkedList<>(SetsUtils
                .setsDifference(new LinkedHashSet<>(range.flattenRange()), charactersFunctions));
        System.out.println("Diff: " + charactersDifference);
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

        System.out.println();
        for (CoverageRangeWrapper coveredCoverageRange : coveredCoverageRanges) {
            System.out.println("Coverage range covered: " + coveredCoverageRange);
            String functionSnippetCovered = script.substring(coveredCoverageRange.getStartOffset(), coveredCoverageRange.getEndOffset());
            System.out.println("+++++ Start function snippet");
            System.out.println(functionSnippetCovered);
            System.out.println("+++++ End function snippet");
        }

    }
}
