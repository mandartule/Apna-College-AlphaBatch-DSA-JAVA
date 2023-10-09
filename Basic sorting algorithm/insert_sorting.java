public class insert_sorting {

    public static void sort(int array[]){

        int n = array.length;

        // run loop n-1 times because last element will be automaticaly sorted
        //also start the loop from 1 because we have taken loop works on the condition when it is greater 0
        
        for(int i = 1; i<n; i++){
            int current = array[i];
            int previous = i-1;

            //finding out correct position to insert

            while( previous >= 0 && array[previous] > current){
                
            array[previous +1] = array[previous];
            
            previous--;
            }
            //insertion
            array[previous+1] = current;

            for (int j = 0; j < array.length; j++) {

                System.out.print(array[j]+" "); 
            }
            System.out.print("------");
        }
    }



    public static void main(String args []){

        int array []= {1,2,3,5,4};
        for (int j = 0; j < array.length; j++) {

            System.out.print(array[j]+" "); 
        }
        System.out.print("------");

        sort(array);

       
    }
    
}
