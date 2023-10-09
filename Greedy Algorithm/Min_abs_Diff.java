import java.util.*;
public class Min_abs_Diff {

    public static void main(String args[]){
        int A[] = {2,1,3};
        int B[] = {3,2,1};
        
        Arrays.sort(A);
        Arrays.sort(B);

        int Min_sum_diff = 0;

        for(int i = 0; i<A.length; i++){
            Min_sum_diff += Math.abs(A[i] - B[i]);
        }

        System.out.println(Min_sum_diff);
    }
    
}
