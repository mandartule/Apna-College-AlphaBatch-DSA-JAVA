import java.util.*;

public class max_element_arraylist {

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // printing max element from the list

        int max = Integer.MIN_VALUE;
        for (int i =0; i < list.size(); i++) {
            
            if(list.get(i)>max){
                max = list.get(i);
            }
        }

        System.out.println(max);

    }

}
