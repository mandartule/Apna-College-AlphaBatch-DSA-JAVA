public class set_Ith_bit {

    public static int function(int n, int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }
    public static void main(String args[]){

        System.out.println(function(10,2));
        
    }
    
}
