import java.util.*;

public class input_output_String {

    public static void main(String args[]) {
        String sc = "@#$%^&*1234asdf";
        String name;
        String name2;

        Scanner scc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        // this will print only one word
        name = scc.next();

        System.out.println(name);

        // this will print full line
        name2 = sc2.nextLine();

        System.out.println(name2);

        System.out.print(sc);

    }

}
