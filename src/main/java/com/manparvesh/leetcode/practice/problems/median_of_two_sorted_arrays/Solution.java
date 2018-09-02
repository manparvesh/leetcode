package com.manparvesh.leetcode.practice.problems.median_of_two_sorted_arrays;

public class Solution {
    public double findMedianSortedArrays(int[] a1, int[] a2) {
        int n = a1.length, m = a2.length;
        int ar[] = new int[n + m];
        int i = 0, j = 0;
        int k = 0;
        while (i < n && j < m) {
            if (a1[i] < a2[j]) {
                ar[k++] = a1[i++];
            } else {
                ar[k++] = a2[j++];
            }
        }
        while (i < n) {
            ar[k++] = a1[i++];
        }
        while (j < m) {
            ar[k++] = a2[j++];
        }

        double median = 0;
        int N = n + m;
        if (N % 2 == 1) {
            median = (double) ar[(N - 1) / 2];
        } else {
            median = ((double) ar[(N - 1) / 2] + ar[(N - 1) / 2 + 1]) / 2.0;
        }
        return median;
    }
}
