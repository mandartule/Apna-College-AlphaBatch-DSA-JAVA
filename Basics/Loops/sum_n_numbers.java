import java.util.*;
public class sum_n_numbers {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int i=1;
        int sum =0 ;

    
        while (i<=n) {

            sum+=i;
            i++;
            
        }
        
        System.out.println(sum);


        

    }
    
}
