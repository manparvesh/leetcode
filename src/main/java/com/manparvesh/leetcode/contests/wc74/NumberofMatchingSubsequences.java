package com.manparvesh.leetcode.contests.wc74;

import java.util.ArrayList;
import java.util.Collections;

public class NumberofMatchingSubsequences {
    /**
     * todo this is an incomplete solution
     * */
    static class Solution {
        public int numMatchingSubseq(String s, String[] words) {
            int ans = 0;

            ArrayList<Integer> ar[] = new ArrayList[26];
            for (int i = 0; i < 26; i++) {
                ar[i] = new ArrayList<>();
            }
            for (int i = 0; i < s.length(); i++) {
                ar[s.charAt(i) - 'a'].add(i);
            }

            //Collections.binarySearch()
            for (String word : words) {
                int i = 0, prev = 0;
                for (i = 0; i < word.length(); i++) {
                    char c = word.charAt(i);
                    int ind = Collections.binarySearch(ar[c - 'a'], prev);
                    System.out.println(ind);
                    if (ind != -1) {
                        if (ind + 1 < ar[c - 'a'].size() && ar[c-'a'].get(ind + 1) > prev) {
                            prev = ar[c-'a'].get(ind + 1);
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                System.out.println(i);
                System.out.println();
                if(i == word.length()){
                    ans++;
                }
            }

            return ans;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String S = "abcde";
        String[] words = { "a", "bb", "acd", "ace" };
        System.out.println(solution.numMatchingSubseq(S, words));
    }
}
