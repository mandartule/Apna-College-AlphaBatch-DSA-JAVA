import java.util.*;
public class Majority_Element {

    public static void main(String args[]){
        int arr[] = {1,3,2,5,1,3,1,5,1};
        int n = arr.length;
        HashMap<Integer,Integer>map = new HashMap<>();
        
        //putting elements in the map and is already present then increasing the frequency
        for(int i =0; i<n; i++){
            int num = arr[i];

           map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

       //printing elements having frequency more the n/3
        
       
       for(Integer key : map.keySet()){
        if(map.get(key) > (n/3)){
            System.out.println(key);
        }
       }

    }
    
}
