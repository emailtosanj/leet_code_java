package com.leetcode.hashing;


import java.util.*;


public class DestinationCity {
    public String destCity(List<List<String>> paths) {

        Set<String> st = new HashSet<>();
        for(List<String> path : paths)
        {
                st.add(path.get(0));
        }

        for(List<String> path : paths)
        {
            String city = path.get(1);
            if(!st.contains(city))
            {
                return city;
            }
        }
        return null;
    }
}
