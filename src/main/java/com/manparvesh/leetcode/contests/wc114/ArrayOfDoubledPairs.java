package com.manparvesh.leetcode.contests.wc114;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers A with even length,
 * return true if and only if it is possible to
 * reorder it such that A[2 * i + 1] = 2 * A[2 * i]
 * for every 0 <= i < len(A) / 2.
 * <p>
 * Constraints:
 * 0 <= A.length <= 30000
 * A.length is even
 * -100000 <= A[i] <= 100000
 */
public class ArrayOfDoubledPairs {
    public boolean canReorderDoubled(int[] ar) {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(ar);
        for (int a : ar) {
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, 1);
            }
        }
        int numberOfDoubles = 0;
        int doublesNeeded = ar.length / 2;
        for (int a : ar) {
            if (map.containsKey(a * 2) && map.get(a) > 0 && map.get(a * 2) > 0) {
                numberOfDoubles++;
                map.put(a, map.get(a) - 1);
                map.put(a * 2, map.get(a * 2) - 1);
            }
        }
        return numberOfDoubles >= doublesNeeded;
    }
}
