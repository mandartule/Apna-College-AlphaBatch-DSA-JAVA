import java.util.*;

public class Classroom {
  //O(n^2)
  public static int countBST(int n) {
    int dp[] = new int[n+1];
    dp[0] = 1;
    dp[1] = 1;

    for (int i = 2; i < n+1; i++) {
      //Ci -> BSt (i nodes) -> dp[i]
      for (int j = 0; j < i; j++) {
        int left = dp[j]; //Ci = Cj * Ci-j-1
        int right = dp[i-j-1];
        dp[i] += left * right;
      }
    }

    return dp[n];
  }

  public static void main(String args[]) {
    int n = 4;
    System.out.println(countBST(n));
  }
}
