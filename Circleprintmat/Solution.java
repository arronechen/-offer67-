package Niuke.Circleprintmat;

import java.util.ArrayList;
public class Solution {
    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        ArrayList<Integer> list = new ArrayList<Integer>(row*col);
        int up = 0;
        int down = row-1;
        int left = 0;
        int right = col-1;
        while (true){
            for (int i = left;i<=right;i++){
                list.add(matrix[up][i]);
            }
            if (++up>down){
                break;
            }
            for (int j = up;j<=down;j++){
                list.add(matrix[j][right]);
            }if (--right<left){
                break;
            }
            for (int k = right;k>=left;k--){
                list.add(matrix[down][k]);
            }
            if (--down<up){
                break;
            }
            for (int m = down;m>=up;m--){
                list.add(matrix[m][left]);
            }
            if (++left>right){
                break;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] a = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] b ={{1,2,3,4,5},{6,7,8,9,10}};
        ArrayList<Integer> list = printMatrix(b);
        for (int num:list){
            System.out.print(num+" ");
        }
    }
}