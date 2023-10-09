import java.util.*;

public class SubArrays {


    public static void SubArray( int num[]){

        for (int i = 0; i < num.length; i++) {

            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                for (int k =start; k <= end; k++) {
                    System.out.print(num[k]+ " ");
                    
                    
                }System.out.println();
            }System.out.println();
            
        }
    }


    public static void main(String args[]) {

        int num[] = {2,4,6,8,10};
        SubArray(num);

        int n = num.length;
        int ts = (n*(n+1))/2;

        System.out.println("Total sub array = " + ts);

        
    }
    
}
