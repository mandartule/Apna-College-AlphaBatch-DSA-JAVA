public class statement_continue {
public static void main(String args[]) {

    for (int i = 1; i <= 10; i++) {
        if (i==5) {
            System.out.println("This number is skiped");
            continue;
        }
        
        System.out.println(i);
    }
    
}
    
}
