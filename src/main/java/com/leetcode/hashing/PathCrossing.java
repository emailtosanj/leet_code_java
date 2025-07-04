package com.leetcode.hashing;

public class PathCrossing {

    public boolean isPathCrossing(String path) {

        int len = path.length();
        int[] loc = new int[2]; // start loc is always 0,0
        for(int i =0; i < len; i++)
        {
            char c = path.charAt(i);
            switch (c)
            {
                case 'N' -> {
                    loc[1] += 1;
                    if(checkPathCrossed(loc))
                        return true;
                }
                case 'E' -> {
                    loc[0] += 1;
                    if(checkPathCrossed(loc))
                        return true;
                }
                case 'S' -> {
                    loc[1] += -1;
                    if(checkPathCrossed(loc))
                        return true;
                }
                case 'W' -> {
                    loc[0] += -1;
                    if(checkPathCrossed(loc))
                        return true;
                }

                default -> throw new RuntimeException("Not a valid char");
            }
        }
        return false; // will never reach based on the input data costraint.
    }

    private boolean checkPathCrossed(int[] loc) {
        return loc[0] == 0 && loc[1] == 0;
    }

}
