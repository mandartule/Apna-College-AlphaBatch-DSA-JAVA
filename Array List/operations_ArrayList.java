import java.util.*;
public class operations_ArrayList {

    public static void main(String args[]){

        ArrayList <Integer> list = new ArrayList<>();

        //to add elements in array list

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        //getting a element from a specific index

        int a = list.get(4);

        System.out.println("Element at index 4 is "+a);

        //removing a element

        list.remove(2);
        System.out.println("List after removing a element at index 2 from the list");
        System.out.println(list);

        //changing a element at a specific index

        list.set(0,99);
        System.out.println("List after setting 99 at 0th index");
        System.out.println(list);

        //Checking is the element is present in the list or not
        System.out.println("Checking for the element that does not present");
        System.out.println(list.contains(200));
        System.out.println("Cheking for the element that present in the list");
        System.out.println(list.contains(99));

        //Adding a element at a specific index

        list.add(4,8888);
        System.out.println("List after adding 8888 at 4th index");
        System.out.println(list);


        //ArrayList size

        System.out.println("Getting the size of array list");
        System.out.println(list.size());



    }
    
}
