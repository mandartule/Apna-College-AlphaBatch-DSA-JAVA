public class subArray_sum {

    public static void subarray_sum(int num[]) {
        
        
        for (int i = 0; i < num.length; i++) {
            int a = 0;
            int sum = 0;
            int start = i;

            for (int j = i; j < num.length; j++) {
                
                int end = j;

                for (int k = start; k <= end; k++) {

                    System.out.print(num[k]+"   ");
                    a = num[k];
                }
                sum+=a; 
                System.out.print( "Sum of this Subarray : " + sum);
                System.out.println();



            }
            System.out.println();

        }
    }

    public static void main(String args[]) {

        int num[] = { 1, 2, 3, 4, 5 };
        int n = num.length;
        subarray_sum(num);

        System.out.println("Total number of arrays = " + (n * (n + 1)) / 2);

        

    }

}
