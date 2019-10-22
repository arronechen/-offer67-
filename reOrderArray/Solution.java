package Niuke.reOrderArray;

public class Solution {
    /**
     * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
     * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
     * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
     * @param array
     */
    public static void reOrderArray(int [] array) {
        int len = array.length;
        int[] num1 = new int[len+10];
        int[] num2 = new int[len+10];
        int count1 = 0;
        int count2 = 0;
        for (int i = 0;i < len;i++){
            if (array[i]%2 != 0){
                num1[count1] = array[i];
                count1++;
            }else if (array[i]%2 == 0){
                num2[count2] = array[i];
                count2++;
            }
        }
        for (int j =0;j<count2;j++){
            num1[count1+j] = num2[j];
        }
        for (int i = 0;i < len;i++){
            array[i] = num1[i];
        }

    }
    public static void reOrderArray2(int [] array) {
        int len = array.length;
        int j = 0;
        while (j < len){
            int i = 0;
            for (;i<len;i++){
                if (array[i]%2 == 0){
                    j = i+1;
                    break;

                }

            }
            for (;j<len;j++){
                if (array[j]%2 != 0){
                    int tem = array[j];
                    for (int k = j;k>i;k--){
                        array[k] = array[k-1];
                    }
                    array[i] = tem;
                    i++;
                    j++;
                }else {
                    j++;
                }
            }

        }

    }
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6,7};
//        reOrderArray(list);
        reOrderArray2(list);
        for (int i:list){
            System.out.print(i+" ");
        }
    }
}
