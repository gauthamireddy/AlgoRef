//assuming  that l1 and l2 have equal number of nodes.
public class Solution{
    public ListNode AddTwoLinkedLists(ListNode l1, ListLode l2){
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode dummy = new ListNode(0);
        ListNode iterator = dummy;
        int carry = 0;
        while(l1!=null || l2!= null) {
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            int sum = l1 + l2 + carry;
            carry = sum/10;
            iterator.next = new ListNode(sum%10);
            iterator = iterator.next;
            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;
        }
        if(carry!=0) iterator.next = new ListNode(carry);
        return dummy.next

        }
    }
}