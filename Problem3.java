package Niuke;

import java.util.ArrayList;

public class Problem3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list1= new ArrayList<Integer>();
        ArrayList<Integer> list2= new ArrayList<Integer>();

        ListNode tmp = listNode;
        while (tmp != null){
            list1.add(tmp.val);
            tmp = tmp.next;
        }
        for (int i = list1.size()-1; i>=0;i--){
            list2.add(list1.get(i));
        }
        return list2;

    }
}
