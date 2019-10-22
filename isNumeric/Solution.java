package Niuke.isNumeric;

public class Solution {
    /**
     * 考察正则表达式的应用
     * @param str
     * @return
     */
    public boolean isNumeric(char[] str) {
        if (str == null) return false;
        return new String(str).matches("[+-]?[0-9]*(\\.[0-9]*)?([eE][+-]?[0-9]+)?");

    }
}
