package Niuke.ABsubtree;

public class Solution {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root1 == null||root2 == null){
            return false;
        }
        return Issubtree(root1,root2)||HasSubtree(root1.left,root2)||HasSubtree(root1.right,root2);
    }
    public boolean Issubtree(TreeNode roota,TreeNode rootb){
        if (roota == null){
            return false;
        }
        if (rootb == null){
            return true;
        }
        if (roota.val != rootb.val){
            return false;
        }
        return Issubtree(roota.left,rootb.left) && Issubtree(roota.right,rootb.right);


    }
}