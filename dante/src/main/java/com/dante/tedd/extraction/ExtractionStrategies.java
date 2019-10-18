package com.dante.tedd.extraction;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExtractionStrategies {

    public enum Strategy {
        ORIGINAL_ORDER ("original_order"),
        SUB_USE ("sub_use"),
        COVERAGE_DRIVEN ("coverage_driven"),
        BIOBJECTIVE ("biobjective");

        private String strategy;

        Strategy(String strategy){
            this.strategy = strategy;
        }

        public String getStrategyName(){
            return this.strategy;
        }
    }

    public static boolean isExtractionStrategy(String strategy){
        return Arrays.stream(Strategy.values())
                .map(Strategy::getStrategyName)
                .collect(Collectors.toList())
                .contains(strategy);
    }

    public static List<String> getValues(){
        return Arrays.stream(Strategy.values())
                .map(Strategy::getStrategyName)
                .collect(Collectors.toList());
    }
}

