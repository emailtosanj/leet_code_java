package com.leetcode.arrays;


public class FreqandValueEqualinArray {

    public int findLucky(int[] arr) {

        int ret = -1;
        if(arr.length == 1)
        {
            return arr[0] == 1 ? 1 : ret;
        }

        int[] nums = new int[501];

        for(int num : arr)
        {
            nums[num]++;
        }

        int max = -1;
        for(int num : arr)
        {
            if(nums[num] == num)
            {
                max = Math.max(max, num);
            }
        }


        if (max != 0)
        {

            return max;
        }
        else
            return ret;

    }

}
