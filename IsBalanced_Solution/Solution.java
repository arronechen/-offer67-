package Niuke.IsBalanced_Solution;

public class Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null){
            return true;
        }
        int L = treedepth(root.left);
        int R = treedepth(root.right);
        if (L-R>1||R-L>1){
            return false;
        }
        return IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right);


    }
    public int treedepth(TreeNode root){
        if (root == null){
            return 0;
        }
        int deep1 = treedepth(root.left);
        int deep2 = treedepth(root.right);
        return deep1>deep2?deep1+1:deep2+1;

    }
}
