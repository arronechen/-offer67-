package Niuke;

public class reverselist {
    public static ListNode ReverseList(ListNode head) {
        if (head == null||head.next == null ){
            return head;
        }
        ListNode pre = head;
        ListNode cur = head.next;
        ListNode tmp;
        while (cur != null){
            tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur =tmp;
        }
        head.next = null;
        return pre;

    }
    public static ListNode FindKthToTail(ListNode head,int k) {
        if (head == null||k <=0){
            return null;
        }
        ListNode tem1 = head;
        ListNode tem2 = head;
        for (int i = 1; i < k; i++) {
            // 说明还有结点
            if (tem1.next != null) {
                tem1 = tem1.next;
            }
            // 已经没有节点了，但是i还没有到达k-1说明k太大，链表中没有那么多的元素
            else {
                // 返回结果
                return null;
            }
        }
        while (tem1.next != null){
            tem1 = tem1.next;
            tem2 = tem2.next;
        }
        return tem2;

    }
    public static void  printlist(ListNode head){
        ListNode tmp = head;
        while (tmp != null){
            System.out.print(tmp.val+" ");
            tmp = tmp.next;
        }
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(100);
        ListNode node2 = new ListNode(30);

        node1.next = node2;

        printlist(node1);
        System.out.println(FindKthToTail(node1,2).val);



    }
}
