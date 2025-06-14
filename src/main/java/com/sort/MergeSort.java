package com.sort;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MergeSort {

    static int [] merge(int[] first, int[] second, int [] merged){

        int firstIndex = 0;
        int secondIndex = 0;
        int mergedIndex = 0;

        while(firstIndex < first.length && secondIndex < second.length)
        {
            if (first[firstIndex] < second[secondIndex])
            {
                merged[mergedIndex] = first[firstIndex];
                firstIndex++;
            }else {
                merged[mergedIndex] = second[secondIndex];
                secondIndex++;
            }
            mergedIndex++;
        }

        while (firstIndex < first.length)
        {
            merged[mergedIndex] = first[firstIndex];
            mergedIndex++;
            firstIndex++;
        }

        while(secondIndex < second.length)
        {
            merged[mergedIndex] = second[secondIndex];
            mergedIndex++;
            secondIndex++;
        }
        return merged;
    }

    public static void main(String[] args) {
        int[] a = {12, 34, 4, 100, 1, 50, 7, 97, 2};
        int[] result = mergeSort(a);
        System.out.println(Arrays.stream(result).mapToObj(Objects::toString).collect(Collectors.joining(",")));
    }

    static int[] mergeSort(int a[])
    {
        if(a.length <=1 )
        {
            return a;
        }

        int mid = a.length/2;
        int [] first = Arrays.copyOfRange(a, 0, mid);
        int [] second = Arrays.copyOfRange(a, mid, a.length);

        mergeSort(first);
        mergeSort(second);

        return merge(first, second, a);
    }

}
