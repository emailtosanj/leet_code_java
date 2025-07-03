package com.leetcode.hashing;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> st = ConcurrentHashMap.newKeySet();
        for(int num: nums)
        {
            if(!st.add(num))
            {
                return true;
            }
        }
        return false;
    }

}
