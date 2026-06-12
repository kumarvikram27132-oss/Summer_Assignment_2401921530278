package Week_2.Day_1;

public class First_Unique_Charactr {
    public static void main(String[] args) {
        String s="leetcode";
        firstUniqueCharactr(s);
    }
    public static int firstUniqueCharactr(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
