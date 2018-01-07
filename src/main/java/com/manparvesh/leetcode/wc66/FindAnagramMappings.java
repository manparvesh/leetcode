package com.manparvesh.leetcode.wc66;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * Given two lists A and B, and B is an anagram of A. B is an anagram of A means B is made by randomizing the order of the elements in A.
 * <p>
 * We want to find an index mapping P, from A to B. A mapping P[i] = j means the ith element in A appears in B at index j.
 * <p>
 * These lists A and B may contain duplicates. If there are multiple answers, output any of them.
 * <p>
 * For example, given
 * <p>
 * A = [12, 28, 46, 32, 50]
 * B = [50, 12, 32, 46, 28]
 * <p>
 * We should return
 * <p>
 * [1, 4, 3, 2, 0]
 * <p>
 * as P[0] = 1 because the 0th element of A appears at B[1], and P[1] = 4 because the 1st element of A appears at B[4], and so on.
 * <p>
 * Note:
 * <p>
 * A, B have equal lengths in range [1, 100].
 * A[i], B[i] are integers in range [0, 10^5].
 */
public class FindAnagramMappings {
    public int[] anagramMappings(int[] a, int[] b) {
        Map<Integer, Deque<Integer>> map = new HashMap<Integer, Deque<Integer>>();
        for (int i = 0; i < b.length; i++) {
            int x = b[i];
            Deque<Integer> newDeque;
            if (map.containsKey(x)) {
                // just add to the existing deque
                newDeque = map.get(x);
            } else {
                // create a new deque and put
                newDeque = new ArrayDeque<Integer>();
            }
            newDeque.add(i);
            map.put(x, newDeque);
        }

        int[] ar = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            int x = a[i];
            Deque<Integer> deque = map.get(x);
            ar[i] = deque.getFirst();
            deque.removeFirst();
            map.put(x, deque);
        }

        return ar;
    }
}
