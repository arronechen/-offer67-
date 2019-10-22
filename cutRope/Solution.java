package Niuke.cutRope;

public class Solution {
    /**
     * 贪婪算法
     * @param target
     * @return
     */
    public static int cutRope(int target) {
        if (target < 2){
            return 0;
        }else if (target==2){
            return 1;
        }else if (target==3){
            return 2;
        }
        int timeof3 = target/3;
        if (target%3 == 1){
            timeof3--;
        }
        int timeof2 = (target - 3*timeof3)/2;
        double out = Math.pow(3,timeof3)*Math.pow(2,timeof2);
        return (int)out;
    }

    /**
     * 动态规划
     * @param target
     * @return
     */
    public static int cutRope1(int target){
        if (target <2) return 0;
        if (target==2) return 1;
        if (target==3) return 2;
        int[] product = new int[target+1];
        product[0] = 0;
        product[1] = 1;
        product[2] = 2;
        product[3] = 3;
        for (int i = 4;i<=target;i++){
            int max = 0;
            for (int j =1;j<=i/2;j++){
                int num = product[j]*product[i-j];
                if (num>max) max=num;
            }
            product[i] = max;
        }
        return product[target];


    }

    public static void main(String[] args) {
        System.out.println(cutRope(8));
        System.out.println(cutRope1(8));
    }
}
