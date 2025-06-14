package com.leetcode.leetcode.arrays;

import com.leetcode.arrays.MaxKPairs;

import static org.junit.jupiter.api.Assertions.*;

class MaxKPairsTest {


    @org.junit.jupiter.api.Test
    void maxOperations() {
        MaxKPairs maxKPairs = new MaxKPairs();
        int[] nums = {1,2,3,4};
        int k = 5;
        assertEquals(2, maxKPairs.maxOperations(nums, k));

        nums = new int[]{3,1,3,4,3};
        k = 6;
        assertEquals(1, maxKPairs.maxOperations(nums, k));

        nums = new int[]{1,2,3,4};
        k = 7;
        assertEquals(0, maxKPairs.maxOperations(nums, k));
    }
}