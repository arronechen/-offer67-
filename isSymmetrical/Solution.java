package Niuke.isSymmetrical;

public class Solution {
    boolean isSymmetrical(TreeNode pRoot)
    {
        if (pRoot == null){
            return true;
        }
        return Symmetrical(pRoot.left,pRoot.right);

    }
    private boolean Symmetrical(TreeNode left,TreeNode right){
        if (left == null&&right==null){
            return true;
        }
        if (left == null||right==null){
            return false;
        }
        if (left.val == right.val){
            return Symmetrical(left.left,right.right)&&Symmetrical(left.right,right.left);
        }
        return false;

    }
}
