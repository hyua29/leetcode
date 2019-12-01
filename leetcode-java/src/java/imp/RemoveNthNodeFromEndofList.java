package java.imp;

import utils.ListNode;

public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int length = 0;
        ListNode current = head;
        while (current != null) {
            current = current.next;
            length++;
        }

        int removeIndex = length - n + 1;


        if (removeIndex == 1) return head.next;


        int index = 1;
        current = head;
        ListNode previous = null;
        while (current != null) {
            if (index == removeIndex) {
                previous.next = current.next;
                break;
            }
            previous = current;
            current = current.next;
            index++;
        }
        return head;
    }
}
