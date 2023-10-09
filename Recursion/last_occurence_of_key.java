public class last_occurence_of_key {

    public static void main(String args[]){

        int arr[] = {8,3,6,9,5,10,2,5,3};
        int key = 5;

        System.out.println(lastOccurence(arr,5,0));

    }

    public static int lastOccurence(int arr[], int key,int i){

        //base case
        if(i == arr.length){
            return -1;
        }
        int isFound  = lastOccurence(arr, key, i+1);

        if(isFound == -1 && arr[i] == key){
            return i;
        }

        return isFound;
    }
    
}
