public class fibonacci {

    public static void main(String args[]){

        System.out.println(Fibonnic(5));

    }

    public static int Fibonnic(int n){
        if(n==0 || n==1){
            return n;
        }

        int fnm1 = Fibonnic(n-1);
        int fnm2  = Fibonnic(n-2);

        int fibo = fnm1+fnm2;
        return fibo;
    }
    
}
