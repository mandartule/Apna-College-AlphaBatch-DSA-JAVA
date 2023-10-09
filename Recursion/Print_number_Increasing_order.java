public class Print_number_Increasing_order {

    public static void main(String args[]){
        
        PrintIn(10);
    }
    
    public static void PrintIn(int n){

        if(n == 1){
            System.out.println(n);
            return;
        }

        PrintIn(n-1);
        System.out.println(n);
    }
}
