package Niuke.FirstAppearingOnce;

public class Solution {
    //Insert one char from stringstream
    int[] hashmap = new int[128];
    StringBuffer sb = new StringBuffer();
    public void Insert(char ch)
    {
        sb.append(ch);
        hashmap[ch]++;

    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        for (int i = 0;i<sb.length();i++){
            if (hashmap[sb.charAt(i)]==1){
                return sb.charAt(i);
            }
        }
        return '#';

    }
}
