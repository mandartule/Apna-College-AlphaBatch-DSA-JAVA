public class rhombus_pattern {

    public static void pattern(int n) {

        //outer loop or number of lines
      for (int i = 1; i <= n; i++) {

        //spaces
        for (int j = 1; j <= (n-i); j++) {
            System.out.print(" ");
            
        }

        // stars
        for (int j = 1; j <= n; j++) {
            System.out.print("*");

            
        }

       System.out.println(); 
      }
        
    }

    public static void main(String args[]) {

        pattern(5);
        
    }
    
}
