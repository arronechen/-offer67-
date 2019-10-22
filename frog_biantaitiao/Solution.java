package Niuke.frog_biantaitiao;

public class Solution {
    /**
     * f(n) = f(n-1)+f(n-2)+...+f(n-(n-1)) + f(n-n) => f(0) + f(1) + f(2) + f(3) + ... + f(n-1) == f(n) = 2*f(n-1)
     * f(n) = 2^(n-1)
     * @param target
     * @return
     */
    public int JumpFloorII(int target) {
        if(target == 0||target == 1||target == 2){
            return target;
        }
        return 2*JumpFloorII(target-1);


    }
}