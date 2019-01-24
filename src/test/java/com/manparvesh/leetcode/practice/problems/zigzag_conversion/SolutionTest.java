package com.manparvesh.leetcode.practice.problems.zigzag_conversion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private void testSequence(String input, String output) {
        Solution solution = new Solution();
        String[] sar = input.split("\n");
        String s = sar[0];
        int numRows = Integer.parseInt(sar[1]);

        assertEquals(output, solution.convert(s, numRows));
    }

    @Test
    public void test1() {
        testSequence("PAYPALISHIRING\n3", "PAHNAPLSIIGYIR");
    }

    @Test
    public void test2() {
        testSequence("PAYPALISHIRING\n4", "PINALSIGYAHRPI");
    }
}