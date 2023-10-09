public class func_overloading_parameters {


    // function to calulate sum of 2 numbers
    public static int sum(int a, int b) {
        
        return a + b;
        }
     
    // function to calulate sum of 3 numbers
    public static int sum(int a, int b , int c) {

        return a+b+c;
        
    }
    public static void main(String args[]) {
        
        System.out.println(sum(3,5));
        System.out.println(sum(3,5, 2));
        
    }
}
