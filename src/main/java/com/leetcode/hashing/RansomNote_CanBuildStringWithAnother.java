package com.leetcode.hashing;


import java.util.Arrays;

public class RansomNote_CanBuildStringWithAnother {



    //Set<Character> secStrSet = ConcurrentHashMap.newKeySet();
    public boolean canConstruct(String ransomNote, String magazine) {

        char[] arr1 = ransomNote.toCharArray();
        char[] arr2 = magazine.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String s1 = new String(arr1);
        String s2 = new String(arr2);

        if(s1.length() == s2.length())
        {
            if(!s1.equals(s2))
                return false;
            else
                return true;
        }

        if(arr1.length < arr2.length)
        {
            for(char ch : arr1)
            {
                if(magazine.indexOf(ch) == -1)
                {
                    return false;
                }
            }
        }
        else
        {
            for(char ch : arr2)
            {
                if(ransomNote.indexOf(ch) == -1)
                {
                    return false;
                }
            }
        }
        return true;
    }

}
