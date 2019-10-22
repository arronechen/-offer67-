package Niuke.hasPath;

public class htest {
    public static void main(String[] args) {
        Solution s = new Solution();
        char[] arr ={'a','b','c','e','s','f','c','s','a','d','e','e'};
        char[] str ={'a','b','c','c'};
        System.out.println(s.hasPath(arr,3,4,str));
    }
}
