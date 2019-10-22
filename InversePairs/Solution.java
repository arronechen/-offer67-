package Niuke.InversePairs;

public class Solution {
    /**
     * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
     * 输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。
     * 即输出P%1000000007
     * @param array
     * @return
     */
//    public static int InversePairs(int [] array) {
//
//        int len = array.length;
//        int count = 0;
//        if (len == 0){
//            return count;
//        }
//        for (int i = len-1;i>=0;i--){
//            for (int j = 0;j<i;j++){
//                if (array[i] <array[j]){
//                    count++;
//                }
//            }
//        }
//        return count%1000000007;
//    }
    public static int InversePairs(int [] array) {
        if (array == null||array.length ==0){
            return 0;
        }
        int[] copy = new int[array.length];
        for (int i = 0;i<array.length;i++){
            copy[i] = array[i];
        }
        int count =  InversePairsCore(array,copy,0,array.length-1);
        return count;

    }
    public static int InversePairsCore(int[] array,int[] copy,int low,int high){
        if (low == high){
            return 0;
        }
        int mid= (low+high)/2;
        int leftcount = InversePairsCore(array,copy,low,mid)%1000000007;
        int right = InversePairsCore(array,copy,mid+1,high)%1000000007;
        int i = mid;
        int j = high;
        int count = 0;
        int cop = high;
        while (i>=low&&j>mid){
            if (array[i] >array[j]){
                count=count+(j-mid);
                copy[cop--]=array[i--];
                count%=1000000007;
            }else {
                copy[cop--]=array[j--];
            }

        }
        /**
         *当比较结束后，左右两部分必有一部分有元素剩余，将剩余元素复制到copy即可，下面两个循环不分先后。
         */
        for(;j>mid;j--)
        {
            copy[cop--]=array[j];
        }
        for(;i>=low;i--)
        {
            copy[cop--]=array[i];
        }

        for(int s=low;s<=high;s++)
        {
            array[s] = copy[s];
        }
        return (count+leftcount+right)%1000000007;

    }
    public static void main(String[] args) {
        int[] a = {364,637,341,406,747,995,234,971,571,219,993,407,416,366,315,301,601,650,
                418,355,460,505,360,965,516,648,727,667,465,849,455,181,486,149,588,233,
                144,174,557,67,746,550,474,162,268,142,463,221,882,576,604,739,288,569,
                256,936,275,401,497,82,935,983,583,523,697,478,147,795,380,973,958,115,
                773,870,259,655,446,863,735,784,3,671,433,630,425,930,64,266,235,187,284,665,874,80,45,848,38,811,267,575};
        System.out.println(InversePairs(a));
    }
}
