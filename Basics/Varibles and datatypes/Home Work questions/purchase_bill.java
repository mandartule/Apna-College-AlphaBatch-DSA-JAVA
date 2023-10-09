import java.util.*;

import javax.print.event.PrintJobListener;

public class purchase_bill{
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        

        System.out.println("What is the price of pencil ?");
        float pncl= sc.nextFloat();
        System.out.println("What is the price of pen ?");
        float pn = sc.nextFloat();
        System.out.println("What is the price of eraser ?");
        float ers = sc.nextFloat();

        

         float bill = pncl+pncl*0.18f+pn+pn*0.18f+ers+ers*0.18f;
         System.out.println("Your bill is :-" );
         System.out.print("Rs.");
         System.out.print((bill));
         System.out.println("(Gst included)");


    }
}
