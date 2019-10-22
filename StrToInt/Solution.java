package Niuke.StrToInt;

public class Solution {
    /**
     * "+"的优先级高于"<<",
     * @param str
     * @return
     */
    public static int StrToInt(String str) {
        if (str == null||str.length()<=0) return 0;
        char[] str1 = str.toCharArray();
        int sym = 1;
        int len = str1.length;
        int res = 0;
        if (str1[0] == '-') sym = -1;
        for (int i = (str1[0]=='-'||str1[0]=='+')?1:0;i<len;i++){
            if (str1[i]>='0'&&str1[i]<='9'){
                res = (res<<1)+(res<<3)+(str1[i]-'0');
            }else {
                return 0;
            }

        }
        return res*sym;
    }

    public static void main(String[] args) {
        String str = "";
        System.out.println(StrToInt(str));
        System.out.println((1<<1)+(1<<3));
    }
}
