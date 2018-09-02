package com.manparvesh.leetcode.practice.problems.rotate_array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    @Test
    public void rotate() {
        Solution solution = new Solution();

        int ar[] = new int[]{1, 2, 3, 4, 5, 6, 7};
        solution.rotate(ar, 3);
        assertArrayEquals(
                new int[]{5, 6, 7, 1, 2, 3, 4},
                ar);

        ar = new int[]{-1, -100, 3, 99};
        solution.rotate(ar, 2);
        assertArrayEquals(
                new int[]{3, 99, -1, -100},
                ar);
    }
}