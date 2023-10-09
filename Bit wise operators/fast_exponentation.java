public class fast_exponentation {

    public static int fastExponentation(int a, int n) {
        // using the power value as bit number
        // if LSB of bit number is 1 multiply the answer with a and take a^2
        // if LSB of bit number is 0 the do nothing and take a^2

        int ans = 1;
        // loop till the bit form of the power goes on
        while (n > 0) {
            // cheking LSB
            if ((n & 1) != 0) {

                ans = ans * a;

            }
            // taking a square
            a = a * a;

            // shifting the bit in n

            n = n >> 1;

        }

        return ans;
    }

    public static void main(String args[]) {
        int a = 5;
        int n = 3;

        System.out.println(fastExponentation(a, n));
    }

}
