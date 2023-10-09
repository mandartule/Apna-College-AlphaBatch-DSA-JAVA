import java.util.*;
public class Multidimensional_Array {

    public static void main(String args[]){

        //main list
        ArrayList <ArrayList<Integer>> mainList = new ArrayList<>();

        //list 1
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);


        //list 2
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        
        //adding our list to the main list
        mainList.add(list);
        mainList.add(list2);


        System.out.println(mainList);

        //printing elements by elements

        for(int i = 0; i<mainList.size(); i++){
            ArrayList <Integer> curr = mainList.get(i);
            for(int j = 0; j<curr.size();j++){
                System.out.print(curr.get(j)+" ");
            }
            System.out.println();

        }

        

    }
    
}
