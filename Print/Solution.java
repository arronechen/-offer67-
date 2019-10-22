package Niuke.Print;

import java.util.ArrayList;

public class Solution {
    /**
     * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
     * @param pRoot
     * @return
     */
    static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> out = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> in = new ArrayList<Integer>();
        ArrayList<TreeNode> tree = new ArrayList<TreeNode>();
        if (pRoot == null){
            return out;
        }
        int start = 0;
        int end = 1;
        tree.add(pRoot);
        while (!tree.isEmpty()){
            TreeNode tem = tree.remove(0);
            in.add(tem.val);
            start++;
            if (tem.left != null){
                tree.add(tem.left);
            }
            if (tem.right != null){
                tree.add(tem.right);
            }
            if (start == end){
                end = tree.size();
                start = 0;
                out.add(in);
                in = new ArrayList<Integer>();
            }
        }
        return out;


    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        a.left = b;
        a.right= c;
        b.left = d;
        c.left = e;
        c.right = f;
        ArrayList<ArrayList<Integer>> out = Print(a);
        System.out.println(out);
    }
}
