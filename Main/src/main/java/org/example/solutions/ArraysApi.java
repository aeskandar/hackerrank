package org.example.solutions;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArraysApi {

    public static Integer[] removeDuplicates(Integer[] array) {

        Set<Integer> distinct = new LinkedHashSet<>(Arrays.stream(array).toList());

        return distinct.toArray(new Integer[distinct.size()]);
    }

    public static Integer findSecondLargest(Integer[] array) {

       List<Integer> sorted = Arrays.stream(removeDuplicates(array)).sorted().map(x -> (Integer) x).toList();


        return sorted.get(sorted.size() - 2);
    }

    public static Integer findSecondLargestRudimentary(Integer[] array) {

        int max = Integer.MIN_VALUE;
        int secondMax = 0;

       for (int i = 0; i < array.length; i++) {
           if (array[i] > max) {
               secondMax = max;
               max = array[i];
           } else if (array[i] > secondMax && array[i] != max) {
               secondMax = array[i];
           }
       }

        return secondMax;
    }



}
