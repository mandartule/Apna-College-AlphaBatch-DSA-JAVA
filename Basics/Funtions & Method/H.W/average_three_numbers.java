import java.util.Scanner;

public class average_three_numbers {


    public static double average(int num1,int num2,int num3) {

        int average=(num1+num2+num3)/3;
        return average;
        
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(average(a,b,c));     
    }
    
}
