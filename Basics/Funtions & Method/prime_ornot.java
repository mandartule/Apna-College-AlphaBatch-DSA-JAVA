public class prime_ornot {
    
    public static boolean prime(int a) {
        //corner case for 2
        for (int i = 2; i < a; i++) {
            if (a%i==0) {
                return  false;
                
            }
            
         }
         return true;
            
    }            
           
    public static void main(String args[]) {
        System.out.println("Is number prime : "+prime(8 ));

        
    }
            
        


        
    
    
}
