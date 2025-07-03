package com.leetcode.hashing;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStrWithoutDupe {

    public int lengthOfLongestSubstring(String s) {
        int len = s.length();

        if (len == 1)
            return 1;

        int startIdx = 0;
        int lenSubStr = 0;

        Map<Character, Integer> mp = new HashMap<>();

        for (int j = 0; j < len; j++) {

            Character ch = s.charAt(j);

            if (mp.containsKey(ch)) {
                // update the dupe char (startIdx) index to max one so to get the
                // substring start index with running index of j
                startIdx = Math.max(mp.get(ch), startIdx);
            }

            lenSubStr = Math.max(lenSubStr, j - startIdx + 1);
            mp.put(ch, j + 1);
        }
        return lenSubStr;
    }

}
