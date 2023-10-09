public class tilling {

    public static void main(String args[]){
        
        System.out.println(tilling(3));
    }

    //here n it the length of the floor the base is alredy 1
    public static int tilling(int n){
        //base case
        if(n==0 || n==1){
            return 1;
        }

        // if tiles place vertically
        int fnm1 = tilling(n-1);

        //if tiles place horizantaly

        int fnm2 = tilling(n-2);

        int totalWays = fnm1+fnm2;
        return totalWays;
    }
    
}
