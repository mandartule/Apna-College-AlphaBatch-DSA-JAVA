import java.util.*;


public class Chocola_Problem {
    
    public static void main(String args[]){
        int n = 4, m = 6; //n,m are rows and coloums cuts
        
        Integer costVer[] = {2,1,3,1,4}; 
        Integer costHori[] = {4,1,2};

        //sorting both array in reverse order
        Arrays.sort(costVer,Collections.reverseOrder());
        Arrays.sort(costHori,Collections.reverseOrder());

        //pointer to track both array
        int h = 0; int v = 0;

        //integer to track the no. of pices
        int hp = 1; int vp = 1;

        int cost = 0;

        while(h < costHori.length && v < costVer.length){

            if(costVer[v] <= costHori[h]){
                cost += (costHori[h]*vp);//cost of that slide * no. of vertical piece
                hp++;//we hava performed a horizontal cut therefore no. of horizontal picies will in increase
                h++;//shifting pointer
            }else{
                cost += (costVer[v]*hp);
                vp++;
                v++;
            }
        }

        //for remaining elements in hori array
        while(h < costHori.length){
            cost += (costHori[h]*vp);
            hp++;
            h++;
        }

        //for remaining element in vertical array
        while( v < costVer.length){
            cost += (costVer[v]*hp);
            vp++;
            v++;
        }


        System.out.println("Min cost of cutting is "+cost);


    }
}
