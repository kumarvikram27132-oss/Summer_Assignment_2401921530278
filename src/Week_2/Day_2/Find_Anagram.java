package Week_2.Day_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_Anagram {
    public static void main(String[] args) {
       String s = "cbaebabacd", p = "abc";
       findAnagrams(s,p);
    }
    public  static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) {
            return result;
        }

        int[] pCount = new int[26];
        int[] windowCount = new int[26];
        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
        }
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            windowCount[s.charAt(right) - 'a']++;
            if (right - left + 1 > p.length()) {
                windowCount[s.charAt(left) - 'a']--;
                left++;
            }
            if (Arrays.equals(pCount, windowCount)) {
                result.add(left);
            }
        }

        return result;
    }
}
