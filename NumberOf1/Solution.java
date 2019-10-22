package Niuke.NumberOf1;

public class Solution {
    public static int NumberOf1(int n) {
        int count = 0;
        while(n != 0){
            ++count;
            n=n&(n-1);
        }
        return count;

    }
    public static int NumberOf12(int n) {
        int count = 0;
        for (int i = 0;i<32;i++){
            if ((n>>>i&n)==1){
                ++count;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(NumberOf1(10));
        System.out.println(NumberOf12(10));
    }
}
