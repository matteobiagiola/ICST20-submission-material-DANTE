package main;

import com.atlassian.sourcemap.SourceMap;
import com.atlassian.sourcemap.SourceMapImpl;
import coverage.LineRange;
import utils.Properties;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class SourceMapTest {

    public static void main(String[] args) throws FileNotFoundException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(
                Properties.user_dir + "/src/main/resources/sourcemap.js.map"));
        String sourceMapFile = bufferedReader.lines().collect(Collectors.joining("\n"));

        SourceMap sourceMap = new SourceMapImpl(sourceMapFile);
        Map<String, Set<Integer>> mapSrcFileNameGeneratedLines = new HashMap<>();
        Map<String, LineRange> mapSrcFileNameRange = new HashMap<>();
        sourceMap.eachMapping(mapping -> {
            String sourceFileName = mapping.getSourceFileName();
            sourceFileName = sourceFileName.replace("webpack:///", "");
            if(sourceFileName.startsWith(Properties.getInstance().srcFolderCodeCoverage)
                    && !anyElementInListIsSubstringOf(sourceFileName, Properties.getInstance().srcFilesToExcludeCodeCoverage)
                    && isJsSourceFile(sourceFileName)) {
                Set<Integer> lines = mapSrcFileNameGeneratedLines.get(sourceFileName);
                if(lines == null) {
                    lines = new HashSet<>();
                }
                lines.add(mapping.getGeneratedLine());
                mapSrcFileNameGeneratedLines.put(sourceFileName, lines);
            }
        });
        System.out.println();
        System.out.println("Src files: " + mapSrcFileNameGeneratedLines.keySet().size());
        for (String srcFileName : mapSrcFileNameGeneratedLines.keySet()) {
            Set<Integer> lines = mapSrcFileNameGeneratedLines.get(srcFileName);
            int min = lines.stream().mapToInt(Integer::new).min().orElseThrow(RuntimeException::new);
            int max = lines.stream().mapToInt(Integer::new).max().orElseThrow(RuntimeException::new);
            LineRange lineRange = new LineRange(min, max);
            mapSrcFileNameRange.put(srcFileName, lineRange);
            System.out.println("Src file name: " + srcFileName + ", line range: " + lineRange);
        }

    }

    private static boolean anyElementInListIsSubstringOf(String string, List<String> list) {
        for (String stringInList : list) {
            if(string.contains(stringInList)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isJsSourceFile(String srcFileName) {
        return srcFileName.endsWith(".js") || srcFileName.endsWith(".jsx") || srcFileName.endsWith(".ts");
    }
}
