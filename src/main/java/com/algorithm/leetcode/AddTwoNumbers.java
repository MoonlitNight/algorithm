package com.algorithm.leetcode;

public class AddTwoNumbers {


    // Definition for singly-linked list.

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            ListNode  temp = this;
            while (temp!=null){
                stringBuilder.append(temp.val);
                temp = temp.next;
            }
            return stringBuilder.toString();
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(),temp=result;
        while (l1!=null || l2!=null){
            int n1 = l1==null?0:l1.val;
            int n2 = l2==null?0:l2.val;
            int sum = n1+n2+temp.val;
            ListNode next =(l1==null||l1.next==null)&&(l2==null||l2.next==null)&&sum<10?null: new ListNode();
            if(sum<10){
                temp.val = sum;
            }else{
                temp.val = sum-10;
                next.val=1;
            }
            temp.next=next;
            temp = next;
            l1 = l1==null?null: l1.next;
            l2 = l2==null?null: l2.next;
        }
        return result;
    }

    public static void main(String[] args) {
//        ListNode l1 = new ListNode(2,new ListNode(4,new ListNode(3)));
//        ListNode l2 = new ListNode(5,new ListNode(6,new ListNode(4)));
//        ListNode node = addTwoNumbers(l1, l2);
//        System.out.printf(JSON.toJSONString(node));
        ListNode l1 = new ListNode(9),temp=l1;
        for (int i = 0; i < 6; i++) {
            temp.next = new ListNode(9);
            temp = temp.next;
        }
        ListNode l2 = new ListNode(9),temp2=l2;
        for (int i = 0; i < 3; i++) {
            temp2.next = new ListNode(9);
            temp2 = temp2.next;
        }
        ListNode node = addTwoNumbers(l1, l2);
        System.out.println(node);
    }

}
