package com.leetcode.linkedlists;

/*
import java.util.ArrayList;
import java.util.List;
*/

public class ReverseLinkedList {


    // having same methods with same arguments results in - IMP: both methods have same erasure
    /*public List<Integer> reverseList(int[] arr) {

        // 1 2 3 4
        List<Integer> lst = new ArrayList<>();
        for (int i=arr.length - 1; i >= 0; i--)
        {
            lst.add(i);
        }
        return lst;
    }*/

    /**
     *
     * @param arr
     * @return
     */
    public int[] reverseList(int[] arr) {

        // 1 2 3 4
        int[] result = new int[arr.length];
        int resultIndex = 0 ;
        for (int i=arr.length - 1; i >= 0; i--)
        {
            result[resultIndex] = arr[i];
            resultIndex++;
        }
        return result;
    }


/*The table is dynamically expanded when there are too many collisions (i.e., keys that have distinct hash codes but
fall into the same slot modulo the table size), with the expected average effect of maintaining roughly two bins permapping
(corresponding to a 0.75 load factor threshold for resizing).*/



}
