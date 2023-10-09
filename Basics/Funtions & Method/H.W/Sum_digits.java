import java.util.Scanner;

public class Sum_digits {

    private static int sumDigits(int a) {

        int sum = 0;
        while (a>=1) {

            int lastdigit = a%10;
            sum = sum + lastdigit;
            a/=10;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(sumDigits(a));
    }




}
