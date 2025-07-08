package com.leetcode.arrays;

import java.util.Arrays;

public class ElementsWithMaximumFrequency {
    public int maxFrequencyElements(int[] nums) {

        int maxFreq = 0;
        int[] frq = new int[101];
        for (int num : nums) {
            frq[num]++;
            maxFreq = Math.max(maxFreq, frq[num]);

        }

        int sum = 0;
        for (int num : nums) {
            if (frq[num] == maxFreq) {
                sum++;
            }
        }

        return sum;
    }


}
