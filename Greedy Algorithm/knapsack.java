import java.util.*;
public class knapsack {

    public static void main(String args[]){
        int val[] = {60,100,120};
        int weight[] = {10,20,30};
        int W = 50; //bag weight

        //2D array for storing the rate
        double rate[][] = new double[val.length][2];
        
        for(int i=0; i<val.length;i++){
            rate[i][0] = i; //storing index on coloum 1st
            //type casting below is so important or the value can became 0
            rate[i][1] = val[i]/(double)weight[i]; //storing rate on coloum 2nd
            
        }

        //sorting on the basis of coloum 2
        Arrays.sort(rate, Comparator.comparingDouble( o -> o[1]));
         
        int capacity = W;
        int finalVal = 0;

        for(int i = rate.length-1; i>= 0; i--){
            //taking index of first most costly item
            int idx = (int)rate[i][0]; //this will be at zero because we have sorted

            if(capacity >= weight[idx]){ // include all
                finalVal += val[idx];
                capacity -= weight[idx];
            }else{//we will add fraction part

                finalVal += (rate[i][1]*capacity); //here it will add only about that much it can hold remaining capacity
                capacity = 0;
                break;

            }
        }

        System.out.println(finalVal);
    }
    
}
