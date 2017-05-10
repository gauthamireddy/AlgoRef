/**
 * Created by ggaddam on 8/21/2016.
 */
public class SwapNodes {
        public ListNode swapPairs(ListNode head) {
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode pre = dummy;
            while(head != null && head.next != null) {
                ListNode p  = head.next.next;
                pre.next = head.next;
                pre.next.next = head;
                head.next = p;
                pre = head;
                head = p;
            }

            return dummy.next;
        }

    private static class ListNode {
        int val;
       ListNode next;
        ListNode(int x) { val = x; }
    }
        }

