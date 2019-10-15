package main;

import utils.Properties;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.stream.Collectors;

public class CountBytes {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(Properties.user_dir + "/coverage-reports/test-suite-report.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));

        String lines = reader.lines().collect(Collectors.joining("\n"));
        if(lines.split("\n").length != 2) {
            throw new RuntimeException("Error: " + lines.split("\n").length);
        }

        String line = lines.split("\n")[0];
        String[] lineParsed = line.split("<>");
        String charactersList = lineParsed[2];
        System.out.println(charactersList
                .replace("[","").replace("]", "").split(",").length);
    }
}
