package com.codility.arrays;

public class OddOccinArray {

    public int solution(int[] A) {

        int ret = 0 ;
        for( int i = 0; i < A.length; i++)
        {

            ret ^= A[i];

        }

        return ret;

        /**  int [] n_val = new int[1_000_000_000];
         int val_to_ret = 0;
         for(int i = 0; i < A.length; i++)
         {
         n_val[A[i]] = n_val[A[i]] + 1;
         }

         for(int i = 0; i < n_val.length; i++)
         {
         if( n_val[A[i]] == 1 )
         {
         val_to_ret = i;
         break;
         }
         }
         return val_to_ret;
         } **/

    }
/*
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 4, 5, 3, 4};
        System.out.println("The unique element is: " + findUnique(nums)); // Output: 2
    }
*/

}
