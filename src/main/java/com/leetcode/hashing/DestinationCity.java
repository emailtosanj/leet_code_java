package com.leetcode.hashing;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DestinationCity {
    public String destCity(List<List<String>> paths) {


        Map<String, String> map = paths.stream().map(l ->
        { Map<String, String> mp = new HashMap<>();
            mp.put(l.get(0), l.get(1));
            return mp;
        }).flatMap(s -> s.entrySet().stream()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));


        return map.values().stream().filter(s -> !map.containsKey(s)).toList().getFirst();


    }
}
