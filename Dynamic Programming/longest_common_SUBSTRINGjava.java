public class longest_common_SUBSTRINGjava {

    // O(m*n)
    public static int longestCommonSubstring(String str1, String str2) {
       
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n + 1][m + 1];
        int ans = 0;
       
        // initialize
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j < m + 1; j++) {
            dp[0][j] = 0;
        }
       
        // bottom up
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                
                //last char is same
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    ans = Math.max(ans, dp[i][j]);
                } 
                
                //last char is diffrent
                else {
                    dp[i][j] = 0; //counter reset
                }
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        String str1 = "ABCDE";
        String str2 = "ABGCE"; //2 "AB"
        System.out.println(longestCommonSubstring(str1, str2));

    }

}
