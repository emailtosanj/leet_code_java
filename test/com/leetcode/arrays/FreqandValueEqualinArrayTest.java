package com.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreqandValueEqualinArrayTest {

    @Test
    void findLucky_1() {
        int[] nums  = {2,2,3,4};
        FreqandValueEqualinArray freqandValueEqualinArray = new FreqandValueEqualinArray();
        assertEquals(2, freqandValueEqualinArray.findLucky(nums));

    }
    @Test
    void findLucky_2() {
        int[] nums  = {1,2,2,3,3,3};
        FreqandValueEqualinArray freqandValueEqualinArray = new FreqandValueEqualinArray();
        assertEquals(3, freqandValueEqualinArray.findLucky(nums));
    }

    @Test
    void findLucky_3() {
        int[] nums  = {2,2,2,3,3};
        FreqandValueEqualinArray freqandValueEqualinArray = new FreqandValueEqualinArray();
        assertEquals(-1, freqandValueEqualinArray.findLucky(nums));
    }

    /*@Test
    void findLucky_1() {
    }*/
}