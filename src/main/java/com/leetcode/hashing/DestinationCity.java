package com.leetcode.hashing;


import java.util.*;
import java.util.stream.Collectors;


public class DestinationCity {
    public String destCity(List<List<String>> paths) {

        Set<String> st1 = paths.stream().parallel().map(List::getFirst).collect(Collectors.toSet());

        return paths.stream().parallel().filter(l -> !st1.contains(l.getLast())).map(List::getLast).toList().getLast();

    }
}
