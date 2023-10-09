import java.util.Scanner;

public class function_factorial {

    public static  int  fact(int num) {
        int fact = 1 ;
        while (num>1) {
            fact = fact*num;
            num--; }
       
            return fact;
       
         
    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int factis = fact(a);

        System.out.println(factis);

        
    }
    
}
