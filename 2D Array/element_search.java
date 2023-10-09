import java.util.*;
public class element_search {


    public static boolean search(int matrix[][], int key){

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == key){
                    System.out.println("We found the key at : "+ "["+i+"]"+"["+j+"]");
                    return true;
                }
            }
        }
        return false;
    }

    public static void largest_smallest(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                
                largest = Math.max(largest,matrix[i][j]);
                smallest = Math.min(smallest,matrix[i][j]);
            }
        }

        System.out.println("Largest ekement is : " + largest);
        System.out.println("Smallest ekement is : " + smallest);
    }


    public static void main(String args[]){
        int matrix [][] = new int[3][3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                matrix [i][j] = sc.nextInt();
                
            }
            
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        search(matrix, 7);

        largest_smallest(matrix);
    }
    
}
