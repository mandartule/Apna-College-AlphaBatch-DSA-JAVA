import java.util.*;
public class find_factorial {
    public static void main(String args[]) {
    
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = 1;
        int a;
        
        while (num>1){
              fact=fact*num;
              num=--num;
            
        }

        System.out.print(fact);
    
    }
}
