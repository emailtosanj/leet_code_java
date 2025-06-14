package com.leetcode.hashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingElementsTest {

    @Test
    void countElements() {
        CountingElements countingElements = new CountingElements();
        int[] arr = {1, 2, 3};
        assertEquals(2, countingElements.countElements(arr));

    }
}