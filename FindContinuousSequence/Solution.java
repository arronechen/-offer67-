package Niuke.FindContinuousSequence;

import java.util.ArrayList;

public class Solution {
    /**
     * 输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
     * 双指针法
     * @param sum
     * @return
     */
    public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        if (sum < 3) {
            return list;
        }
        int low = 1;
        int high = 2;
        while (low < high){
            int pnum = (high+low)*(high-low+1)/2;
            if (pnum == sum){
                ArrayList<Integer> lis = new ArrayList<>();
                for (int i = low;i<=high;i++){
                    lis.add(i);
                }
                list.add(lis);
                low++;
            }else if (pnum > sum){
                low++;
            }else if (pnum<sum){
                high++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = FindContinuousSequence(1000000);
        System.out.println(list.get(list.size()-1));
    }
}
