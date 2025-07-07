package com.leetcode.arrays;

import java.util.Arrays;

public class ElementsWithMaximumFrequency {
    public int maxFrequencyElements(int[] nums) {

        int[] frq = new int[101];
        for(int num : nums)
        {
            frq[num]++;
        }


        int[] cp_freq = Arrays.copyOf(frq, frq.length);


        Arrays.sort(cp_freq);
        int frequency = cp_freq[cp_freq.length-1];
        int sum = 0;
        for(int num : nums)
        {
            if(frq[num] == frequency)
            {
                sum ++;
            }
        }

        return sum;
    }

}
