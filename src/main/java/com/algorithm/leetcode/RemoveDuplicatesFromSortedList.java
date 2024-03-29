package com.algorithm.leetcode;

public class RemoveDuplicatesFromSortedList {


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode cur = head.next, pre = head;
        while (cur != null) {
            if(cur.val==pre.val){
                pre.next = null;
            }else{
                pre.next=cur;
                pre = cur;
            }
            cur = cur.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(2);
        ListNode listNode4 = new ListNode(3);
        ListNode listNode5 = new ListNode(3);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;
        listNode4.next=listNode5;
        ListNode listNode = deleteDuplicates(listNode1);
        System.out.println("listNode = " + listNode);
    }
}
