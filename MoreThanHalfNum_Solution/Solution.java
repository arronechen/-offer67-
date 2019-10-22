package Niuke.MoreThanHalfNum_Solution;



public class Solution {
    /**
     采用阵地攻守的思想：
     第一个数字作为第一个士兵，守阵地；count = 1；
     遇到相同元素，count++;
     遇到不相同元素，即为敌人，同归于尽,count--；当遇到count为0的情况，又以新的i值作为守阵地的士兵，
     继续下去，到最后还留在阵地上的士兵，有可能是主元素。
     再加一次循环，记录这个士兵的个数看是否大于数组一般即可。
     * @param array
     * @return
     */
    public static int MoreThanHalfNum_Solution(int [] array) {
        int num = 0;
        int count = 0;
        int count1 = 0;
        for (int i = 0;i < array.length;i++){
            if (count == 0){
                num = array[i];
            }
            if (array[i] == num){
                count++;
            }else if(array[i] != num){
                count--;
            }

        }
        for (int i = 0;i < array.length;i++){
            if (array[i] == num){
                count1++;
            }
        }
        if (count1 >array.length/2){
            return num;
        }else {
            return 0;
        }


    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,2,2,2,5,4,2};
        System.out.println(MoreThanHalfNum_Solution(arr));
    }
}
