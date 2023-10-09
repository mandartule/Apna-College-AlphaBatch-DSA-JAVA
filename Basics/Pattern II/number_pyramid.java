public class number_pyramid {
    public static void pattern(int n){
       //outer loop 
        for(int i = 1; i <= n; i++){

            //spaces
            for(int j=1; j <=(n-i); j++){
                System.out.print(" ");
            }

            //star
            for(int j = 1; j <= i; j++){
            System.out.print(i+" ");}
        
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
    
}
