package com.leetcode.arrays;


public class SumofUniqueElements {
    public int sumOfUnique(int[] nums) {

        int[] arr = new int[100];

        for (int j : nums) {
            arr[j]++;
        }

        int sum = 0;
        for (int num : nums) {
            if (arr[num] == 1) {
                sum += num;
            }
        }
        return sum;
    }
}
