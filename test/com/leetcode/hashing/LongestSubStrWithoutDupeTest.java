package com.leetcode.hashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubStrWithoutDupeTest {

    @Test
    void lengthOfLongestSubstring_1() {
        LongestSubStrWithoutDupe obj =  new LongestSubStrWithoutDupe();
        assertEquals(3, obj.lengthOfLongestSubstring("abcabcbb"));
    }


    @Test
    void lengthOfLongestSubstring_2() {
        LongestSubStrWithoutDupe obj =  new LongestSubStrWithoutDupe();
        assertEquals(1, obj.lengthOfLongestSubstring("bbbbb"));
    }


    @Test
    void lengthOfLongestSubstring_3() {
        LongestSubStrWithoutDupe obj =  new LongestSubStrWithoutDupe();
        assertEquals(3, obj.lengthOfLongestSubstring("pwwkew"));
    }


    @Test
    void lengthOfLongestSubstring_4() {
        LongestSubStrWithoutDupe obj =  new LongestSubStrWithoutDupe();
        assertEquals(2, obj.lengthOfLongestSubstring("aab"));
    }


    @Test
    void lengthOfLongestSubstring_5() {
        LongestSubStrWithoutDupe obj =  new LongestSubStrWithoutDupe();
        assertEquals(2, obj.lengthOfLongestSubstring("au"));
    }
    @Test
    void lengthOfLongestSubstring_6() {
        LongestSubStrWithoutDupe obj =  new LongestSubStrWithoutDupe();
        assertEquals(3, obj.lengthOfLongestSubstring("dvdf"));
    }

    @Test
    void lengthOfLongestSubstring_7() {
        LongestSubStrWithoutDupe obj =  new LongestSubStrWithoutDupe();
        assertEquals(5, obj.lengthOfLongestSubstring("anviaj"));
    }

    @Test
    void lengthOfLongestSubstring_8() {
        LongestSubStrWithoutDupe obj =  new LongestSubStrWithoutDupe();
        assertEquals(2, obj.lengthOfLongestSubstring("cdd"));
    }


}