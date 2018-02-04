package com.manparvesh.leetcode.wc70;

public class KthSymbolInGrammar {
    public int kthGrammar(int N, int K) {
        //long s = (long)Math.pow(2, N - 1), flips = 0;
        //
        //while (s > 2) {
        //    if (K > s/2) { K -= s/2; flips++; }
        //    s /= 2;
        //}
        //
        //K--;
        //
        //if (flips % 2 == 1) {
        //    // flip
        //    K = ((K + 1) % 2);
        //}
        //
        //return K;
        return Integer.bitCount(K-1) & 1;
    }
}
