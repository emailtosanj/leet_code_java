package com.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumofUniqueElementsTest {

    @Test
    void sumOfUnique_1() {
        int[] nums = {1,2,3,2};
        SumofUniqueElements sumofUniqueElements = new SumofUniqueElements();
        assertEquals(4, sumofUniqueElements.sumOfUnique(nums));
    }

    @Test
    void sumOfUnique_2() {
        int[] nums = {1,1,1,1,1};
        SumofUniqueElements sumofUniqueElements = new SumofUniqueElements();
        assertEquals(0, sumofUniqueElements.sumOfUnique(nums));
    }

    @Test
    void sumOfUnique_3() {
        int[] nums = {1,2,3,4,5};
        SumofUniqueElements sumofUniqueElements = new SumofUniqueElements();
        assertEquals(15, sumofUniqueElements.sumOfUnique(nums));
    }


    @Test
    void sumOfUnique_4() {
        int[] nums = {10,6,9,6,9,6,8,7};
        SumofUniqueElements sumofUniqueElements = new SumofUniqueElements();
        assertEquals(25, sumofUniqueElements.sumOfUnique(nums));
    }
}