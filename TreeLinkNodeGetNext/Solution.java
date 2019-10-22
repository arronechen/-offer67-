package Niuke.TreeLinkNodeGetNext;

public class Solution {
    /**
     * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
     * 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
     * @param pNode
     * @return
     */
    public static TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        TreeLinkNode tem = null;

        if (pNode.right != null){
            tem = pNode.right;
            while (tem.left != null){
                tem = tem.left;
            }
            return tem;
        }
        while (pNode.next != null&&pNode.next.right == pNode){
            pNode = pNode.next;
        }
        return pNode.next;

    }
}
