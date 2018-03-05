package com.manparvesh.leetcode.contests.wc74;

public class ValidTicTacToeState {
    static class Solution {
        public boolean validTicTacToe(String[] board) {
            char b[][] = new char[3][3];
            int xCount = 0, oCount = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    char c = board[i].charAt(j);
                    b[i][j] = c;
                    if (c == 'X') {
                        xCount++;
                    } else if (c == 'O') {
                        oCount++;
                    }
                }
            }
            if (xCount < oCount || xCount - oCount > 1) {
                return false;
            }

            boolean xCan = false, oCan = false;
            for (int i = 0; i < 3; i++) {
                if (b[i][0] == 'X' && b[i][1] == 'X' && b[i][2] == 'X') {
                    if (xCan)
                        return false;
                    xCan = true;
                }
                if (b[0][i] == 'X' && b[1][i] == 'X' && b[2][i] == 'X') {
                    if (xCan)
                        return false;
                    xCan = true;
                }
                if (b[i][0] == 'O' && b[i][1] == 'O' && b[i][2] == 'O') {
                    if (oCan)
                        return false;
                    oCan = true;
                }
                if (b[0][i] == 'O' && b[1][i] == 'O' && b[2][i] == 'O') {
                    if (oCan)
                        return false;
                    oCan = true;
                }
            }

            if (b[0][0] == 'X' && b[1][1] == 'X' && b[2][2] == 'X') {
                if (xCan)
                    return false;
                xCan = true;
            }

            if (b[2][0] == 'X' && b[1][1] == 'X' && b[0][2] == 'X') {
                if (xCan)
                    return false;
                xCan = true;
            }

            if (b[0][0] == 'O' && b[1][1] == 'O' && b[2][2] == 'O') {
                if (oCan)
                    return false;
                oCan = true;
            }

            if (b[2][0] == 'O' && b[1][1] == 'O' && b[0][2] == 'O') {
                if (oCan)
                    return false;
                oCan = true;
            }

            if (oCan && xCan) {
                return false;
            }

            if (xCan && (xCount == oCount)) {
                return false;
            }

            return true;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] board = { "XOX", "O O", "XOX" };
        System.out.println(solution.validTicTacToe(board));
    }
}
