public class func_overloading_datatypes {
    
    public static int sum(int a, int b) {
        return a+b;
        
    }

    public static float sum(float a,float b) {
        return a+b;
    }

    public static void main(String args[]) {

        System.out.println(sum(3,3));

        System.out.println(sum(1.2f,1.8f));
        
    }






}
