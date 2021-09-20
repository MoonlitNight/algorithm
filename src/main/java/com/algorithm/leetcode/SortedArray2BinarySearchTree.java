package com.algorithm.leetcode;

public class SortedArray2BinarySearchTree {

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

    public static TreeNode sortedArrayToBST(int[] nums) {
        int l = 0, r = nums.length - 1;
        return buildTreeNode(nums, l, r);
    }

    private static TreeNode buildTreeNode(int[] nums, int l, int r) {
        if (l > r) {
            return null;
        }
        if (l == r) {
            return new TreeNode(nums[l]);
        }
        int mid = l + (r - l) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = buildTreeNode(nums, l, mid - 1);
        node.right = buildTreeNode(nums, mid + 1, r);
        return node;
    }


    public static void main(String[] args) {
        int[] nums = {1,3};
        TreeNode node = sortedArrayToBST(nums);
        System.out.println("node = " + node);
    }

}
