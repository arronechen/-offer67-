package Niuke.EntryNodeOfLoop;

public class Solution {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        ListNode fast = pHead;
        ListNode slow = pHead;
        if (pHead.next==null){//可能只有一个节点，当访问它子节点的子节点时就会报错
            return null;
        }
        do {
            fast = fast.next.next;
            slow = slow.next;
        }while (slow!=null&&fast != slow);
        if (slow == null){
            return null;
        }
        slow = pHead;
        while (fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;

    }
}
