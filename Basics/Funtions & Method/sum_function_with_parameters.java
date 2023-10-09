import java.util.Scanner;

public class sum_function_with_parameters {
     
    public static int sum1(int num1,int num2) {

        int sum = num1 + num2;
        return sum;
        }
    
        public static void main(String args[]) {
        
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = sum1(a,b);

            System.out.println(sum);

    }
    
   }
