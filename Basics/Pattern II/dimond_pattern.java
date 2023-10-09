public class dimond_pattern {

    public static void pattern(int n){

        //outer loop
        for(int i = 1; i <= n; i++ ){

            // spaces

            for(int j = 1; j <= (n-i); j++){
                System.out.print(" ");
            }

            //stars
            for (int j = 1; j <= 2*(i-1)+1; j++) {
                System.out.print("*");
                
            }

            System.out.println();
        }

        // mirror outer loop
        for(int i=n; i >= 1; i -- ){

            //spaces
            for(int j=1; j <= (n-i); j++){
                System.out.print(" ");
            }

            //stars
            for(int j = 1; j <= 2*(i-1)+1; j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
    

    public static void main(String args[]) {
        pattern(4);
    }
}
