import java.util.*;

public class Iteration{
    public static void main(String args[]){

        HashMap <String,Integer> hm = new HashMap<>();

        hm.put("orange",1);
        hm.put("banana",2);
        hm.put("mango",3);
        hm.put("apple",4);

        System.out.println(hm);

        //to iterate we use a set by making a set of keys
        Set<String> keys = hm.keySet();
        //printing the key set

        System.out.println(keys);
        System.out.println();

        for (String k : keys){
            System.out.println("Key ="+k+",value"+hm.get(k));
        }



        
    }
}