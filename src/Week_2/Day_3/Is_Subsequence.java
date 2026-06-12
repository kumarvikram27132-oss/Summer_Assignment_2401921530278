package Week_2.Day_3;

public class Is_Subsequence {
    public static void main(String[] args) {
 String s = "abc", t = "ahbgdc";
    isSubsequence(s,t);
    }
    public static boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == s.length();
    }}