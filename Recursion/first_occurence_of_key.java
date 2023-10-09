public class first_occurence_of_key{
    public static void main(String args[]){

        int arr[] = {8,3,6,9,5,10,2,5,3};
        int key = 5;
        System.out.print(Position(arr,key,0));
    }

    public static int Position(int arr[],int key,int i){

        if(i == arr.length-1){
            return -1;
        }
        
        if(arr[i] == key){
            return i;
        }

        return Position(arr,key,i+1);
    }
}