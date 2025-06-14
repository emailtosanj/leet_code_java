package com.leetcode.hashing;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Execution(ExecutionMode.CONCURRENT)
class InetrsectionMultiplsArraysTest {

    private final InetrsectionMultiplsArrays obj = new InetrsectionMultiplsArrays();

    @RepeatedTest(10) // Run the test multiple times to simulate concurrent access
    void testIntersectionConcurrently() {
        int[][] nums = {
                {1, 2, 3},
                {2, 3, 4},
                {2, 3, 5}
        };

        List<Integer> result = obj.intersection(nums);

        assertEquals(List.of(2, 3), result); // Expected result is [2, 3]
    }
}