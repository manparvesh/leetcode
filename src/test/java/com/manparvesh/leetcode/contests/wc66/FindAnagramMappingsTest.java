package com.manparvesh.leetcode.contests.wc66;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FindAnagramMappingsTest {
    @Test
    public void testAnagramMappings() {
        int[] a = new int[] { 12, 28, 46, 32, 50 };
        int[] b = new int[] { 50, 12, 32, 46, 28 };
        int[] ans = new FindAnagramMappings().anagramMappings(a, b);
        assertArrayEquals(new int[] { 1, 4, 3, 2, 0 }, ans);
    }

}
