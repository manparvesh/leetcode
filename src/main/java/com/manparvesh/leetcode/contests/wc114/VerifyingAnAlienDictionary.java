package com.manparvesh.leetcode.contests.wc114;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class VerifyingAnAlienDictionary {
    public boolean isAlienSorted(String[] words, String order) {
        String[] newWords = new String[words.length];
        System.arraycopy(words, 0, newWords, 0, words.length);
        Arrays.sort(newWords, new MyComparator(order));
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(newWords[i])) return false;
        }
        return true;
    }

    private class MyComparator implements Comparator<String> {
        private String order;

        public MyComparator(String order) {
            this.order = order;
        }

        public int compare(String a, String b) {
            if (a == b) return 0;
            if (a == null) return -1;
            if (b == null) return 1;

            int i=0, j=0;
            Map<Character, Integer> map = new HashMap<Character, Integer>();
            for (int x = 0; x < order.length(); x++) {
                char c = order.charAt(x);
                map.put(c, x);
            }
            while (i < a.length() && j < b.length()) {
                char ca = a.charAt(i), cb = b.charAt(j);
                if (ca == cb) {
                    i++;
                    j++;
                    continue;
                }
                return map.get(ca) < map.get(cb) ? -1 : 1;
            }
            if (i == a.length() && j == b.length()) {
                return 0;
            }
            if (i == a.length()) {
                return -1;
            } else {
                return 1;
            }
        }
    }
}
