/**
 * Created by ggaddam on 8/21/2016.
 */
public class ReverseLinkedList {
        public ListNode reverseList(ListNode head) {
            if(head == null || head.next == null) return head;
            ListNode pre = null;
            while(head != null) {
                ListNode next = head.next;
                head.next = pre;
                pre = head;
                head = next;
            }

            return pre;
        }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}



