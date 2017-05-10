/**
 * Created by ggaddam on 8/22/2016.
 */
public class IntersectionLinkedLists {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if(headA == null || headB == null) return null;
            ListNode iterateA = headA, iterateB = headB;

            while(iterateA != null || iterateB != null) {
                while(iterateA != null && iterateB != null) {
                    if(iterateA == iterateB) return iterateA;
                    iterateA = iterateA.next;
                    iterateB = iterateB.next;
                }
                if(iterateA == null && iterateB == null) return null;
                if(iterateA == null) iterateA = headB;
                if(iterateB == null) iterateB = headA;
            }

            return null;
        }
    }
