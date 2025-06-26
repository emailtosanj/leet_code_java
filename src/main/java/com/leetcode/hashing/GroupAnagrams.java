package com.leetcode.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiFunction;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        ConcurrentMap<Integer, List<String>> grpByMap = new ConcurrentHashMap<>();

        List<List<String>> lstToRet = new ArrayList<>();
        if(strs.length == 1)
        {
            lstToRet.add(List.of(strs[0]));
            return lstToRet;
        }

        for(String ele : strs)
        {
            int asciiVal = 0;
            for(char ch : ele.toCharArray())
            {
                asciiVal += ch;
            }
            List<String> newLst =  new ArrayList<>();
            newLst.add(ele);
            grpByMap.merge(asciiVal, newLst, (incLst, exstLst) -> {
                exstLst.addAll(incLst);
                return exstLst;
            });
        }
        lstToRet.addAll(grpByMap.values());
        return lstToRet;
    }

}
