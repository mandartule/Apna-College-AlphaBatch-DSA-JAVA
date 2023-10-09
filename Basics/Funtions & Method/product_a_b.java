import java.util.*;
public class product_a_b {

public static int product1(int num1,int num2) {

    int product = num1*num2;
    return product;
}

public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();

     int product=product1(a,b);
     System.out.println(product);

     int multiply=product1(30,40);
     System.out.println(multiply);
}
    
}
