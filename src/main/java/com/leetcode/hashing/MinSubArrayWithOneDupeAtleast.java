package com.leetcode.hashing;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class MinSubArrayWithOneDupeAtleast {

    public int minimumCardPickup(int[] cards) {

        if(cards.length == 1)
            return -1;
        ConcurrentMap<Integer, Integer> numToCount = new ConcurrentHashMap<>();
        int retLen = -1;
        //3,4,2,3,4,7
        //[1,0,5,3]
        for (int i=0; i < cards.length; i++)
        {
            Integer num  = cards[i];
            Integer val = numToCount.putIfAbsent(num, i); // compute the duped element

            if(val != null)
            {
                if(retLen == -1)
                {
                    retLen = (i - val) +1;
                }
                else{
                    retLen = Math.min(retLen, (i - val) +1);
                }
                numToCount.put(num, i);
           }
        }
        return retLen;
    }
}
