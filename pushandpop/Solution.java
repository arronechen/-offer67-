package Niuke.pushandpop;
import java.util.ArrayList;

public class Solution {
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int j=0;
        for (int i = 0;i<pushA.length;i++){
            list.add(pushA[i]);

            while (list.get(list.size() - 1) == popA[j]) {
                    list.remove(list.size() - 1);
                    if (j<popA.length-1){
                        j++;
                    }else {
                        break;
                    }
            }

        }
        if (list.size() == 0){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {4,3,5,2,1};
        System.out.println(IsPopOrder(a,b));
    }
}