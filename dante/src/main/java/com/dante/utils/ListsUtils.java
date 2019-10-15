package com.dante.utils;

import java.util.LinkedList;
import java.util.List;

public class ListsUtils {

    /**
     * @return computes the difference between a and b = a - b
     * */
    public static <T> List<T> listsDifference(List<T> a, List<T> b){
        List<T> result = new LinkedList<>(a);
        result.removeAll(b);
        return result;
    }
}
