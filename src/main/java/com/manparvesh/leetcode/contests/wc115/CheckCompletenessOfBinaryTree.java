package com.manparvesh.leetcode.contests.wc115;

public class CheckCompletenessOfBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private int countNodes(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    private boolean isComplete(TreeNode root, int index, int numberOfNodes) {
        if (root == null)
            return true;

        if (index >= numberOfNodes)
            return false;

        return (isComplete(root.left, 2 * index + 1, numberOfNodes)
                && isComplete(root.right, 2 * index + 2, numberOfNodes));
    }

    public boolean isCompleteTree(TreeNode root) {
        return isComplete(root, 0, countNodes(root));
    }
}
