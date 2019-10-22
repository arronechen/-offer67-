package Niuke.FindPath;

import java.util.ArrayList;

public class Solution {
    /**
     * 前序遍历加递归
     */
    ArrayList<ArrayList<Integer>> pathlist = new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> path = new ArrayList<Integer>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null){
            return pathlist;
        }
        path.add(root.val);
        target = target-root.val;
        if (target == 0&&root.left == null&&root.right == null){
            pathlist.add(new ArrayList<Integer>(path));//???????
        }
        FindPath(root.left,target);
        FindPath(root.right,target);
        path.remove(path.size()-1);
        return pathlist;



    }

}
