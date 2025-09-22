package com.leetcode.linkedlists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {


    /**
     *  Test cases
     *
     *  input int array can be
     *
     *      - 1 value
     *      - 2 values
     *      - multiple values
     *      - empty / zero values
     *
     * */

    @Test
    void reverseList_1_val() {
        int [] arr = {1};
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        int [] arrResult = reverseLinkedList.reverseList(arr);
        assertArrayEquals(arr, arrResult);
    }

    @Test
    void reverseList_2_val() {
        int [] arr = {1, 100};
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        int [] arrResult = reverseLinkedList.reverseList(arr);
        int  [] arr_e = {100, 1};
        assertArrayEquals(arr_e, arrResult);
    }

    @Test
    void reverseList_multi_val() {
        int [] arr = {1, 100, 1000, 10000, 100000, 1_000_000, 10_000_000, 100_000_000};
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        int [] arrResult = reverseLinkedList.reverseList(arr);
        int  [] arr_e = {100_000_000, 10_000_000, 1_000_000, 100000, 10000, 1000,  100, 1};
        assertArrayEquals(arr_e, arrResult);
    }

    @Test
    void reverseList_empty_val() {
        int [] arr = {};
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        int [] arrResult = reverseLinkedList.reverseList(arr);
        assertArrayEquals(arr, arrResult);
    }

}