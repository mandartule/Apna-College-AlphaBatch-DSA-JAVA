import java.util.*;

public class swap_arrayList {

    public static void swap(ArrayList<Integer> list, int idex1,int idex2){

        int temp = list.get(idex1);
        
        list.set(idex1,list.get(idex2));
        list.set(idex2,temp);
    }

    public static void main(String args[]){
        
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int indx1 = 1, indx2 = 3;

        swap(list,indx1,indx2);

        System.out.println(list);


        //sorting the array

        Collections.sort(list);
        System.out.println("Sorted list is :");
        System.out.println(list);

        System.out.println("Sorted list in decending order is :");
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
    
}
