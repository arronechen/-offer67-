package Niuke.FindNumsAppearOnce;

public class Solution {


        public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
            int num=0;
            for(int i=0;i<array.length;i++){
                num^=array[i];//所有数异或，结果为不同的两个数字的异或
            }
            int count=0;//标志位，记录num中的第一个1出现的位置
            for(;count<array.length;count++){
                if((num&(1<<count))!=0){
                    break;
                }
            }
            num1[0]=0;
            num2[0]=0;
            for(int i=0;i<array.length;i++){
                if((array[i]&(1<<count))==0){//标志位为0的为一组，异或后必得到一个数字（这里注意==的优先级高于&，需在前面加（））
                    num1[0]^=array[i];
                }else{
                    num2[0]^=array[i];//标志位为1的为一组
                }
            }
        }

    public static void main(String[] args) {

    }
}
