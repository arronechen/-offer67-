package Niuke.GetLeastNumbers_Solution;

import java.util.ArrayList;

public class Solution {
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> out = new ArrayList<Integer>();
        if (k==0||input.length<k||input == null ){
            return out;
        }
        QuickSort(input,0,input.length-1);

        for (int i= 0;i<k;i++){
            out.add(input[i]);
        }
        return out;
    }
    public static  void QuickSort(int[] array,int start,int end){
        int i = start;
        int j = end;
        if (start>=end){
            return;
        }
        int midnum = array[start];
        while (j>i){
            while (j>i&&array[j]>=midnum){
                j--;
            }
            while (j>i&&array[i] <= midnum){
                i++;
            }
            if (i < j){
                int tem = array[i];
                array[i] = array[j];
                array[j] = tem;
            }
        }
        array[start] = array[i];
        array[i] = midnum;
        QuickSort(array,start,i-1);
        QuickSort(array,i+1,end);
    }



    public static void main(String[] args) {
        int[] input = {4,5,1,6,2,7,3,8};
        int k = 6;
        System.out.println(GetLeastNumbers_Solution(input,k));

    }

}
