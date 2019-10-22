package Niuke.RandomListNodeClone;

public class Solution {
    public RandomListNode Clone(RandomListNode pHead)
    {
        while (pHead == null) return null;
        RandomListNode cur = pHead;
        while (cur !=null){
            RandomListNode clone1 = new RandomListNode(cur.label);
            clone1.next = cur.next;
            cur.next = clone1;
            cur = clone1.next;
        }
        cur = pHead;
        while (cur != null){
            RandomListNode clone2 = cur.next;
            if (cur.random!=null) clone2.random = cur.random.next;
            cur = clone2.next;
        }
        cur = pHead;
        RandomListNode out = pHead.next;
        while (cur.next != null){
            RandomListNode clone3 = cur.next;
            cur.next = clone3.next;
            cur = clone3;
        }
        return out;

    }
}
