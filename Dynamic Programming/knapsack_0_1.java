import java.util.Arrays;

public class knapsack_0_1 {

    public static int ans_recur(int val[], int wt[], int W, int n) { // n is the index

        // base case
        if (W == 0 || n == 0)
            return 0; // if bag became full or item got over

        // if item can be included
        if (wt[n - 1] <= W) {

            // included curr item
            int ans1 = val[n - 1] + ans_recur(val, wt, W - wt[n - 1], n - 1);

            // not included current item
            int ans2 = ans_recur(val, wt, W, n - 1);

            return Math.max(ans1, ans2);
        }

        // if item can not be include because wt is greater than capacity
        else {
            return ans_recur(val, wt, W, n - 1);
        }

    }

    public static int ans_recur_memo(int val[], int wt[], int W, int n, int dp[][]) {

        // base case
        if (W == 0 || n == 0)
            return 0;

        // memomization
        if (dp[n][W] != -1)
            return dp[n][W];

        // valid
        if (wt[n - 1] <= W) {

            // included
            int ans1 = val[n - 1] + ans_recur_memo(val, wt, W - wt[n - 1], n - 1, dp);

            // not included
            int ans2 = ans_recur_memo(val, wt, W, n - 1, dp);

            dp[n][W] = Math.max(ans1, ans2);
            return dp[n][W];
        }

        else {
            dp[n][W] = ans_recur_memo(val, wt, W, n - 1, dp);
            return dp[n][W];
        }

    }

    public static int knapsackTab(int val[], int wt[], int W) {

        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];

        for (int i = 0; i < dp.length; i++) { // 0th col initialization
            dp[i][0] = 0;
        }
        for (int j = 0; j < dp[0].length; j++) { // 0th row intialization
            dp[0][j] = 0;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < W + 1; j++) {

                int v = val[i - 1]; // ith item value
                int w = wt[i - 1]; // ith item weight

                if (w <= j) { // valid

                    int incProfit = v + dp[i - 1][j - w]; // here we are including the value
                    int excProfit = dp[i - 1][j]; // here item is not included
                    dp[i][j] = Math.max(incProfit, excProfit);
                } else { // invalid

                    int excProfit = dp[i - 1][j];
                    dp[i][j] = excProfit;
                }
            }
        }
        print(dp);
        return dp[n][W]; // this will be our last cell of the matrix
    }

    public static void print(int dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }



    public static void main(String args[]) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7; // capacity of bag

        // System.out.println(ans_recur(val,wt,W,val.length ));

        // using memomization

        // int dp[][] = new int[val.length + 1][W + 1];
        // for (int i = 0; i < dp.length; i++) {
        //     Arrays.fill(dp[i], 0);
        // }

        //System.out.println(ans_recur_memo(val, wt, W, val.length, dp));

        System.out.println(knapsackTab(val, wt, W));
        

    }
}
