package com.leetcode.hashing;

import java.util.Arrays;
import java.util.List;

public class MissingNumber {


    public int missingNumber(int[] nums) {


        List<Integer> list = Arrays.stream(nums).boxed().toList();

        for (int i = 0; i <= nums.length; i++) {
            if (!list.contains(i)) {
                return i;
            }
        }
        return -1;
    }
}
