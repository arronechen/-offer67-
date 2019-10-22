package Niuke;


import jdk.nashorn.internal.runtime.FindProperty;

/*
二维数组中的查找
在一个二维数组中（每个一维数组的长度相同），
每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Solution {
    public boolean Find(int target, int [][] array) {
        int row = array.length;
        int col = array[0].length;
        int i = 0;
        int j = col-1;


        if (row == 0||col == 0){
            return false;
        }
        if (target < array[0][0] || target > array[row-1][col-1]) {
            return false;
        }
        while (i <= row-1&&j >= 0){
            if (array[i][j] > target){
                j--;
            }else if (array[i][j] < target){
                i++;
            }else if (array[i][j] == target){
                return true;
            }
        }
        return false;


    }

    public static void main(String[] args) {
        int target = 4;
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        Solution c = new Solution();
        for (int i = 0;i<20;i++){
            boolean find = c.Find(i, array);
            System.out.println(find);
        }

    }
}
