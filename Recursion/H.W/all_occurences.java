public class all_occurences {

    public static void main(String args[]){

        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        Occurences(arr,0,2);

        //here i is the position form which we are statring the search

    }
    public static void Occurences(int arr[],int i,int key){

        //base case
        if(i == arr.length){
            return;
        }

        //work
        if(arr[i] == key){
            System.out.print(i+" ");
        }

        //recalling
        Occurences(arr,i+1,key);
    }
    
}
