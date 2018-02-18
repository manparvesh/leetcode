package com.manparvesh.leetcode.w72;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.letterCasePermutation("a1b2"));
        //String s = "abcd";
        //System.out.println(s.substring(0, 1) + s.substring(2));
    }

    static class Solution {
        public List<String> letterCasePermutation(String s) {
            List<StringBuilder> ans = new ArrayList<StringBuilder>();
            ans.add(new StringBuilder());

            for (char c : s.toCharArray()) {
                int n = ans.size();
                if (Character.isLetter(c)) {
                    for (int i = 0; i < n; ++i) {
                        ans.add(new StringBuilder(ans.get(i)));
                        ans.get(i).append(Character.toLowerCase(c));
                        ans.get(n + i).append(Character.toUpperCase(c));
                    }
                } else {
                    for (int i = 0; i < n; ++i)
                        ans.get(i).append(c);
                }
            }

            List<String> finalans = new ArrayList<String>();
            for (StringBuilder sb : ans)
                finalans.add(sb.toString());
            return finalans;
        }
    }
}
