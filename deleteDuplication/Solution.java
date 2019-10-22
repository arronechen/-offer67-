package Niuke.deleteDuplication;

public class Solution {
    /**
     * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，
     * 返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
     * @param pHead
     * @return
     */
    public static ListNode deleteDuplication(ListNode pHead)
    {
        if (pHead == null||pHead.next == null){
            return pHead;
        }

        ListNode head = new ListNode(0);
        head.next = pHead;
        ListNode pre = head;
        ListNode cur = head.next;
        while (cur != null){
            if (cur.next!=null&&cur.val == cur.next.val){
                while (cur.next!=null&&cur.val == cur.next.val){
                    cur = cur.next;
                }
                cur = cur.next;
                pre.next = cur;
            }else{
                pre = pre.next;
                cur = cur.next;

            }
        }
        return head.next;


    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(1);
        ListNode d = new ListNode(1);
        ListNode e = new ListNode(1);
        ListNode g = new ListNode(1);
        ListNode h = new ListNode(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = g;
        g.next = h;
        ListNode dd = deleteDuplication(a);
        while (dd != null){
            System.out.print(dd.val);
            dd = dd.next;
        }
    }
}
