package com.manparvesh.leetcode.practice.problems.longestsubstringwithoutrepeatingcharacters;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] car = s.toCharArray();
        int currentCount = 0;
        int ans = 0;
        int[] ar = new int[128];
        for (int i = 0; i < s.length(); i++) {
            char c = car[i];
            int ci = (int) c;
            if (ar[ci] > 0) {
                // cannot add this to the substring
                // need to remove from front
                for (int j = i - currentCount; j < i; j++) {
                    if (car[j] == c) {
                        break;
                    }
                    // else, keep removing from front
                    currentCount--;
                    ar[(int) car[j]]--;
                }
            } else {
                currentCount++;
                ans = Math.max(currentCount, ans);
                ar[ci]++;
            }
        }
        return ans;
    }
}
