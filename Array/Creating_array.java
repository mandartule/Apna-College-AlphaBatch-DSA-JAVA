import java.util.Scanner;

public class Creating_array {
    public static void main(String args[]) {
         
        //creating an array
        int marks[] = new int [100];
        
        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt(); //maths
        marks[1] = sc.nextInt(); //chem
        marks[2] = sc.nextInt(); //phy

        //output of array
        System.out.println("maths : "+marks[0]);
        System.out.println("chemistry : "+marks[1]);
        System.out.println("phy : "+marks[2]);

        //updating an array

        marks[2] = marks[2]+1;
        System.out.println(marks[2]);


        
    }
    
}