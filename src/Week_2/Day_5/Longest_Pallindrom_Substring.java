package Week_2.Day_5;

public class Longest_Pallindrom_Substring {
    public static void main(String[] args) {
   String s="babad";
   longestPalindrome(s);
    }

    public static String longestPalindrome(String str) {
        int n = str.length();
        String s = "";
        int dp[][] = new int[n][n];
        for (int k = 0; k < n; k++) {
            int i = 0;
            int j = k;
            while (j < n) {
                if (i == j) {
                    dp[i][j] = 1;
                    s = str.substring(i, j + 1);
                } else if (j == i + 1) {
                    if (str.charAt(i) == str.charAt(j)) {
                        dp[i][j] = 1;
                        s = str.substring(i, j + 1);
                    }
                } else {
                    if (str.charAt(i) == str.charAt(j)) {
                        if (dp[i + 1][j - 1] == 1) {
                            dp[i][j] = 1;
                            s = str.substring(i, j + 1);
                        }
                    }
                }
                i++;
                j++;
            }
        }
        return s;
    }
}