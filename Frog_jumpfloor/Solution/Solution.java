package Niuke.Frog_jumpfloor.Solution;

public class Solution {
    public int JumpFloor(int target) {
        if (target <= 0){
           return 0;
        }
        if (target == 1||target == 2){
            return 1;
        }
        return JumpFloor(target-1)+JumpFloor(target-2);


    }
}
