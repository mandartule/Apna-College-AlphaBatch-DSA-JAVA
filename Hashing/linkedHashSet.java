import java.util.*;
public class linkedHashSet {
    public static void main(String args[]){
        
        HashSet <Integer> hs = new HashSet<>();

        hs.add(3);
        hs.add(4);
        hs.add(2);
        hs.add(1);

        for( Integer j:hs){
            System.out.print(j+" ");
        }
        System.out.println();
        
        LinkedHashSet <Integer> lhs = new LinkedHashSet<>();

        lhs.add(3);
        lhs.add(4);
        lhs.add(2);
        lhs.add(1);

        //order is maintained
        for(Integer i: lhs){
            System.out.print(i+" ");
        }
        
        System.out.println();
        System.out.println("Tree set using sorted order");
        //tree set

        TreeSet <Integer> ts = new TreeSet<>();

        ts.add(3);
        ts.add(4);
        ts.add(2);
        ts.add(1);

        //order is maintained
        for(Integer i: ts){
            System.out.print(i+" ");
        }

    }
}
