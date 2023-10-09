public class add_1_using_bits {

    public static void main(String args[]){
        int a = 10;

        System.out.println("before adding 1 to number the number is : "+a);

        a = -~a;

        System.out.println("After adding 1 to a = "+a);
    }
    
}
