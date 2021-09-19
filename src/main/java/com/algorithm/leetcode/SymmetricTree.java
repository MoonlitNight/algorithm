package com.algorithm.leetcode;

import java.util.LinkedList;

public class SymmetricTree {

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

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetric(root.left, root.right);
    }

    public static boolean isSymmetric(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if ((node1 == null && node2 != null) || (node1 != null && node2 == null) || (node1.val != node2.val)) {
            return false;
        }
        return isSymmetric(node1.left, node2.right) && isSymmetric(node1.right, node2.left);
    }

    private static boolean isSymmetricMid(TreeNode root) {
        if (root == null) {
            return true;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);
        while (!queue.isEmpty()) {
            TreeNode node1 = queue.poll();
            TreeNode node2 = queue.poll();
            if ((node1 == null && node2 != null) || (node1 != null && node2 == null)) {
                return false;
            } else if (node1 == null && node2 == null) {
                continue;
            } else if (node1.val != node2.val) {
                return false;
            }
            queue.push(node1.left);
            queue.push(node2.right);
            queue.push(node1.right);
            queue.push(node2.left);
        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(3)));
        boolean symmetric = isSymmetric(treeNode);
        System.out.println("symmetric = " + symmetric);
    }

}
