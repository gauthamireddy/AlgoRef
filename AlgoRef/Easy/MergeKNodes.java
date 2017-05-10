public class Solution{

    public ListNode MergeKLists(ListNode[] lists) {
        if (lists.length == 0 || lists == null) return null;
        ListNode newhead = lists[0];
        for (int i = 0; i < lists.length; i++){
            newhead = mergeNodes(newhead, lists[i]);
    }
        return newhead;
    }


    private ListNode MergeNodes(ListNode l1, ListNode l2){
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode dummy = new ListNode(0);
        ListNode iterator = dummy;
        while(l1!=null && l2!=null) {
            while (l1.val < l2.val) {
                iterator.next = l1;
                l1 = l1.next;
            }
            else
            {
                iterator.next = l2;
                l2 = l2.next;
            }
            iterator = iterator.next;
        }
       /* if(l1== null) iterator.next = l2; l2=l2.next;
        if(l2==null) iterator.next = l1; l1=l1.next;*/

        iterator.next = l1==null? l2: l1;
        return dummy.next;

    }

}

