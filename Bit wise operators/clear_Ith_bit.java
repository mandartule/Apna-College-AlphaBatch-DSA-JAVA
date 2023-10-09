public class clear_Ith_bit {

    public static int clear_Ith_bit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;

    }
    public static void main(String args[]){

        System.out.println(clear_Ith_bit(10, 1));
    }
    
}
