package com.codility.timecomplexity;

/**
 * An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
 *
 * Your goal is to find that missing element.
 *
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 * content_copy
 *
 * that, given an array A, returns the value of the missing element.
 *
 * For example, given array A such that:
 *
 *   A[0] = 2
 *   A[1] = 3
 *   A[2] = 1
 *   A[3] = 5
 *
 * content_copy
 * the function should return 4, as it is the missing element.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [0..100,000];
 * the elements of A are all distinct;
 * each element of array A is an integer within the range [1..(N + 1)].
 * Copyright 2009–2025 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
 *
 */

public class PermMissingElement {

    public int solution(int[] A) {


        int [] tmp_arr = new int[A.length + 2];
        for ( int i=0; i < A.length; i++ )
        {
            tmp_arr[A[i]] = A[i];
        }

        // 1  2  3 4 5
        // 1  2  3 0 5

        int ret = 1;
        for(int i=1; i <= tmp_arr.length - 1; i++)
        {
            if( tmp_arr[i] == 0 )
            {
                ret = i;
                break;
            }
        }
        return ret;

    }

}
