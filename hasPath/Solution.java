package Niuke.hasPath;

public class Solution {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        int[] flag = new int[matrix.length];
        for (int i =0;i<rows;i++){
            for (int j = 0;j<cols;j++){
                if (hasPathcore(matrix,rows,cols,str,i,j,0,flag)) return true;
            }
        }
        return false;

    }
    public boolean hasPathcore(char[] matrix, int rows, int cols, char[] str,int i,int j,int k,int[] flag){
        int index = i*cols+j;//注意乘的是列数
        if (i<0||i>=rows||j<0||j>=cols||flag[index]==1||matrix[index]!=str[k]){
            return false;
        }
        if (k==str.length-1) return true;
        flag[index] = 1;
        if (hasPathcore(matrix,rows,cols,str,i+1,j,k+1,flag)
                ||hasPathcore(matrix,rows,cols,str,i-1,j,k+1,flag)
                ||hasPathcore(matrix,rows,cols,str,i,j+1,k+1,flag)
                ||hasPathcore(matrix,rows,cols,str,i,j-1,k+1,flag)){
            return true;
        }
        flag[index] = 0;
        return false;

    }

}
