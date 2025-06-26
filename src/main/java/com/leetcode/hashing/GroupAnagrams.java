package com.leetcode.hashing;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiFunction;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        ConcurrentMap<String, List<String>> grpByMap = new ConcurrentHashMap<>();

        List<List<String>> lstToRet = new ArrayList<>();
        if(strs.length == 1)
        {
            lstToRet.add(List.of(strs[0]));
            return lstToRet;
        }

        for(String ele : strs)
        {
            char[] ch = ele.toCharArray();
            Arrays.sort(ch);
            String srtedAnagramStr =  new String(ch);

            List<String> newLst =  new ArrayList<>();
            newLst.add(ele);

            grpByMap.merge(srtedAnagramStr, newLst, (incLst, exstLst) -> {
                exstLst.addAll(incLst);
                return exstLst;
            });
        }
        lstToRet.addAll(grpByMap.values());
        return lstToRet;
    }

}
