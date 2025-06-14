package com.leetcode.arrays;

import java.util.Arrays;

class MaxKPairs {
    public int maxOperations(int[] nums, int k) {

        int l = 0;
        int r = nums.length - 1;

        Arrays.sort(nums);
        int count = 0;
        while (l < r)
        {

            if(nums[l] + nums[r] == k)
            {
                l++;
                r--;
                count += 1;
            }
            else if (nums[l] + nums[r] < k)
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        MaxKPairs maxKPairs = new MaxKPairs();
        int[] nums = {1,2,3,4};
        int k = 5;
        System.out.println(maxKPairs.maxOperations(nums, k)); // Output: 2
    }
}