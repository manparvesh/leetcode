package com.manparvesh.leetcode.practice.problems.reverseinteger;

class Solution {
    public int reverse(int x) {
        long reverse = 0;
        boolean neg = x < 0;
        if (neg) x *= -1;
        while (x > 0) {
            reverse = reverse*10 + x %10;
            x /= 10;
        }
        if (reverse <= Integer.MIN_VALUE || reverse >= Integer.MAX_VALUE) return 0;
        return (int) reverse * (neg ? -1 : 1);
    }
}
