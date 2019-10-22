package Niuke.isContinuous;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static boolean isContinuous(int [] numbers) {
        if (numbers.length!=5){
            return false;
        }
        Arrays.sort(numbers);
        int count = 0;
        for (int x:numbers){
            if (x==0) count++;
        }
        for (int i = count;i<numbers.length-1;i++){
            if (numbers[i] == numbers[i+1]) return false;
            count -= numbers[i+1]-numbers[i]-1;
        }
        return count>=0?true:false;
    }

    public static void main(String[] args) {
        int[] arry = {1,2,3,0,6};
        System.out.println(isContinuous(arry));
    }
}
