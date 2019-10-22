package Niuke.KthNode;

public class Solution {
    /**
     * 思路还不太清楚
     */
    int count = 0;
    TreeNode node = null;
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if (k==count||pRoot==null){
            return node;
        }
        KthNode(pRoot.left,k);
        count++;
        if (k == count){
            node = pRoot;
            return node;
        }
        KthNode(pRoot.right,k);
        return node;

    }
}
