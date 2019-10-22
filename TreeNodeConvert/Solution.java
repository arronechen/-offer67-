package Niuke.TreeNodeConvert;

public class Solution
{
    /**
     * 递归解法
     * @param pRootOfTree
     * @return
     */
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) return null;
        if (pRootOfTree.left == null&&pRootOfTree.right == null) return pRootOfTree;
        TreeNode left = Convert(pRootOfTree.left);
        TreeNode tem = left;
        while (tem!=null&&tem.right!=null) tem = tem.right;
        if (tem!=null){
            tem.right = pRootOfTree;
            pRootOfTree.left = tem;
        }
        TreeNode right = Convert(pRootOfTree.right);
        if (right!=null){
            pRootOfTree.right = right;
            right.left = pRootOfTree;
        }
        return left!=null?left:pRootOfTree;
    }
}
