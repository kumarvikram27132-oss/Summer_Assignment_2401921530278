package Week_2.Day_3;

public class Implement_Str {
    public static void main(String[] args) {
        String haystack = "sadbutsad", needle = "sad";
        strStr(haystack,needle);
    }
    public static int strStr(String haystack, String needle) {
        int idx=-1;
        for(int i=0;i<haystack.length()-needle.length()+1;i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(haystack.substring(i,needle.length()+i).equals(needle)){
                    return i;
                }
            }}
        return idx;

    }
}
