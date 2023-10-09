public class clear_last_i_bits {

    public static int clear_last_i_bits(int n, int i){
        
        int bitmask = -1<<i;
        
        return n & bitmask;
    }
    public static void main(String args []){

        System.out.println(clear_last_i_bits(15,2));
        
    }
    
}
