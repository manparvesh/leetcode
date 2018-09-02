package com.manparvesh.leetcode.practice.problems.median_of_two_sorted_arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findMedianSortedArrays() {
        Solution solution = new Solution();
        assertEquals(2.0,
                solution.findMedianSortedArrays(
                        new int[] {1, 3},
                        new int[] {2}
                ), 1E-7);
        assertEquals(2.5,
                solution.findMedianSortedArrays(
                        new int[] {1, 2},
                        new int[] {3, 4}
                ), 1E-7);
        assertEquals(2.0,
                solution.findMedianSortedArrays(
                        new int[] {1},
                        new int[] {3}
                ), 1E-7);
        assertEquals(1.0,
                solution.findMedianSortedArrays(
                        new int[] {1, 1, 1},
                        new int[] {3}
                ), 1E-7);
        assertEquals(1.0,
                solution.findMedianSortedArrays(
                        new int[] {1, 1},
                        new int[] {3}
                ), 1E-7);
    }
}