public class sum_digonal_matrix {

    // Solution by brute Force approch
    //time complexcity = O(n)

    public static void sum_digolans(int matrix[][]) {

        int n = matrix.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {

                // for prime digonal
                if (i == j) {
                    sum += matrix[i][j];
                }

                // for secondary digonal
                if (i + j == n - 1) {
                    if(i == j){
                        continue;
                    }
                    sum += matrix[i][j];

                }

            }
        }

        System.out.println(sum);

    }

    // Optimized Solution
    // less time complexity

    public static void sum_digolan(int matrix[][]) {

        int sum = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            // for prime digonal
            sum += matrix[i][i];

            // for secondary digonal
            // we can j = n-1-i
            if (i != n - i - 1) {
                sum += matrix[i][n - i - 1];
            }

        }

        System.out.println(sum);
    }

    public static void main(String args[]) {

        int matrix[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        sum_digolans(matrix);

    }

}
