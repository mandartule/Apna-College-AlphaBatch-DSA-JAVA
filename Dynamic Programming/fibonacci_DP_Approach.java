public class fibonacci_DP_Approach {
    
    public static int fib(int n,int fib[]){

        if(n == 0 || n == 1) return n;

        if(fib[n] != 0){
            return fib[n];
        }

        return fib[n] = fib(n-1,fib) + fib(n-2,fib);
    }
    public static void main(String args[]){

        int n = 5;
        int fib[] = new int [n+1]; //as we make fibonacci from 0

        System.out.println(fib(n,fib));
    }
}
