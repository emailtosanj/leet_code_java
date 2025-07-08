package com.leetcode.arrays;

import java.util.*;

public class FreqandValueEqualinArray {

    public int findLucky(int[] arr) {

        int ret = -1;
        if(arr.length == 1)
        {
            return arr[0] == 1 ? 1 : ret;
        }

        int[] nums = new int[501];
        List<Integer> lst = new ArrayList<>();
        //[2,2,2,3,3]

        for(int num : arr)
        {
            nums[num]++;
        }

        for(int num : arr)
        {
            if(nums[num] == num)
            {
                lst.add(num);
            }
        }


        if(lst.size() == 0)
        {
            return -1;
        }
        else
        {

            Collections.sort(lst);
            return lst.get(lst.size()-1);
        }

    }

}
