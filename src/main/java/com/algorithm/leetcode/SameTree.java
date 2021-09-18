package com.algorithm.leetcode;

import java.util.Stack;

public class SameTree {


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


    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if ((p == null && q == null)) {
            return true;
        } else if ((p == null && q != null) || (p != null && q == null)) {
            return false;
        }
        if (p.val != q.val || !isSameTree(p.left, q.left) || !isSameTree(p.right, q.right)) {
            return false;
        }
        return true;
    }

    public static boolean isSameTreePre(TreeNode p, TreeNode q) {
        if ((p == null && q == null)) {
            return true;
        } else if ((p == null && q != null) || (p != null && q == null)) {
            return false;
        }
        Stack<TreeNode> stackP = new Stack<>();
        stackP.push(p);
        Stack<TreeNode> stackQ = new Stack<>();
        stackQ.push(q);
        while (!stackP.isEmpty() || !stackQ.isEmpty()) {
            TreeNode nodeP = stackP.isEmpty() ? null : stackP.pop();
            TreeNode nodeQ = stackQ.isEmpty() ? null : stackQ.pop();
            if (nodeP == null && nodeQ == null) continue;
            if (nodeP != null && nodeQ == null) return false;
            if (nodeP == null && nodeQ != null) return false;
            if (nodeP.val != nodeQ.val) return false;
            stackP.push(nodeP.right);
            stackP.push(nodeP.left);
            stackQ.push(nodeQ.right);
            stackQ.push(nodeQ.left);
        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode treeNode2 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        boolean sameTree = isSameTreePre(treeNode, treeNode2);
        System.out.println("sameTree = " + sameTree);
    }


}
