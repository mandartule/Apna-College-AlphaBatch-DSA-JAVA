public class update_ith_bit {

    public static int set_ith_bit(int n, int i) {

        int bitmask = 1 << i;

        return n | bitmask;
    }

    public static int clear_ith_bit(int n, int i) {
        int bitmask = ~(1 << i);

        return n & bitmask;

    }

    public static int chooseOperation(int n, int i, int newBit) {

        // if (newBit == 1) {
        //     return set_ith_bit(n, i);
        // } else {

        //    return clear_ith_bit(n, i); 
        // }

        clear_ith_bit(n, i);
        int Bitmask = newBit<<i;

        return n | Bitmask;
    }

    public static void main(String args[]){

        System.out.println(chooseOperation(10,2,1));
 
    }

}
