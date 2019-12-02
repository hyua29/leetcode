package java.imp;

import java.imp.utils.ListNode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
//        if (head == null || head.next == null) return head;
//        ListNode parent = head;
//        ListNode child = head.next;
//
//        while (child.next != null) {
//            ListNode nextChild = child.next;
//            child.next = parent;
//            parent = child;
//            child = nextChild;
//        }
//
//        return child;

        if (head == null || head.next == null) return head;
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;

        }

        return prev;
    }


}
