import java.util.*;
public class pair_Sum_BruteForce {

    public static void main(String args[]){

        ArrayList <Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5;

        pairSum(list,target);


    }

    public static void pairSum(ArrayList<Integer> list, int target){

        for(int i = 0; i<list.size(); i++){
            for(int j = i+1; j<list.size(); j++){

                if(list.get(i)+list.get(j) == target){
                    System.out.println("Pair of "+list.get(i)+","+list.get(j));
                }
            }
        }
    }
    
}
