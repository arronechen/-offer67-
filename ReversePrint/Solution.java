package Niuke.ReversePrint;



import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    /**
     * 通过观察，运用两个栈分别记录偶数行节点和奇数行节点；
     * 偶数行节点按从左到右顺序入栈，奇数行节点按从右到左入栈。
     * @param pRoot
     * @return
     */
    public static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> out = new ArrayList<ArrayList<Integer>>();
        if (pRoot == null){
            return out;
        }
        TreeNode root = pRoot;
        Stack<TreeNode> stack1 = new Stack<TreeNode>();
        Stack<TreeNode> stack2 = new Stack<TreeNode>();
        stack1.push(pRoot);
        while (!stack1.empty()||!stack2.empty()){
            ArrayList<Integer> list = new ArrayList<>();
            ArrayList<Integer> list2 = new ArrayList<>();
            TreeNode tem ;
            while (!stack1.empty()){
                tem = stack1.peek();
                if (tem.left!=null)
                    stack2.push(tem.left);
                if (tem.right!=null)
                    stack2.push(tem.right);
                list.add(tem.val);
                stack1.pop();
            }
            if (!list.isEmpty())
                out.add(list);
            while (!stack2.empty()){
                tem = stack2.peek();
                if (tem.right!=null)
                    stack1.push(tem.right);
                if (tem.left!=null)
                    stack1.push(tem.left);
                list2.add(tem.val);
                stack2.pop();
            }
            if (!list2.isEmpty())
                out.add(list2);
        }
        return out;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        node1.left = node2;
        node2.left = node3;
        node3.left = node4;

        System.out.println(Print(node1));
    }
}
