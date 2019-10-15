package com.dante;

import com.dante.utils.SetsUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CountRedundancyCrawljaxTests {

    public static void main(String[] args) {

        File methodsFile = new File("/Users/matteobiagiola/Desktop/meetings-dante/" +
                "26-03-19/methods-addressbook-fired-10-min.txt");

        List<String> methods = getMethods(methodsFile);

        Map<String, List<Integer>> mapMethodIdsCovered = new LinkedHashMap<>();

        for (String method : methods) {
            List<Integer> idsCovered = new ArrayList<>();
            String[] split = method.split("_");
            for (int i = 1; i < split.length; i++) {
                idsCovered.add(Integer.valueOf(split[i]));
            }
            mapMethodIdsCovered.put(method, idsCovered);
        }

        List<String> methodsWithAtLeastOneUniqueId = new ArrayList<>();
        List<String> methodsWithNoUniqueId = new ArrayList<>();
        for (String methodName : mapMethodIdsCovered.keySet()) {
            Set<Integer> methodIds = new HashSet<>(mapMethodIdsCovered.get(methodName));
            Set<Integer> union = new HashSet<>();
            for (String otherMethodName : mapMethodIdsCovered.keySet()) {
                if(!methodName.equals(otherMethodName)) {
                    union.addAll(mapMethodIdsCovered.get(otherMethodName));
                }
            }
            Set<Integer> difference = SetsUtils.setsDifference(methodIds, union);
            if(!difference.isEmpty()){
                methodsWithAtLeastOneUniqueId.add(methodName);
            } else {
                methodsWithNoUniqueId.add(methodName);
            }
        }

        System.out.println("Number of methods with at least one unique id: " + methodsWithAtLeastOneUniqueId.size());
        System.out.println("Number of methods: " + methods.size());
        System.out.println("Methods with no unique id (size): " + methodsWithNoUniqueId.size());
        System.out.println("Methods with no unique id: " + methodsWithNoUniqueId);
    }

    public static List<String> getMethods(File methodsFile) {
        List<String> result = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(methodsFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                result.add(line);
            }
            result.remove(0);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return result;
    }
}
