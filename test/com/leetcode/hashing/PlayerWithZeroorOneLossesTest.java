package com.leetcode.hashing;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PlayerWithZeroorOneLossesTest {

    @Test
    void findWinners_1() {


        PlayerWithZeroorOneLosses playerWithZeroorOneLosses = new PlayerWithZeroorOneLosses();
        int[][] matches = {{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};

        var result = playerWithZeroorOneLosses.findWinners(matches);

        assertNotNull(result);
        assertEquals(2, result.size());
        assertTrue(result.get(0).equals(List.of(1, 2, 10)));
        //assertTrue(result.get(1).containsAll(List.of(4, 5, 7, 8)));
        assertTrue(result.get(1).equals(List.of(4, 5, 7, 8)));

    }

    @Test
    void findWinners_2() {


        PlayerWithZeroorOneLosses playerWithZeroorOneLosses = new PlayerWithZeroorOneLosses();
        int[][] matches = {{2,3},{1,3},{5,4},{6,4}};

        var result = playerWithZeroorOneLosses.findWinners(matches);

        assertNotNull(result);
        assertEquals(2, result.size());
        assertTrue(result.get(0).containsAll(List.of(1,2,5,6)));
        assertTrue(result.get(1).containsAll(List.of()));

    }

}