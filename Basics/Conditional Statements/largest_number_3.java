import java.util.*;

public class largest_number_3 {
    public static void main(String args[]) {
        Scanner sc  = new Scanner(System.in);
        
        System.out.println("Give first no. ?");
        int a= sc.nextInt();
        System.out.println("Give Second no. ?");
        int b= sc.nextInt();
        System.out.println("Give Third no. ?");
        int c= sc.nextInt();

        System.out.println("Largest no. is :");
        if (a>=b && a>=c) {
            System.out.println(a);
            
        } else if(b>=c){
            System.out.println(b); 
            
        }else{
            System.out.println(c);

        }



        
    }
    
}
