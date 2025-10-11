package com.codility.timecomplexity;

/**
 * A non-empty array A consisting of N integers is given. Array A represents numbers on a tape.
 *
 * Any integer P, such that 0 < P < N, splits this tape into two non-empty parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].
 *
 * The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|
 *
 * In other words, it is the absolute difference between the sum of the first part and the sum of the second part.
 *
 * For example, consider array A such that:
 *
 *   A[0] = 3
 *   A[1] = 1
 *   A[2] = 2
 *   A[3] = 4
 *   A[4] = 3
 *
 * content_copy
 * We can split this tape in four places:
 *
 * P = 1, difference = |3 − 10| = 7
 * P = 2, difference = |4 − 9| = 5
 * P = 3, difference = |6 − 7| = 1
 * P = 4, difference = |10 − 3| = 7
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 * content_copy
 *
 * that, given a non-empty array A of N integers, returns the minimal difference that can be achieved.
 *
 * For example, given:
 *
 *   A[0] = 3
 *   A[1] = 1
 *   A[2] = 2
 *   A[3] = 4
 *   A[4] = 3
 *
 * content_copy
 * the function should return 1, as explained above.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [2..100,000];
 * each element of array A is an integer within the range [−1,000..1,000].
 * Copyright 2009–2025 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
 */

public class TapeEquilibrium {

    public int solution(int[] A) {


        int incSum = 0;
        int [] incSumArrPart1 = new int[A.length - 1];
        for (int i=0; i < A.length - 1; i++)
        {
            incSum = incSum + A[i]; // 0-0, 1-1, 2-3, 3-7, 4-10
            incSumArrPart1[i] = incSum;
        }

        incSum = 0;
        int [] incSumArrPart2 = new int[A.length - 1];

        for ( int i = A.length-1; i > 0; i-- )
        {
            incSum = incSum + A[i]; // 4 3, 3 7, 2 9, 1 10
            incSumArrPart2[i-1] = incSum;
        }

        // p = // 0 - 1 / 1 - 2 / 2 - 3 / 3 - 4 //

        int min = 0;
        for (int p = 0; p < incSumArrPart1.length; p++)
        {
            int part1 = incSumArrPart1[p];
            int part2 = incSumArrPart2[p];
            int diff = Math.abs(part1 - part2);
            if(p>0)
            {
                min = Math.min(diff, min);
            }
            else
            {
                min = diff;
            }
        }
        return min;
    }

}
