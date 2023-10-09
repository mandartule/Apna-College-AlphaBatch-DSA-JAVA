public class number_power_of_or_not {
    
    public static boolean powerOF2(int n){
        return (n & n-1) == 0;
    }
    public static void main(String args[]){

        System.out.println(powerOF2(8));

    }
}
