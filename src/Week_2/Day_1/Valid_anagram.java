package Week_2.Day_1;

import java.util.HashMap;

public class Valid_anagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        valid_anagram(s,t);
    }
    public  static
    boolean valid_anagram(String s1, String s2) {

        HashMap<Character,Integer> map=new HashMap<>();
            if(s1.length()!=s2.length()) return false;
    int []arr=new int[26];
        for(int i=0;i<s1.length();i++){
        arr[s1.charAt(i)-'a']++;
        arr[s2.charAt(i)-'a']--;
    }
        for(int count:arr){
        if(count!=0) return false;
    }
        return true;
}}
