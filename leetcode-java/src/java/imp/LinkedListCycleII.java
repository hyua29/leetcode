package java.imp;

import java.imp.utils.ListNode;

public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;


        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                break;
            }
        }

        if (fast == null || fast.next == null) return null;
        else return slow;
    }
}
