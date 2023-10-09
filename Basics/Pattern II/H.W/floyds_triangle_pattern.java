public class floyds_triangle_pattern {
    public static void main(String args[]) {

        int n = 5;
        int num = 1;
        for (int line = 1; line <= n; line++) {
            for (int times = 1; times <= line; times++) {

                System.out.print(num+" ");
                num++;

                
            }
            System.out.println();
            
        }

        
    }
    
}
