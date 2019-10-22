package Niuke.Asort;

public class Solution_quicksort {
    public static  void QuickSort(int[] array,int start,int end){
        int i = start;
        int j = end;
        if (start>=end){
            return;
        }
        int midnum = array[start];
        while (j>i){
            while (j>i&&array[j]>=midnum){
                    j--;
            }
            while (j>i&&array[i] <= midnum){
                    i++;
            }
            if (i < j){
                int tem = array[i];
                array[i] = array[j];
                array[j] = tem;
            }
        }
        array[start] = array[i];
        array[i] = midnum;
        QuickSort(array,start,i-1);
        QuickSort(array,i+1,end);
    }

    public static void main(String[] args) {
        int[] arr = {4,5,1,6,2,7,3,8};
        QuickSort(arr,0,arr.length-1);
        for (int i:arr){
            System.out.println(i);
        }
    }
}
