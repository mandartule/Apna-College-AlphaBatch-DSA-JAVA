public class Optimised_x_to_the_power_n {
    
    public static void main(String args[]){

        System.out.print(power(2,3));
    }

    public static int power(int x, int n){

        if(n == 1){
            return x;
        }

        int ans = power(x,n/2);
        int ansSq = ans*ans;

        //for odd
        if(n%2 != 0){
            ansSq = x*ansSq;
        }
        
        return ansSq;
    }

}
