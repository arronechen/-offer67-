package Niuke.ReverseSentence;

public class Solution {
    /**
     * 字符串翻转,利用split函数将字符串分解成字符串数组；注意字符串是" "的测试用例，此时返回的字符串数组；
     * 为空，但是不应当返回null，应当返回原字符串。
     * @param str
     * @return
     */

    public static String ReverseSentence(String str) {
        String out = new String();
        if (str == null) return out;

        String[] arr = str.split(" ");
        if (arr == null||arr.length<=0){
            return str;
        }
        for (int i = arr.length-1;i>=0;i--){
            out +=arr[i];
            if (i>0) out += " ";
        }
        return out;
    }
    public static void main(String[] args) {
        String str ="student. a am I";
        System.out.println(ReverseSentence("a b"));


    }
}
