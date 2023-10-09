public class pattern_0_1_triangle {

    public static void pattern(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                int cellNum = i+j;
                
                if (cellNum%2==0) {
                    System.out.print("1");
                    
                } else {
                    System.out.print("0");
                }
                
            }System.out.println();
            
        }
        
    }

    public static void main(String args[]) {
        pattern(5);
    }
    
}
