import java.util.Scanner;

public class palidrome {

    public static void rev(int n) {
        int rev = 0;
        int oldNum = n;
        while (n!=0) {
            int lastdigit = n%10;
            rev = rev*10+lastdigit;
            n=(int)n/10;
          }
          System.out.println(rev);
          
        if(oldNum==rev){
            System.out.println("Your number is a PALIDROME");
        }else{
            System.out.println("Your number is NOT a PALIDROME");
        }
        
        
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number ?");
        int a = sc.nextInt();
         
        rev(a);
        
        
    }
    
}
