package Week_1.Day_5;

import java.util.Arrays;

public class Longest_Common_Prefix {
    public static void main(String[] args) {
        String str[]={"flower","flow","flight"};
        longestCommonPrefix(str);
    }
    public static String longestCommonPrefix(String[] s) {
        StringBuilder ans=new StringBuilder();
        Arrays.sort(s);
        char[]first=s[0].toCharArray();
        char []last=s[s.length-1].toCharArray();
        for(int i=0;i<first.length;i++){
            if(first[i]!=last[i]) break;
            else{
                ans.append(first[i]);
            }
        }
        return ans.toString();
    }
}
