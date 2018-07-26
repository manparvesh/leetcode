package com.manparvesh.leetcode.practice.problems.superuglynumber;

import java.util.Arrays;

class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int MAX_N = 1000001;
        boolean nums[] = new boolean[MAX_N];
        Arrays.fill(nums, false);

        Arrays.sort(primes);

        nums[1] = true;
        for (int prime : primes) {
            for (int i = 1; i * prime <= MAX_N; i *= prime) {
                nums[i * prime] = true;
            }
        }

        for (int i = 0; i < primes.length; i++) {
            for (int j = 0; j < primes.length; j++) {
                // if ()
            }
        }

        int it = 0;
        int j = 0;
        while (it < n) {
            if (nums[j]) {
                System.out.print(j + " ");
                it++;
            }
            j++;
        }

        return j;
    }
}
