package com.manparvesh.leetcode.practice.problems.reverseinteger;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void reverse() {
        String line = "-47412";

        int x = Integer.parseInt(line);

        int ret = new Solution().reverse(x);

        assertEquals("-21474", String.valueOf(ret));
    }
}