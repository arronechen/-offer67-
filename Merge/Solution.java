package Niuke.Merge;

public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode list =null;
        if (list1 == null&&list2 == null){
            return list;
        }
        if (list1 == null){
            return list2;
        }
        if (list2 == null){
            return list1;
        }
        if (list1.val<=list2.val){
            list = list1;
            list.next = Merge(list1.next,list2);
        }else if (list1.val>list2.val){
            list = list2;
            list.next = Merge(list1,list2.next);
        }
        return list;


    }
}
