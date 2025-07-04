package com.leetcode.hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PathCrossing {

    public boolean isPathCrossing(String path) {

        int len = path.length();
        int x  = 0;
        int y = 0;


        Set<List<Integer>> locTrack = new HashSet<>();
        locTrack.add(List.of(x, y));

        for(int i =0; i < len; i++)
        {
            char c = path.charAt(i);
            switch (c)
            {
                case 'N' -> y++;
                case 'E' -> x++;
                case 'S' -> y--;
                case 'W' -> x--;
                default -> throw new RuntimeException("Not a valid char");
            }

            List<Integer> loc = List.of(x, y);

            if(!locTrack.add(loc))
            {
                return true;
            }
        }
        return false;
    }

}
