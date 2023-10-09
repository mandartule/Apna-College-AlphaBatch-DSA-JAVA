public class subString {

    public static void subString(String str, int a, int b){

        for(int i = a; i < b; i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    
    
    public static void main(String args[]){

        String name = "Mandar";

        subString(name,0,3);

        System.out.println();

        // inbuilt Substring function
        System.out.println("This is printed using Inbuilt subStirng function ");
        System.out.print(name.substring(0,3));

    }
    
    
}
