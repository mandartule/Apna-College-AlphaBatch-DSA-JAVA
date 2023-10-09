public class x_to_the_power_n {

    public static void main(String args[]){
        

        System.out.println(power(2,5));
    }

    public static int  power(int x, int n){
        //base case
        if(n == 1){
            return x;
        }

        int value = x * power(x,n-1);
        return value;



    }
    
}
