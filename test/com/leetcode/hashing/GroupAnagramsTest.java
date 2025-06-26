package com.leetcode.hashing;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {

    @Test
    void groupAnagrams_1() {

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        List<List<String>> lst = List.of(List.of("bat"), List.of("nat", "tan"), List.of("ate", "eat", "tea"));
        List<List<String>> lstA = groupAnagrams.groupAnagrams(strs);

        List<String> lstActSt = lstA.stream().flatMap(s -> s.stream()).collect(Collectors.toList());
        List<String> lstE = lst.stream().flatMap(s -> s.stream()).collect(Collectors.toList());


        assertTrue(lstE.stream().allMatch(s -> lstActSt.contains(s)));

    }

    //["cab","tin","pew","duh","may","ill","buy","bar","max","doc"]

    @Test
    void groupAnagrams_2() {

        String[] strs = {"cab","tin","pew","duh","may","ill","buy","bar","max","doc"};
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        //[["duh"],["bar"],["cab"],["buy"],["ill"],["may"],["pew"],["max"],["tin"],["doc"]]
        List<List<String>> lst = List.of(List.of("duh"),List.of("bar"),List.of("cab"), List.of("buy"), List.of("ill"),
                List.of("may"),List.of("pew"),List.of("max"),List.of("tin"), List.of("doc"));
        List<List<String>> lstA = groupAnagrams.groupAnagrams(strs);

        List<String> lstActSt = lstA.stream().flatMap(s -> s.stream()).collect(Collectors.toList());
        List<String> lstE = lst.stream().flatMap(s -> s.stream()).collect(Collectors.toList());

        assertTrue(lstE.stream().allMatch(s -> lstActSt.contains(s)));

    }

}