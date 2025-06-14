package com.search;
//int l=0;
//int h=9;
//int m= (l+h)/2;
//System.out.println(m); // 4
//

//  int l=5;
//  int h=9;
//  int m= (l+h)/2;
//  System.out.println(m);  // 7

//Reference Cay Hortsman
import java.util.stream.IntStream;
public class BinarySearch {


    public static int search(int[] a, int value)
    {
        int low = 0;
        int high = a.length - 1;
        while (low <= high)
        {
            int mid = (low + high) / 2;
            if (a[mid] == value)
            {
                int result = mid;
                return result;
            }
            else if (a[mid] < value )
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        int result = -1;
        return result;
    }

    public static void main(String[] args) {
        int s [] ={ 32, 100, 12, 4, 22, 150, 1 , 39};
        s = IntStream.of(s).sorted().toArray();
        System.out.println(search(s, 1));
    }

}
