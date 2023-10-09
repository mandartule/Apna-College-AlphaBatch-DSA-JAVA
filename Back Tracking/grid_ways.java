public class grid_ways {

    public static void main(String args[]){

        //rows and colums
        int n = 3, m =3;

        System.out.println(totalWays(0,0,n,m));
    }

    public static int totalWays(int i, int j, int n, int m){

        //condition for last cell
        if(i == n-1 && j == m-1){

            return 1;

        }else if(i > n || j >m){ //if it goes outside the grid
            return 0;
        }


        int way1 = totalWays(i+1,j,n,m);
        int way2 = totalWays(i,j+1,n,m);

        return way1+way2;
    }
    
}
