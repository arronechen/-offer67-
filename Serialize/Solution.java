package Niuke.Serialize;

public class Solution {
    String str = new String();
    int index = -1;   //计数变量
    String Serialize(TreeNode root) {
        if (root == null){
            return "#";
        }
        str += String.valueOf(root.val)+"!";
        if (root.left!=null||root.right!=null){
            str += Serialize(root.left);
            str += Serialize(root.right);
        }
        return str;
    }

    TreeNode Deserialize(String str) {
        index++;
        //int len = str.length();
        //if(index >= len){
        //    return null;
        // }
        String[] strr = str.split(",");
        TreeNode node = null;
        if(!strr[index].equals("#")){
            node = new TreeNode(Integer.valueOf(strr[index]));
            node.left = Deserialize(str);
            node.right = Deserialize(str);
        }
        return node;
    }

    public static void main(String[] args) {
    }
}
