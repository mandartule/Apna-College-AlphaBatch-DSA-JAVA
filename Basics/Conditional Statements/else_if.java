import java.util.*;

public class else_if {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What's your age ?");
        int a = sc.nextInt();

        if (a>=18) {
            System.out.println("You are an Adult.");
            
        } else if (a>=13 && a<=17){
            System.out.println("You are a teenager");
            
        }else{System.out.println("You are a child.");

        }




        
    }
    
}
