public class pratice_sorting {

    public static void bubble(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j =0; j < arr.length-1-i; j++) {

                if(arr[j]<arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;


                }                   

            }
        }

    }

    public static void selection(int arr []) {

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {

                if(arr[min]>arr[j]){
                    min = j;
                }
            }

            //swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;


            
        }



    }

    public static void instertion(int arr[]) {

     // run loop n-1 times because last element will be automaticaly sorted
     //also start the loop from 1 because we have taken loop works on the condition when it is greater 0
        
    
        for(int i = 1; i< arr.length; i++ ){
           int current = arr[i];
           int previous = i-1;

           //finding correct position to insert

           while(previous >= 0  && arr[previous]>current ){
            arr[previous+1] = arr[previous];
            previous--;
           }

           //insertion
           arr[previous +1] = current;
        }
        

    }

    public static void count(int arr[]) {

        //first find the largest element in the array for range of count array
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        //making a array name count for holding frequencies of the main array elements
        //making it 1 digit large because we need to start it with 0

        int count [] = new int[largest +1];

        for (int i = 0; i < arr.length; i++) {

            count[arr[i]]++;
            
        }

        // sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {

            while(count[i]>0){

                arr[j] = i;

                count[i]--;
                j++;

            }
            
        }

    }

    public static void main(String args[]) {

        int array[] = { 5, 3, 2, 1, 4 };

        instertion(array);
        System.out.println("This is done with bubble sorting :");
        for (int i = 0; i < array.length; i++) {
            
            System.out.print(array[i]+" ");

        }

    }
}
