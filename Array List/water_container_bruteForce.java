import java.util.*;

public class water_container_bruteForce {

    public static void main(String args[]){
        ArrayList <Integer> bars = new ArrayList<>();

        bars.add(1);
        bars.add(8);
        bars.add(6);
        bars.add(2);
        bars.add(5);
        bars.add(4);
        bars.add(8);
        bars.add(3);
        bars.add(7);

        System.out.println(water(bars));


    }

    public static int water(ArrayList<Integer> bar){

        int maxWater = Integer.MIN_VALUE;

        for(int i = 0; i<bar.size();i++){
            for(int j = i+1; j<bar.size(); j++){

                int conHeight = Math.min(bar.get(i),bar.get(j));
                int conLength = j-i;

                int water = conHeight*conLength;

                maxWater = Math.max(maxWater,water);
            }
        }

        return maxWater;
    }
    
}
