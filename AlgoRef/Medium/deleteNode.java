/**
 * Created by ggaddam on 8/21/2016.
 */
public class deleteNode {
        public void deleteNode(ListNode node) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
}
