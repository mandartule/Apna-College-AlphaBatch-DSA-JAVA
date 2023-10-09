import java.util.*;
public class tree_map {
    public static void main(String args[]){
        TreeMap<String,Integer> tm = new TreeMap<>();

        tm.put("b",1);
        tm.put("c",2);
        tm.put("a",3);
        tm.put("d",1);

        HashMap<String,Integer> hm = new HashMap<>();

        hm.put("a",1);
        hm.put("b",2);
        hm.put("c",3);
        hm.put("d",1);

        //here we can compare the difference in order
        System.out.println(tm);
        System.out.println(hm);
    }
}
