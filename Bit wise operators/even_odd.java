public class even_odd {
    
    public static void oddOReven(int n){
        int bitmask  = 1;

        if((n & bitmask) == 0){
        System.out.println("The number is EVEN");    
        }else{
            System.out.println("the number is odd");
        }
    } 
    public static void main(String args[]){
        
        oddOReven(3);
        oddOReven(5);
        oddOReven(2);
        oddOReven(8);

    }
    
}
