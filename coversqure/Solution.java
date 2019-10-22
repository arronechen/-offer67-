package Niuke.coversqure;

public class Solution {
    /**
     * 注意target=0 的边界条件
     * @param target
     * @return
     */
    public int RectCover (int target) {
        if (target == 0||target == 1||target == 2){
            return target;
        }
        return RectCover(target-1)+RectCover(target-2);

    }
}