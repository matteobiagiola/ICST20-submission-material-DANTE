package coverage;

import utils.Properties;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class PercentageCovered {

    private final String scriptName;
    private List<Line> scriptLines;
    private final int totalNumberOfLines;
    private final double percentage;
    private TreeSet<Integer> allCharactersCovered;
    private final int totalNumberOfCharacters;

    public PercentageCovered(String scriptName,
                             TreeSet<Integer> allCharactersCovered,
                             int stringSourceLength,
                             List<Line> scriptLines) {

        this.scriptName = scriptName;
        this.totalNumberOfLines = scriptLines.size();
        this.scriptLines = new LinkedList<>(scriptLines);

        this.allCharactersCovered = new TreeSet<>(allCharactersCovered);

        int numberOfLinesCovered = -1;

        if(Properties.getInstance().getProperty("coverage_type").equals("line")) {
            for (Line scriptLine : this.scriptLines) {
                if(scriptLine.isLineCovered(allCharactersCovered).equals(Line.Covered.YES)) {
                    numberOfLinesCovered++;
                }
            }
        }

        int numberOfCharacters = -1;
        for (Line scriptLine : this.scriptLines) {
            numberOfCharacters += scriptLine.getCharactersRange().flattenRange().size();
        }

        if(numberOfCharacters == -1) {
            this.totalNumberOfCharacters = stringSourceLength;
        } else {
            this.totalNumberOfCharacters = numberOfCharacters;
        }


        if(Properties.getInstance().getProperty("coverage_type").equals("bytes")) {
            this.percentage = round((((double) allCharactersCovered.size() * 100)
                    / (double) this.totalNumberOfCharacters), 2);
        } else if(Properties.getInstance().getProperty("coverage_type").equals("line")) {
            this.percentage = round((((double) numberOfLinesCovered * 100)
                    / (double) this.totalNumberOfLines), 2);
        } else {
            throw new RuntimeException("Unknown coverage type value: "
                    + Properties.getInstance().getProperty("coverage_type"));
        }
    }

    public String getScriptName() {
        return scriptName;
    }

    public double getPercentage() {
        return percentage;
    }

    public TreeSet<Integer> getAllCharactersCovered(){
        return new TreeSet<>(allCharactersCovered);
    }

    public List<Line> getCoveredLines() {
        return new LinkedList<>(scriptLines).stream()
                .filter(line -> line.getCovered().equals(Line.Covered.YES))
                .collect(Collectors.toList());
    }

    public int getTotalNumberOfLines() {
        return totalNumberOfLines;
    }

    public int getTotalNumberOfCharacters() {
        return this.totalNumberOfCharacters;
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
