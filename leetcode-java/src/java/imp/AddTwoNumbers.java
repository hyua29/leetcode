package java.imp;

import java.imp.utils.ListNode;


public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node1 = l1;
        ListNode node2 = l2;
        ListNode resultNode = new ListNode(-1);
        ListNode resultNodeHead = resultNode;
        int remainder = 0;
        while (node1 != null || node2 != null) {
            int val1 = node1 != null ? node1.val : 0;
            int val2 = node2 != null ? node2.val : 0;
            int sum = val1 + val2 + remainder;
            if (sum > 9) {
                sum -= 10;
                remainder = 1;
            } else {
                remainder = 0;
            }

            resultNode.next = new ListNode(sum);
            resultNode = resultNode.next;

            if (node1 != null) {
                node1 = node1.next;
            }

            if (node2 != null) {
                node2 = node2.next;
            }
        }

        if (remainder != 0) {
            resultNode.next = new ListNode(remainder);
        }
        return resultNodeHead.next;
    }

}
