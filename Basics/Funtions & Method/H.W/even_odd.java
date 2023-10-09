import java.util.Scanner;

public class even_odd {

public static boolean evenORodd(int a) {
    boolean even = true;
    if (a%2!=0) {
        even = false;
        return even;
    }
    return even;
}

public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    System.out.println("Is "+a+" is even : "+evenORodd(a));

}
    
}
