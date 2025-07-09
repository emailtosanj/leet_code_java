package com.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueOcurrencesofElementsCheckTest {

    @Test
    void uniqueOccurrences_1() {
        int[] nums = {1,2,2,1,1,3};
        UniqueOcurrencesofElementsCheck uniqueOcurrencesofElementsCheck = new UniqueOcurrencesofElementsCheck();
        assertEquals(true, uniqueOcurrencesofElementsCheck.uniqueOccurrences(nums));
    }


    @Test
    void uniqueOccurrences_2() {
        int[] nums = {-3,0,1,-3,1,1,1,-3,10,0};
        UniqueOcurrencesofElementsCheck uniqueOcurrencesofElementsCheck = new UniqueOcurrencesofElementsCheck();
        assertEquals(true, uniqueOcurrencesofElementsCheck.uniqueOccurrences(nums));
    }


    @Test
    void uniqueOccurrences_3() {
        int[] nums = {1,2};
        UniqueOcurrencesofElementsCheck uniqueOcurrencesofElementsCheck = new UniqueOcurrencesofElementsCheck();
        assertEquals(false, uniqueOcurrencesofElementsCheck.uniqueOccurrences(nums));
    }


/*    @Test
    void uniqueOccurrences_1() {

    }*/


}