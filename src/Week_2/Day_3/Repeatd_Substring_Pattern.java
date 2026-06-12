package Week_2.Day_3;

public class Repeatd_Substring_Pattern {
    public static void main(String[] args) {
        String s = "abab";
        repeatedSubstringPattern(s);
    }
    public static boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;
        return doubled.substring(1, doubled.length() - 1).contains(s);
    }
}
