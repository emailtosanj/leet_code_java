package com.leetcode.hashing;

import java.util.*;


public class LargestUniqueNumber {

    public int largestUniqueNumber(int[] nums) {

        Set<Integer> st = new HashSet<>();
        Set<Integer> dupe = new HashSet<>();

        // by default add it dupe at the first place

        for (int num: nums)
        {
            boolean isElementAdded = dupe.add(num);
            if(!isElementAdded)
            {
                st.remove(num);
            }
            else {
                st.add(num);
            }
        }

        if(st.isEmpty())
        {
            return -1;
        }
        else {
            List<Integer> lst = new ArrayList<>(st.stream().toList());
            Collections.sort(lst);
            return st.stream().sorted().toList().get(st.size()-1);
        }

    }
}

// 10:15 - 10:44