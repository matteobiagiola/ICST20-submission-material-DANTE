package com.dante.subjects;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ApplicationNames {

    public enum Name {

        ECOMMERCE("ecommerce"),
        PETCLINIC("petclinic"),
        DIMESHIFT("dimeshift"),
        SPLITTYPIE("splittypie"),
        RETROBOARD("retroboard"),
        PHOENIX("phoenix"),
        PAGEKIT("pagekit"),

        ADDRESSBOOK("addressbook");

        private String name;

        Name(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

    }

    public static boolean isApplicationName(String name) {
        return Arrays.stream(Name.values())
                .map(Name::getName)
                .collect(Collectors.toList())
                .contains(name);
    }

    public static List<String> getValues() {
        return Arrays.stream(Name.values())
                .map(Name::getName)
                .collect(Collectors.toList());
    }
}

