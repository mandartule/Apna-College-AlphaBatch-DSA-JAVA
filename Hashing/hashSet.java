import java.util.*;

public class hashSet {
   public static void main(String args[]){
    HashSet <Integer> hs = new HashSet<>();

    hs.add(1);
    hs.add(2);
    hs.add(3);
    hs.add(3);
    hs.add(1);

    System.out.println(hs);

    System.out.println(hs.contains(1));

    hs.remove(1);

    System.out.println(hs);




   } 
}
