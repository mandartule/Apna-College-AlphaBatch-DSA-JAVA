public class friends_pairing {

    public static void main(String args[]) {

        System.out.println(friendPairs(3));

    }

    public static int friendPairs(int n) {

        // base case
        if (n == 1 || n == 2) {
            return n;
        }

        // choice
        // single

        int fnm1 = friendPairs(n - 1);

        // pair
        int fnm2 = friendPairs(n - 2);
        // because the single person can make pair with any other variable so their are n-1 * fnm2 ways
        int ways = (n-1) * fnm2;

        return fnm1 + ways;

    }

}
