
public class prime_ornot_optimised {

    public static boolean prime(int n) {

        if (n==2) {
            return true;
            
        } else {
            for (int i = 2; i < Math.sqrt(n); i++) {
                if(n%i==0){
                    return false;
                }
                
            }
            return true;
            
        }
        
    }

    public static void main(String args[]) {
        System.out.println("Was the number Prime  : "+prime(5675));
        
    }
    
}
