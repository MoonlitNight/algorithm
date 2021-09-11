package com.algorithm.leetcode;

public class MergeTwoLists {


//    Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }else if(l2==null){
            return l1;
        }
        ListNode result = l1.val<l2.val?l1:l2;
        result.next = mergeTwoLists(result.next, l1.val < l2.val ? l2 : l1);
        return result;
    }

    public static ListNode reverse(ListNode l1) {
        ListNode pre=null,next=null;
        while (l1!=null){
            next=l1.next;
            l1.next=pre;
            pre=l1;
            l1=next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next=new ListNode(4);
//        reverse(l1);
//        ListNode l2 = new ListNode(1);
//        l2.next = new ListNode(3);
//        l2.next.next=new ListNode(4);
        ListNode l2 = new ListNode(5);
        ListNode listNode = mergeTwoLists(l1,  l2);
        System.out.println("listNode = " + listNode);
    }

}
