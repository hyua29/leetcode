package java.imp;

import utils.ListNode;


public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;

        ListNode evenHead = head.next;

        ListNode oddNode = head;
        ListNode evenNode = evenHead;
        while (evenNode.next != null) {
            oddNode.next = oddNode.next.next;
            oddNode = oddNode.next;

            if (evenNode.next.next == null) {
                evenNode.next = null;
            } else {
                evenNode.next = evenNode.next.next;
                evenNode = evenNode.next;
            }
        }

        oddNode.next = evenHead;
        return head;
    }

}
