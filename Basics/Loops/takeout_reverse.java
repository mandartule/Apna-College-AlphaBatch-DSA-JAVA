import java.util.Scanner;

public class takeout_reverse {
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int lastdigit = 0;
        int rev = 0;
        while (n>0) {
            lastdigit=n%10;
            rev=(rev*10)+lastdigit;
            n/=10;
            
            }
        
            System.out.println(rev);
        
    }
    
}
