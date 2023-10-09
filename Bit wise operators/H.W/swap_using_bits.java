public class swap_using_bits {

    public static void swap(int a, int b){

        System.out.println("Values before swap : a = "+a+" b = "+b);
        //swap
        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("Values after swap : a = "+a+" b = "+b);
    }

    public static void main(String args []){

        int a = 3;
        int b = 4;

        swap(a,b);

    }
    
}
