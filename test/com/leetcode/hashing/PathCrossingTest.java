package com.leetcode.hashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PathCrossingTest {

    @Test
    void isPathCrossing_1() {
        PathCrossing p = new PathCrossing();
        assertEquals(false, p.isPathCrossing("NES"));
    }


    @Test
    void isPathCrossing_2() {
        PathCrossing p = new PathCrossing();
        assertEquals(true, p.isPathCrossing("NESWW"));
    }


    @Test
    void isPathCrossing_3() {
        PathCrossing p = new PathCrossing();
        assertEquals(false, p.isPathCrossing("ES"));
    }

    @Test
    void isPathCrossing_4() {
        PathCrossing p = new PathCrossing();
        assertEquals(true, p.isPathCrossing("NNSWWEWSSESSWENNW"));
    }

}