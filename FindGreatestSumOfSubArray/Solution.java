package Niuke.FindGreatestSumOfSubArray;

public class Solution {
    public static int FindGreatestSumOfSubArray(int[] array) {
        if (array==null||array.length<=0){
            return 0;
        }
        int sum = array[0];
        int max = array[0];
        for (int i = 1;i<array.length;i++){

            sum = getmax(sum+array[i],array[i]);
            max = getmax(max,sum);
        }
        return max;
    }
    public static int getmax(int a,int b){
        return a>b?a:b;
    }

    public static void main(String[] args) {
        int[] arr = {6,-3,-2,7,-15,1,2,2};
        System.out.println(FindGreatestSumOfSubArray(arr));
    }
}
