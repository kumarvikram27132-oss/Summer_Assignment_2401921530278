package Week_2.Day_5;

import java.util.*;

public class Group_anagram {
    public static void main(String[] args) {
String []str={"eat","tea","tan","ate","nat","bat"};
groupAnagrams(str);
    }
    public static List<List<String>> groupAnagrams(String[] s){
        HashMap<String,ArrayList<String>> anagrams=new HashMap<>();
        for(int i=0;i<s.length;i++){
            String key=Genrate(s[i]);
            if(!anagrams.containsKey(key)){
                anagrams.put(key,new ArrayList<>());
            }
            anagrams.get(key).add(s[i]);
        }
        return new ArrayList<>(anagrams.values());
    }
    static String Genrate(String s){
        int []count=new int[26];
        for(char ch:s.toCharArray()){
            count[ch-'a']+=1;
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<26;i++) {


            ans.append('#');
            ans.append(count[i]);
        }
        return ans.toString();}
}