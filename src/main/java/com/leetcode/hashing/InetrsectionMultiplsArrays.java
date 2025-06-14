//Given a 2D integer array nums where nums[i] is a non-empty array of distinct positive integers,
//return the list of integers that are present in each array of nums sorted in ascending order.

package com.leetcode.hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class InetrsectionMultiplsArrays {
    public List<Integer> intersection(int[][] nums) {

        Map<Integer, Integer> map = new ConcurrentHashMap<>();

        for (int i =0; i< nums.length; i++)
        {
            int ar [] = nums[i];

            for (int j =0; j < ar.length; j++)
            {
                map.put(ar[j], map.getOrDefault(ar[j], 0) + 1);
            }
        }

        int elemCnt = nums.length;

        List<Integer> lst = new ArrayList<>();
        for (int key : map.keySet())
        {
            int val = map.get(key);
            if (val == elemCnt)
            {
                lst.add(key);
            }
        }
        Collections.sort(lst);
        return lst;
    }

}
