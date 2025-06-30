package com.leetcode.hashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RansomNote_CanBuildStringWithAnotherTest {

    @Test
    void canConstruct_1() {
        RansomNote_CanBuildStringWithAnother obj =  new RansomNote_CanBuildStringWithAnother();
        assertTrue(obj.canConstruct("aa", "aab"));
    }

    @Test
    void canConstruct_2() {
        RansomNote_CanBuildStringWithAnother obj =  new RansomNote_CanBuildStringWithAnother();
        assertFalse(obj.canConstruct("aa", "ab"));
    }


    @Test
    void canConstruct_3() {
        RansomNote_CanBuildStringWithAnother obj =  new RansomNote_CanBuildStringWithAnother();
        assertFalse(obj.canConstruct("a", "b"));
    }

    //aab


    @Test
    void canConstruct_4() {
        RansomNote_CanBuildStringWithAnother obj =  new RansomNote_CanBuildStringWithAnother();
        assertTrue(obj.canConstruct("aab", "baa"));
    }

}