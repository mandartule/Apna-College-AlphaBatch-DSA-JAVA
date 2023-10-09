public class max_subarray_sum_brute_Force {

    public static void Max_subarray(int num[]){

        int currentSum;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {

            int start = i;

            
            for (int j = i; j < num.length; j++) {

                int end = j;
                currentSum = 0;
                for (int k = start; k <=end; k++) {
                    
                    currentSum += num[k];
                    System.out.print(num[k]+"      ");
                    
                }
                System.out.print("Sum of array is : " + currentSum); 
                System.out.println();
                
                // Comparing current sum and max sum 
                if(currentSum > maxSum ){
                    maxSum = currentSum;
                }
                  
                
            }System.out.println();
            
            
        }System.out.println("Max sum of an array is : "+maxSum);
    }


    public static void main(String args[]) {

        int num[] = {1,2,3,4,5};
        Max_subarray(num);
        
    }
    
}
