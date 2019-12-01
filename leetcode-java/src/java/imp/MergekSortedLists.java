package java.imp;

import utils.ListNode;

public class MergekSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode result = new ListNode(0);
        ListNode resultCurrent = result;



        boolean done = false;
        while (!done) {
            int minValue = Integer.MAX_VALUE;
            int minIndex = -1;
            done = true;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null) {
                    done = false;
                    if (lists[i].val < minValue) {
                        minValue = lists[i].val;
                        minIndex = i;
                    }
                }

            }
            if (!done) {
                resultCurrent.next = lists[minIndex];
                resultCurrent = resultCurrent.next;
                lists[minIndex] = lists[minIndex].next;
            }
        }
        return result.next;
    }

}
