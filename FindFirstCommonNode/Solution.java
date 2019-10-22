package Niuke.FindFirstCommonNode;

public class Solution {
    /**
     * 两条链表存在公共节点，则和Y类似，只需要找到长度差x，让较长的先走x步，然后向后遍历即可。
     * @param pHead1
     * @param pHead2
     * @return
     */
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == pHead2){
            return pHead1;
        }
        int L1 = getlength(pHead1);
        int L2 = getlength(pHead2);
        if (L1 > L2){
            for (int i = 0;i <(L1-L2);i++){
                pHead1 = pHead1.next;
            }
        }else if (L1 < L2){
            for (int i = 0;i <(L2-L1);i++){
                pHead2= pHead2.next;
            }
        }
        boolean f = true;
        ListNode tem = null;
        while (f){
            if (pHead1 == pHead2){
                tem = pHead1;
                f = false;
            }else if (pHead1==null||pHead2==null){
                f = false;
            }else {
                pHead1 = pHead1.next;
                pHead2 = pHead2.next;
            }
        }
        return tem;


    }
    public int getlength(ListNode pHead){
        int length = 0;
        while (pHead != null){
            length++;
            pHead = pHead.next;
        }
        return length;
    }
}
