public class Butterfly_pattern {

    public static void pattern(int n) {

        for (int i = 1; i <= n; i++) {

            // star
            for (int j = 1; j <= i; j++) {

                System.out.print("*");

            }

            // spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");

            }

            // star
            for (int j = 1; j <= i; j++) {

                System.out.print("*");

            }
            System.out.println();
        }
        // Second Half

        for (int i = n; i >= 1; i--) {

            // star
            for (int j = 1; j <= i; j++) {

                System.out.print("*");

            }

            // spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");

            }

            // star
            for (int j = 1; j <= i; j++) {

                System.out.print("*");

            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        pattern(10);

    }
}
