public class pairs_in_arrays {

    public static void pairs( int num[]){
            int tp = 0;
        for (int i = 0; i < num.length; i++) {
             
            int current = num[i];
            
            for (int j =i+1; j < num.length; j++) {
                System.out.print("(" + current + "," + num[j] + ")");
                tp++;

            }
            System.out.println();

            
        }
        System.out.println("Total no. of pairs are = "+ tp);
    }

    public static void main(String args[]) {

        int num[] = { 2, 3, 4, 5, 6};

        int n = num.length;
        System.out.println("total no. of pairs : "+(n*(n-1))/2+"\n");


        pairs(num);

    }

}
