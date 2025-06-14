package com.sort;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class SelectionSort {

    // selection sort is about finding the min pos in an array
    // and swap it another one.
    // n O(n)

    static int[] sortElements(int [] a)
    {
        for(int i =0; i <a.length; i++ )
        {
            int minValIdx = i;
            for(int j= i+1; j<a.length; j++)
            {
                if(a[j] < a[i])
                {
                    minValIdx = j;
                }
            }
            int temp = a[i];
            a[i] = a[minValIdx];
            a[minValIdx] = temp;
        }

        return a;
    }

    public static void main(String[] args) {
        System.out.println("Selection sort");
        int a [] = {3, 22, 1, 44, 55};
        System.out.println(Arrays.stream(a).mapToObj(Objects::toString).collect(Collectors.joining(",")));
        System.out.println(Arrays.stream(sortElements(a)).mapToObj(Objects::toString).collect(Collectors.joining(",")));
        System.out.println("Selection sort output");
    }
}
