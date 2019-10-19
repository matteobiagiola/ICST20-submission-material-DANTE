package com.dante.comparison;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Techniques {

    public enum Technique {
        DANTE ("dante"),
        CRAWLJAX ("crawljax"),
        ATUSA ("atusa");

        private String technique;

        Technique(String technique){
            this.technique = technique;
        }

        public String getTechniqueName(){
            return this.technique;
        }
    }

    public static boolean isTechnique(String technique){
        return Arrays.stream(Technique.values())
                .map(Technique::getTechniqueName)
                .collect(Collectors.toList())
                .contains(technique);
    }

    public static List<String> getValues(){
        return Arrays.stream(Technique.values())
                .map(Technique::getTechniqueName)
                .collect(Collectors.toList());
    }
}

