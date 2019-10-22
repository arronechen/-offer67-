package Niuke.duplicate;

public class Solution {
    /**
     * 请找出数组中任意一个重复的数字。 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
     * @param numbers
     * @param length
     * @param duplication
     * @return
     */
    public static boolean duplicate(int numbers[],int length,int [] duplication) {
        int[] hashtable = new int[length];
        for (int i =0;i<length;i++)
            hashtable[i] = 0;
        for (int i = 0;i<length;i++){
            hashtable[numbers[i]]++;
            if (hashtable[numbers[i]]>1){
                duplication[0] = numbers[i];
                return true;}
        }
        return false;
    }

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,2,3};
        int[] out = {0};
        System.out.println(duplicate(num,num.length,out));
        System.out.println(out[0]);
    }
}
