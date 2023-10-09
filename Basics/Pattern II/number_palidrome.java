public class number_palidrome {

    public static void pattern(int n){

        //outer loop
        for (int i = 1; i <= n; i++) {

            //spaces   
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
                
            }  
            // part 1
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
                 
            }
            //part 2
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
                
            }
            System.out.println();
        }
    

    }
    
    public static void main(String args[]) {
        pattern(5);
        
    }
}