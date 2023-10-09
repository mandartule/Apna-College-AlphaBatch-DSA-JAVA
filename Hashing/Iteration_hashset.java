import java.util.*;
public class Iteration_hashset {
    public static void main(String args[]){
        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);

        Iterator it = hs.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        //using advance for loop

        for(Integer i : hs){
            System.out.print(i+" ");
        }
    }
    
}
