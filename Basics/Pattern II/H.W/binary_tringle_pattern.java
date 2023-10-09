public class binary_tringle_pattern {
    public static void main(String args[]) {

    int n = 4;
    boolean a = false;

    for(int line = 1;line <= n;line++){
        for(int place = 1;place <= line;place++){
            if(a = false){
                System.out.print("0");
            }else{
                    System.out.print("1");
                }
                    a = !a;

        }System.out.println();
    }

        
    }
    
}
