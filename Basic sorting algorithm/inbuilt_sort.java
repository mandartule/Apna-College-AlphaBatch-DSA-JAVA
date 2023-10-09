/*you can import java.util.*;
or you can also import 
  java.util.Arrays;
*/

import java.util.*;

public class inbuilt_sort {

  public static void main(String[] args) {

    int arr[] = { 5, 3, 2, 1, 4 };

    Arrays.sort(arr);

    System.out.println("Inbuilt sort full soritng :");

    for (int i = 0; i < arr.length; i++) {
    
      System.out.print(arr[i]);
    }

    int arr2 [] = {5,4,3,2,1};

    System.out.println();

    Arrays.sort(arr2,0,3);

    System.out.println("Inbuilt sort of a specific range :");

    for (int i = 0; i < arr2.length; i++) {

      System.out.print(arr2[i]);
      
    }

  }

}
