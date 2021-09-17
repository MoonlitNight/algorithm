package com.algorithm.leetcode;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {


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

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (node != null || !stack.isEmpty()) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                node = stack.pop();
                list.add(node.val);
                node = node.right;
            }
        }
        return list;
    }

    private static void visit(List<Integer> list, TreeNode root) {
        if (root.left != null) visit(list, root.left);
        list.add(root.val);
        if (root.right != null) visit(list, root.right);
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1, new TreeNode(2), null);
        List<Integer> integers = inorderTraversal(treeNode);
        System.out.println("integers = " + JSON.toJSONString(integers));
    }

}
