public class Sum_n_naturals_numbers {

    public static void main(String args[]){

        System.out.print(Sum(10));
    }

    public static int Sum(int n){
        if(n == 1 ){
            return 1;
        }

        int sum = n + Sum(n-1);
        return sum;
    }
    
}
