public class star_inverted_pattern {
    public static void main(String args[]) {

            int n= 80 ;
         for (int line = 0; line <=n; line++) {
            for (int star = 1; star<n-line+1; star++) {
               System.out.print("*"); 
            }
            System.out.print("\n");

            
         }

    }
    
}
