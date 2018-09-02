package com.manparvesh.leetcode.practice.problems.rotate_array;

public class Solution {
    public void rotate(int[] ar, int k) {
        int n = ar.length;

        k %= n;

        // reverse the whole array
        reverse(ar, 0, n - 1);

        // reverse the first k elements`
        reverse(ar, 0, k - 1);

        // reverse the remaining elements
        reverse(ar, k, n - 1);
    }

    private void reverse(int[] ar, int start, int end) {
        while (start < end) {
            int temp = ar[start];
            ar[start] = ar[end];
            ar[end] = temp;

            start++;
            end--;
        }
    }
}
