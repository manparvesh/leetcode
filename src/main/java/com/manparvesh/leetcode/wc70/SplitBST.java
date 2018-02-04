package com.manparvesh.leetcode.wc70;

public class SplitBST {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode[] splitBST(TreeNode root, int V) {
        TreeNode sP = new TreeNode(0), bP = new TreeNode(0);
        split(root, V, sP, bP);
        return new TreeNode[]{sP.right, bP.left};
    }

    private void split(TreeNode node, int v, TreeNode sP, TreeNode bP) {
        if (node == null) return;
        if (node.val <= v) {
            sP.right = node;
            TreeNode right = node.right;
            node.right = null;
            split(right, v, node, bP);
        } else {
            bP.left = node;
            TreeNode left = node.left;
            node.left = null;
            split(left, v, sP, node);
        }
    }
}
