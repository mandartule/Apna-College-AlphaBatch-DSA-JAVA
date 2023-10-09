public class grid_ways_Super_optimized {

    public static void main(String args[]){
        int n = 3, m = 3;

        int totalWays = Fact(n-1+m-1)/(Fact(n-1)*Fact(m-1));

        System.out.println(totalWays);
    }



    public static int Fact(int n ){

        //base case 
        if( n == 0){
            return 1;
        }

        
        int fact = n*Fact(n-1);
        return fact;
    }
    
}
