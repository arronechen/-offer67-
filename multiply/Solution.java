package Niuke.multiply;

public  class Solution {
    public static int[] multiplyfall(int[] A) {
        int[] B = new int[A.length];
        B[0] = 1;
        for (int i = 1;i<A.length;i++){
            B[0] *= A[i];
        }
        for (int j = 1;j<B.length;j++){
            B[j] = B[j-1]*A[j-1]/A[j];
        }
        return B;
    }
    public static int[] multiply(int[] A) {
        int[] B = new int[A.length];
        for (int i = 0;i<A.length;i++){
            B[i] = multiplycore(A,i);
        }
        return B;

    }
    public static int multiplycore(int[] A,int i){
        int count = 1;
        for (int j = 0;j<i;j++){
            count *= A[j];
        }
        for (int k=i+1;k<A.length;k++){
            count *=A[k];
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = {1,2,0,4,5};
        int[] b = multiply(a);
        for (int i:b){
            System.out.print(i+" ");
        }
    }
}
