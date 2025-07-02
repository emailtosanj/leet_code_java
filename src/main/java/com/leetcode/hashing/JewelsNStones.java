package com.leetcode.hashing;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;


public class JewelsNStones {

    public int numJewelsInStones(String jewels, String stones) {

        Set<Character> st = ConcurrentHashMap.newKeySet();

        for(char c : jewels.toCharArray())
        {
            st.add(c);
        }

        int res = 0;
        for(char c : stones.toCharArray())
        {
            if(st.contains(c))
                res++;
        }
        return res;

    }

}
