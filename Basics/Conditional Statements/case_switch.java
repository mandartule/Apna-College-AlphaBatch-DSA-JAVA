import java.util.*;
public class case_switch {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        switch (a){
            case 1 : System.out.println("You pressed button no. 1");
                    break;
            case 2 : System.out.println("You pressed button no. 2");
                    break;
            case 3 : System.out.println("You pressed button no. 3");
                    break;
            case 4 : System.out.println("You pressed button no. 4");

            default : System.out.println("The button you pressed is not in the system");
        }
        
    }
    
}