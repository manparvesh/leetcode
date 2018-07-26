package com.manparvesh.leetcode.practice.problems.superuglynumber;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();
        assertEquals(32, solution.nthSuperUglyNumber(12, new int[] { 2, 7, 13, 19 }));
    }

}