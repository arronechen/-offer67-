package Niuke.Power;

public class Solution {
    /**
     * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
     保证base和exponent不同时为0
     * @param base
     * @param exponent
     * @return
     */
    public double Power(double base, int exponent) {
        double res = 1.0;
        if(exponent == 0){
            return res;
        }
        if(exponent > 0){
            for(int i = 0;i < exponent;i++){
                res *= base;
            }
        }
        if(exponent < 0){
            for(int i = 0;i < -exponent;i++){
                res *= base;
            }
        }
        return exponent>0?res:1/res;

    }
}
