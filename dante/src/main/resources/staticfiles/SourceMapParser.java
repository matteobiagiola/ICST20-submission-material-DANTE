package coverage;

import com.atlassian.sourcemap.SourceMap;
import com.atlassian.sourcemap.SourceMapImpl;
import utils.Properties;
import utils.SessionProvider;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SourceMapParser {

    private SourceMap sourceMap;
    private String srcCodeFolder;
    private List<String> srcFilesToExcludeCodeCoverage;

    public SourceMapParser() {
        String sourcemapURL = Properties.getInstance().getProperty("sourcemap_url");
        try {
            String sourceMapString = SessionProvider.getInstance().getResourceFromApp(new URL(sourcemapURL));
            this.sourceMap = new SourceMapImpl(sourceMapString);

            String sourceMapUrl = Properties.getInstance().getProperty("sourcemap_url");

            this.srcCodeFolder = Properties.getInstance().getProperty("src_code_folder");
            if(this.srcCodeFolder.isEmpty())
                throw new IllegalArgumentException("Don't known which src files to consider during code coverage when" +
                        " parsing the sourcemap file " + sourceMapUrl);
            String[] srcCodeFilesToExclude = Properties.getInstance().getProperty("src_code_files_to_exclude").split(":");
            this.srcFilesToExcludeCodeCoverage = Arrays.asList(srcCodeFilesToExclude);
            if(this.srcFilesToExcludeCodeCoverage.size() == 1 && this.srcFilesToExcludeCodeCoverage.get(0).isEmpty()) {
                this.srcFilesToExcludeCodeCoverage.remove(0);
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public Set<LineRange> getLineRanges() {
        Set<LineRange> result = new HashSet<>();

        Map<String, Set<Integer>> mapSrcFileNameGeneratedLines = new HashMap<>();
        this.sourceMap.eachMapping(mapping -> {
            String sourceFileName = mapping.getSourceFileName();
            sourceFileName = sourceFileName.replace("webpack:///", "");
            if(sourceFileName.startsWith("./" + this.srcCodeFolder)
                    && !anyElementInListIsSubstringOf(sourceFileName, this.srcFilesToExcludeCodeCoverage)
                    && isJsSourceFile(sourceFileName)) {
                Set<Integer> lines = mapSrcFileNameGeneratedLines.get(sourceFileName);
                if(lines == null) {
                    lines = new HashSet<>();
                }
                lines.add(mapping.getGeneratedLine());
                mapSrcFileNameGeneratedLines.put(sourceFileName, lines);
            }
        });
        System.out.println("Src files: " + mapSrcFileNameGeneratedLines.keySet().size());
        for (String srcFileName : mapSrcFileNameGeneratedLines.keySet()) {
            Set<Integer> lines = mapSrcFileNameGeneratedLines.get(srcFileName);
            int min = lines.stream().mapToInt(Integer::new).min().orElseThrow(RuntimeException::new);
            int max = lines.stream().mapToInt(Integer::new).max().orElseThrow(RuntimeException::new);
            LineRange lineRange = new LineRange(min, max);
            result.add(lineRange);
        }

        return result;
    }

    private boolean anyElementInListIsSubstringOf(String string, List<String> list) {
        for (String stringInList : list) {
            if(string.contains(stringInList)) {
                return true;
            }
        }
        return false;
    }

    private boolean isJsSourceFile(String srcFileName) {
        return srcFileName.endsWith(".js") || srcFileName.endsWith(".jsx") || srcFileName.endsWith(".ts");
    }
}
