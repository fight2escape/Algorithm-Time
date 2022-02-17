package com.fight2escape.Question;

public class No2_addTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(5)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode res = (new No2_addTwoNumbers()).addTwoNumbers(l1, l2);
        while(res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode();
        ListNode res_head = pre;
        int add = 0, sum;
        while (true) {
            int v1 = l1 == null ? 0 : l1.val;
            int v2 = l2 == null ? 0 : l2.val;

            sum = v1 + v2 + add;
            add = sum / 10;

            pre.next = new ListNode(sum % 10);
            pre = pre.next;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            if ((l1 == null || l2 == null) && add == 0) {
                break;
            }
        }

        if (l1 != null) {
            pre.next = l1;
        }
        if (l2 != null) {
            pre.next = l2;
        }

        return res_head.next;
    }
}
