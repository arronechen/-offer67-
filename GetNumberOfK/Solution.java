package Niuke.GetNumberOfK;

public class Solution {
    /**
     * 统计一个数字在排序数组中出现的次数。
     * @param array
     * @param k
     * @return
     */
    public static int GetNumberOfK(int [] array , int k) {
//        int count = 0;
//        for (int i = 0;i<array.length;i++){
//            if (array[i] == k){
//                count++;
//            }
//        }
//        return count;
        int count = 0;
        int i = 0;
        int j = array.length-1;
        int num = (i+j)/2;
        while (array[num] != k){
            if (array[num]>k){
                j=num-1;
            }if (array[num]<k){
                i = num+1;
            }
            num = (i+j)/2;
        }
        for (int m = num;m <array.length;m++){
            if (array[m] == k){
                count++;
            }else {
                break;
            }
        }
        for (int m = num-1;m >=0;m--){
            if (array[m] == k){
                count++;
            }else {
                break;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,5,5,6};
        System.out.println(GetNumberOfK(array,5));
    }
}
