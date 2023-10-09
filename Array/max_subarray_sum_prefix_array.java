public class max_subarray_sum_prefix_array {

    public static void prefixArray(int num[]) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        // here PREFIX ARRAY means cummulative added array

        int prefix[] = new int[num.length];

        // creating prefix array

        prefix[0] = num[0];

        for (int i = 1; i < prefix.length; i++) {

            prefix[i] = prefix[i - 1] + num[i];

        }

        for (int i = 0; i < num.length; i++) {

            int start = i;
            currSum = 0;
            for (int j = i; j < num.length; j++) {

                int end = j;

                // Ternary operator is used below

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                System.out.print(currSum);

                if (currSum > maxSum) {
                    maxSum = currSum;
                }
                System.out.println();

            }
            System.out.println();

        }
        System.out.println("Max sum of a sub Array is : " + maxSum);

    }

    public static void main(String args[]) {

        int num[] = { 1, 2, 3, 4, 5 };

        prefixArray(num);

    }

}
