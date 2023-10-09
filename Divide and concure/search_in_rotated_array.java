public class search_in_rotated_array {

    public static void main(String args[]){
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;

        System.out.println(search(arr,0,0,arr.length));

        
    }

    public static int search(int arr[], int key, int si, int ei) {

        // base case
        // terget not found in the array
        if (si > ei) {
            return -1;
        }

        // process
        int mid = si + (ei - si) / 2;

        // if the key our mid only

        if (arr[mid] == key) {
            return mid;
        }

        /*
         * if there are elements in the left of the mid because we
         * dont know on which element the array is rotated
         */

        // on line 1

        if (arr[si] <= arr[mid]) {

            // case
            if (arr[si] <= key && key <= arr[mid]) {
                //here the last element to search that is the ending element is taken as mid-1 as we have alredy searched on mid
               return search(arr, key, si, mid - 1);
            }else{
                //searching on the right side
               return search(arr,key,mid+1,ei);
            }

        }

        //on line 2
        //here the condition will be (arr[mid]<= arr[ei])
        else{

            //case 1
            if(key >= arr[mid] && key <=arr[ei]){
               return search(arr,key,mid+1,ei);
            }
            else{
              return search(arr,key,si,mid-1);
            }

        }

    }

}
