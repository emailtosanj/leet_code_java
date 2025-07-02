package com.leetcode.hashing;


import java.util.Arrays;

public class RansomNote_CanBuildStringWithAnother {



    //Set<Character> secStrSet = ConcurrentHashMap.newKeySet();
    public boolean canConstruct(String ransomNote, String magazine) {

        if (ransomNote.length() > magazine.length())
            return false;

        char[] atoz = new char[26];

        for (char c : magazine.toCharArray()) {
            atoz[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            if (atoz[c - 'a'] == 0) {
                return false;
            }
            atoz[c - 'a']--;
        }
        return true;
    }

}
