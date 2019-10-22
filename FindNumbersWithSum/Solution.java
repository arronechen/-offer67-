package Niuke.FindNumbersWithSum;

import java.util.ArrayList;

public class Solution {
    /**
     * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，
     * 如果有多对数字的和等于S，输出两个数的乘积最小的。
     * 设置两个指针分别指向头尾，如果大于sum则尾指针向后一位，反之头指针向前一位。注意当尾指针等于头指针停止；
     * 注意输入数组为空数组的边界条件；
     *
     * @param array
     * @param sum
     * @return
     */
    public static ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> result = new ArrayList<>(2);
        if (array.length == 0) {
            return result;
        }
        int i = 0;
        int j = array.length - 1;
        while (array[i] + array[j] != sum && i < j) {
            if (array[i] + array[j] > sum) {
                j = j - 1;
            } else {
                i = i + 1;
            }
        }
        if (i == j) {
            return result;
        }
        result.add(array[i]);
        result.add(array[j]);
        return result;

    }


    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6};
        int s = 8;
        ArrayList<Integer> list = FindNumbersWithSum(a, s);
        for (int num : list) {
            System.out.println(num);
        }
    }
}
