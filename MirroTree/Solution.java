package Niuke.MirroTree;

public class Solution {
    public static void Mirror(TreeNode root) {
        TreeNode temp;
        if (root == null ){
            return;
        }
        temp = root.left;
        root.left = root.right;
        root.right = temp;
        Mirror(root.left);
        Mirror(root.right);
    }
    public static void frontshow(TreeNode root){
        System.out.print(root.val+" ");
        if (root.right != null){
            frontshow(root.left);
        }
        if (root.right != null){
            frontshow(root.right);
        }
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c= new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e= new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        frontshow(a);
        Mirror(a);
        System.out.println();
        frontshow(a);

    }

}
