import java.util.*;

public class prime_or_not {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
         
        boolean prime = true;
        for (int i = 2; i <=Math.sqrt(num); i++) {
            if (num%i==0) {
                prime = false;
            }
        }

        if (prime==true) {
            System.out.println("Number is prime");
            
        } else {
            System.out.println("Numper is not prime");
            
        }
        
    }
    
}
