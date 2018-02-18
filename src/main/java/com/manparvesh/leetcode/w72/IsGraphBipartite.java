package com.manparvesh.leetcode.w72;

public class IsGraphBipartite {
    static class Solution {
        public boolean isBipartite(int[][] graph) {
            if ((graph.length & 1) == 1){
                return false;
            }
            boolean ans = false;

            

            return ans;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int graph[][] = {{1,3}, {0,2}, {1,3}, {0,2}};
        assert solution.isBipartite(graph);
    }
}
