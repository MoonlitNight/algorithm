package com.algorithm.leetcode;

import java.util.LinkedList;

public class MaximumDepthOfBinaryTree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static int maxDepth(TreeNode root) {
        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public static int maxDepthFloor(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int depth = 0;
        LinkedList<TreeNode> list = new LinkedList<>();
        list.add(root);
        while (!list.isEmpty()) {
            int len = list.size();
            for (int i = 0; i < len; i++) {
                TreeNode node = list.poll();
                if (i == len - 1) {
                    depth++;
                }
                if (node.left != null) list.offer(node.left);
                if (node.right != null) list.offer(node.right);
            }
        }
        return depth;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3, null, new TreeNode(5)));
        int i = maxDepth(root);
        System.out.println("i = " + i);
    }

}
