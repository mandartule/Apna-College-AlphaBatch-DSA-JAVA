import java.util.*;

public class LCS_memomization {

    public static int lcs(String str1, String str2, int n, int m, int dp[][]) {
        
        //base case if any of the string get empty
        if (n == 0 || m == 0) {
            return 0;
        }
        
        //if we already have a answer
        if (dp[n][m] != -1) {
            return dp[n][m];
        }

        if (str1.charAt(n - 1) == str2.charAt(m - 1)) { // same charecters
            return dp[n][m] = lcs(str1, str2, n - 1, m - 1, dp) + 1;
        } 
        
        else { // diff charecters
            int ans1 = lcs(str1, str2, n - 1, m, dp);
            int ans2 = lcs(str1, str2, n, m - 1, dp);
            return dp[n][m] = Math.max(ans1, ans2);
        }
    }

    public static void main(String args[]) {

        String str1 = "abcdge";
        String str2 = "abedg"; // lcs = "abdg"; length = 4
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n + 1][m + 1];

        // initialization
        for (int i = 0; i < n + 1; i++) {
            Arrays.fill(dp[i], -1);
        }

        System.out.println(lcs(str1, str2, n, m, dp));
    }
}
