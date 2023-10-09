import java.util.*;

public class Indian_Coins {
    public static void main(String args[]){
        Integer coins[]= {1,2,5,10,20,50,100,500,2000};

        //sort the array in decending order
        Arrays.sort(coins,Comparator.reverseOrder());

        //to save which note is used
        ArrayList <Integer> ans = new ArrayList<>();

        int coinsCount = 0;
        int amount = 590;

        for(int i = 0; i<coins.length;i++){
            if(coins[i]<=amount){
                while(coins[i]<=amount){
                    coinsCount++;
                    ans.add(coins[i]);
                    amount-= coins[i];

                }
            }
        }

        System.out.println("no. of coins = "+coinsCount);
        for(int i = 0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
