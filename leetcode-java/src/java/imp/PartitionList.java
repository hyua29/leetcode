package java.imp;

import java.imp.utils.ListNode;

public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        if (head == null) return head;

        ListNode dummyHead1 = new ListNode(0);
        ListNode dummyHead2 = new ListNode(0);

        ListNode dummy1 = dummyHead1;
        ListNode dummy2 = dummyHead2;

        ListNode child = head;

        while (child != null) {
            if (child.val < x) {
                dummy1.next = child;
                dummy1 = dummy1.next;
            } else {
                dummy2.next = child;
                dummy2 = dummy2.next;
            }
            child = child.next;
        }

        dummy2.next = null;
        dummy1.next = dummyHead2.next;
        return dummyHead1.next;
    }
}