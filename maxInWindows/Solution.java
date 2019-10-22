package Niuke.maxInWindows;

import java.util.ArrayList;

public class Solution {
    public static ArrayList<Integer> maxInWindows(int [] num, int size) {
        if (size==0) return null;
        ArrayList<Integer> arr = new ArrayList<Integer>(0);
        int start = 0;
        int end = start+size-1;
        while (end < num.length){
            int max = num[start];
            for (int i = start;i <= end;i++){
                if (max < num[i]){
                    max = num[i];
                }
            }
            arr.add(max);
            start++;
            end++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] num = {2,3,4,2,6,2,5,1};
        System.out.println(maxInWindows(num,0));

    }
}
