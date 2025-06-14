package com.leetcode.hashing;

import java.util.HashSet;
import java.util.Set;

public class CountingElements {

    public int countElements(int[] arr) {

        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++)
        {
            hashSet.add(arr[i]);
        }

        int cnt = 0;
        for ( int i : arr)
        {
            if (hashSet.contains(i+1))
            {
                cnt += 1;
            }
        }
        return cnt;

    }

}
