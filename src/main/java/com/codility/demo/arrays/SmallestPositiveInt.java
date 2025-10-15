/**
 * This is a demo task.
 *
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 * content_copy
 *
 * that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
 *
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 *
 * Given A = [1, 2, 3], the function should return 4.
 *
 * Given A = [−1, −3], the function should return 1.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000].
 * Copyright 2009–2025 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
 */

package com.codility.demo.arrays;

import java.util.HashSet;
import java.util.Set;

public class SmallestPositiveInt {

    /*
     *      1> check the array number continuity check for gap and the number and return
     *
     *      2> if the array number exhausts then outside look check the last number and add 1 and return
     *
     *      3> if all the numbers are negative and arr elements exhaust then return 1.
     */


    public int solution(int[] A) {

        //        A = [1, 3, 6, 4, 1, 2]

        Set<Integer> allNums = new HashSet<>();
        for (int val : A) {
            if (val > 0) {
                allNums.add(val);
            }
        }

        int missingNum = 1;
        while (allNums.contains(missingNum)) {
            missingNum++;
        }
        return missingNum;
    }

}
