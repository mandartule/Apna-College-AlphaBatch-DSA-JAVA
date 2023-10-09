import java.util.*;

public class Merge_Sort {

    public static void main(String args[]) {

        int arr [] = {6,3,5,9,2,8};

        divideSort(arr,0,arr.length-1);

        //printing array
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void divideSort(int arr[], int si, int ei) {

        // base case
        // if si equals to ei means the element is single in the array and a single
        // array is always sorted
        if (si >= ei) {
            return;
        }

        // process

        // step 1 getting mid for that we are using {si +(ei-si)}/2 same as (si-ei)/2
        // but better

        int mid = si + (ei - si) / 2;

        // for the first group
        divideSort(arr, si, mid); // passing ei as mid

        // for the second group
        divideSort(arr, mid + 1, ei); // passing si as mid+1

        // now using another function for mearging

        merge(arr,si,mid,ei);

    }

    public static void merge(int arr[], int si, int mid, int ei) {

        // creting a temp array to save the small sorted array and the copy them in the
        // main array

        // as the index start form 0 therfore we need one extra space to store the array
        // elements
        /*
         * example:
         * our si is 0
         * and our ei is 3
         * the we will need 4 space as 0,1,2,3
         * so we cannot take only ei-si as it will give us 3
         */
        int temp[] = new int[ei - si + 1];

        int i = si; // iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0; // iterator for temp array


        /*if the left part element is larger we are adding it 
        first or if the right part element is 
        larger we are adding it then
        
        and after that moving towards our next element*/

        while (i <= mid && j <= ei) {

            if (arr[i] > arr[j]) {
                temp[k] = arr[j];
                j++;
            } else {
                temp[k] = arr[i];
                i++;
            }

            k++;
        }

        //for remaining elements 
        /*means whoseover elements are left they will be already 
        sorted we just need to add the at the back of the array */


        //first for left part
        while(i<=mid){

            //copying and adding in same line
            temp[k++] = arr[i++];
        }

        //same for right part

        while(j<=ei){

            temp[k++] = arr[j++];
        }

        // finally copying the main arr in temp

        for(k=0, i=si; k< temp.length;k++, i++){

            arr[i] = temp[k];
        }
    }

}
