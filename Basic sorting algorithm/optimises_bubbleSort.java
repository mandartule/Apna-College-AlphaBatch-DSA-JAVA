//Code is incomplete

public class optimises_bubbleSort {

    public static void bubbleSort(int array[]) {

        for (int turn = 0; turn < array.length - 1; turn++) {

            boolean swapped = false;
            

            for (int i = 0; i < array.length - 1 - turn; i++) {

                if (array[i] > array[i + 1]) {

                    // swap

                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    

                    swapped = true;

                }

            }

            if(swapped == false){
                break;
            }

            

        }

    }

    public static void main(String args[]) {

        int array[] = { 5, 3, 2, 1, 4 };

       bubbleSort(array);

       for(int i = 0; i<array.length; i++){
        System.out.print(array[i]+" ");
       }

    }

}
