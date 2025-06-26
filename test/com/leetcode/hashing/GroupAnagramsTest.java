package com.leetcode.hashing;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {

    @Test
    void groupAnagrams_1() {

        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        List<List<String>> lst = List.of(List.of("bat"),List.of("nat","tan"), List.of("ate","eat","tea"));
        List<List<String>> lstA =groupAnagrams.groupAnagrams(strs);
        for (List<String> lstI: lstA)
        {
            assertTrue(lst.contains(lstI));
        }
        //assertEquals(lst, groupAnagrams.groupAnagrams(strs));
    }
}