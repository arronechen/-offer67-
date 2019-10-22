package Niuke.GetUglyNumber_Solution;

public class Solution {
    public static int GetUglyNumber_Solution(int index) {
        if (index <1) return 1;
        int[] arr = new int[index];
        arr[0] = 1;
        int num1 = 0,num2 = 0,num3 =0;
        for (int i = 1;i<index;i++){
            int newnum = mincore(arr[num1]*2,arr[num2]*3,arr[num3]*5);
            if (newnum == arr[num1]*2) num1++;
            if (newnum == arr[num2]*3) num2++;
            if (newnum == arr[num3]*5) num3++;
            arr[i] = newnum;
        }
        return arr[index-1];
    }
    public static int mincore(int a,int b,int c){
        int tem = a;
        if (tem > b) tem = b;
        if (tem > c) tem = c;
        return tem;
    }

    public static void main(String[] args) {

        System.out.print(GetUglyNumber_Solution(10) + " ");
    }
}
