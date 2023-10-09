public class array_backtraking {

    public static void main(String args[]){

        int arr[] = new int[5];

        work(0,arr,1);
        System.out.println();

        printArr(arr);


    
    }

    public static void work(int i,int arr[],int val){

        //base case
        if(i == arr.length){
            printArr(arr);
            return;
        }

        //work
        arr[i] = val;
        work(i+1,arr,val+1);
        
        //recursion
        arr[i] = arr[i]-2;



    }

    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    
}
