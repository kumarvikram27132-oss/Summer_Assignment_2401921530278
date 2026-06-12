package Week_2.Day_2;

import java.util.HashSet;

public class Longest_Substring_Without_Repeating_Charactr {
    public static void main(String[] args) {
       String  s = "abcabcbb";
        lengthOfLongestSubstring(s);
    }
    public static int lengthOfLongestSubstring(String str) {
        int maxlength=0;
        int left=0;
        HashSet<Character> map=new HashSet<>();
        for(int rigth=0;rigth<str.length();rigth++){
            while(map.contains(str.charAt(rigth))){
                map.remove(str.charAt(left));
                left++;
            }
            map.add(str.charAt(rigth));
            maxlength=Math.max(maxlength,rigth-left+1);
        }
        return maxlength;
    }
}
