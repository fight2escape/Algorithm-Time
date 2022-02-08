package com.fight2escape.Question;

public class No21_mergeTwoLists {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
//        ListNode list1 = null;
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode res = (new No21_mergeTwoLists()).mergeTwoLists(list1, list2);
        while(res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }



    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode preHead = new ListNode(-1);

        ListNode current = preHead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        current.next = l1 == null ? l2 : l1;

        return preHead.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}