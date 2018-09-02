package com.manparvesh.leetcode.practice.problems.longestsubstringwithoutrepeatingcharacters;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void lengthOfLongestSubstring() {
        Solution solution = new Solution();
        assertEquals(3,
                solution.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1,
                solution.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3,
                solution.lengthOfLongestSubstring("pwwkew"));
        assertEquals(1,
                solution.lengthOfLongestSubstring(" "));
        assertEquals(0,
                solution.lengthOfLongestSubstring(""));
    }
}