import java.util.*;

public class next_greater_element {
    
    public static void main(String args[]){
        int arr[] = {6,8,0,1,3};

        int n = arr.length;
        
        //Stack to store the indexes
        Stack <Integer> s = new Stack<>();
        
        //array to store the solution
        int nextGrt [] = new int[n];
        
        //we will go backwards so the for loop will go from n-1 to 0
        for(int i = n-1; i>=0; i--){

            //step 1 check
            while(!s.isEmpty() && arr[s.peek()] <= arr[i] ){
                s.pop();
            }

            //step 2 for empty array
            if(s.isEmpty()){
                nextGrt[i] = -1;
            }else{
                nextGrt[i] = arr[s.peek()];
            }

            //step 3 to push the elements
            s.push(i);
        }

        //printing the solution array
        for(int i = 0 ; i<n; i++){
            System.out.print(nextGrt[i]+" ");
        }
    }
}
