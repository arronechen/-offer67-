package Niuke.minnumber;

public class Solution {
    public static int minNumberInRotateArray(int [] array) {
        int min = array[0];
        for(int i = 0;i < array.length;i++){
            if (min > array[i]){
                min = array[i];
            }
        }
        return min > 0?min:0;



    }

    public static void main(String[] args) {
        int[] a = {1,2,4,5,8,90,0};
        System.out.println(minNumberInRotateArray(a));
    }
}