public class how_many_times_repeated {

    public static void times_repeated(int matrix[][], int key){
        
        int count = 0;
        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++ ){
                if(matrix[i][j] == key){
                    count++;
                }
            }
        }

        System.out.println("The key repeated "+ count+" times.");

    }

        
    public static void main(String args[]){

        int arr[][]={
            {4,7,8},
            {8,8,7}
        };

        //find how many times key repeated
        int key = 7;

        times_repeated(arr, key);
    }
    
}
