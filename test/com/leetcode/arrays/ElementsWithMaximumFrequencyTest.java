package com.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElementsWithMaximumFrequencyTest {

    @Test
    void maxFrequencyElements_1() {

        int[] nums = {1, 2, 2, 3, 1, 4};
        ElementsWithMaximumFrequency elementsWithMaximumFrequency = new ElementsWithMaximumFrequency();
        assertEquals(4, elementsWithMaximumFrequency.maxFrequencyElements(nums));
    }

    @Test
    void maxFrequencyElements_2() {

        int[] nums = {1, 2, 3, 4, 5};
        ElementsWithMaximumFrequency elementsWithMaximumFrequency = new ElementsWithMaximumFrequency();
        assertEquals(5, elementsWithMaximumFrequency.maxFrequencyElements(nums));
    }

}