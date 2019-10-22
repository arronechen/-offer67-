package Niuke.LeftRotateString;

public class Solution {
    /**
     * 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
     * 例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。
     * @param str
     * @param n
     * @return
     */
    public static String LeftRotateString(String str,int n) {
        if (str==null||str.length()<=n){
            return str;
        }
        String str1 = new String();
        String str2 = new String();
        for (int i = n;i<str.length();i++){
            str1 += str.charAt(i);
        }
        for (int j = 0;j<n;j++){
            str2 += str.charAt(j);
        }
        return str1+str2;
    }

    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(LeftRotateString(str,3));
    }
}
