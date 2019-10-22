package Niuke.FirstNotRepeatingChar;

public class Solution {
    /**
     * 全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
     * @param str
     * @return
     */
    public static int FirstNotRepeatingChar(String str) {
        if (str == null||str.length()==0){
            return -1;
        }
        int out = 0;
        int[] hashtable = new int[256];
        for (int i = 0;i<256;i++){
            hashtable[i] = 0;
        }
        char[] hashkey = str.toCharArray();
        for (int i = 0;i<hashkey.length;i++){
            hashtable[(int)hashkey[i]]++;
        }
        for (int i = 0;i<hashkey.length;i++){
            if (hashtable[hashkey[i]] == 1){
                out = hashkey[i];
                return str.indexOf((char)out);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "NXWtnzyoHoBhUJaPauJaAitLWNMlkKwDYbbigdMMaYfkVPhGZcrEwp";
        System.out.println(FirstNotRepeatingChar(str));
    }
}
