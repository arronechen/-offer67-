package Niuke.LastRemaining_Solution;

import java.util.ArrayList;

public class Solution {
    public static int LastRemaining_Solution(int n, int m) {
        if (n<=0||m<=1) return -1;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i<n;i++){
            list.add(i);
        }
        int index = 0;
        while (list.size()>1){
            index = (index+m-1)%list.size();//找出每次需要删除节点序号是关键
            list.remove(index);

        }
        return list.get(0);
    }

    public static void main(String[] args) {
        System.out.println(LastRemaining_Solution(5,2));
    }
}
