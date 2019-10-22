package Niuke.Permutation;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    /**
     * 没搞清楚，思路不理解
     * @param str
     * @return
     */
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList<>();
        if (str==null||str.length()<=0) return list;
        process(str.toCharArray(),0,list);
        Collections.sort(list);
        return list;
    }
    public void process(char[] str,int i,ArrayList<String> list){
        if(i == str.length-1){
            String val = String.valueOf(str);
            if(!list.contains(val)){
                list.add(val);
            }
        }else{
            for(int j=i; j<str.length; j++){
                swap(str,i,j);
                process(str, i+1, list);
                swap(str,i,j);
            }
        }
    }
    public void swap(char[] str,int i,int j){
        char tem = str[i];
        str[i] = str[j];
        str[j] = tem;
    }

}
