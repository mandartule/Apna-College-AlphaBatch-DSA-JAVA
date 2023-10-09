public class tower_of_hanoi {

    public static void main(String args[]){
        
        int n = 3;
        steps(n,"A","B","C");

        
        
    }
    
    public static void steps(int n, String src, String helper, String dest){

        //base case

        if(n == 1){
            System.out.println("transfer disk .. "+n+" from "+src+" to "+dest);
            return;
        }


        //transfering n-1 from src to helper using dest 
        steps(n-1,src,helper,dest);

        //transfer nth from src to helper


        System.out.println("transfer disk2 "+n+" form "+src+" to "+helper);


        //transfer n-1 dist form helper to dest using src as a helper

        steps(n-1,dest,src,helper);

    }
}
