package Niuke.VerifySquenceOfBST;

import java.util.Arrays;

public class Solution {
    public static boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence == null||sequence.length <=0){
            return false;
        }
        int len = sequence.length;
        int root = sequence[len-1];
        int i;
        //i<len-1
        for (i = 0;i<len-1;i++){
            if (sequence[i]>root){
                break;
            }
        }
        int j ;
        for (j = i;j<len-1;j++){
            if (sequence[j]<root){
                return false;
            }
        }
        boolean leftflag = true;
        if (i>0){
//            int[] lefttree = Arrays.copyOfRange(sequence,0,i);
            int[] lefttree = new int[i];
            for (int m=0;m<i;m++){
                lefttree[m] = sequence[m];
            }
            leftflag = VerifySquenceOfBST(lefttree);
        }
        boolean rightflag = true;
        if (i<len-1){
//            int[] righttree = Arrays.copyOfRange(sequence,i,len-1);
            int[] righttree = new int[len-1-i];
            for (int n =0;n<len-1-i;n++){
                righttree[n] = sequence[i];
            }
            rightflag = VerifySquenceOfBST(righttree);
        }
        return leftflag&&rightflag;


    }

    public static void main(String[] args) {
        int[] a = {7,4,6,5};
        System.out.println(VerifySquenceOfBST(a));
    }
}
