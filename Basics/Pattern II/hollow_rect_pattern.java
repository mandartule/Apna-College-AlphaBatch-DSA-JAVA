public class hollow_rect_pattern {

    public static void hollow_rect(int rows, int coloum) {
        // outer loop
        for (int i = 1; i <= rows; i++) {
            // Inner loop
            for (int j = 1; j <=coloum; j++) {
                // cell
                if (i == 1 || i == rows || j == 1 || j == coloum) {
                    System.out.print("* ");

                } else {
                    System.out.print("  ");  

                }

            }// after a row
                System.out.println();

        } 

    }

    public static void main(String args[]) {
        // for a 4 * 5 rectangle
        hollow_rect(4, 7);

    }

}
