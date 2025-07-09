package com.leetcode.arrays;


import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueOcurrencesofElementsCheck {

    public boolean uniqueOccurrences(int[] arr) {

        Map<Integer, Long> map = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return (map.values().stream().distinct().count() == map.size());

    }

}
