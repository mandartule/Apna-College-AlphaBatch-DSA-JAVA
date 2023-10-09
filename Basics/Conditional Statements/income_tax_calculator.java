import java.util.*;


public class income_tax_calculator {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Whats your Income ?");
        int income = sc.nextInt();
        
        System.out.println("Your tax is :-");

        if (income<=500000) {

            System.out.println("NO Need to PAY TAX");
            
        } else if (income>=500001 && income<=1000000){
            
            System.out.println(income*0.2);
        } else {
            System.out.println(income*0.3);
        }
        


        
    }
    
}
