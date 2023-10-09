public class merge_sort_to_sort_strings {

    public static void main(String args[]) {

        String arr[] = { "sun", "earth", "mars", "mercury" };

        String a[] = sort(arr, 0,arr.length-1);

        //printing
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }

    }

    public static String[] sort(String arr[], int si, int ei) {

        // base case
        if (si >= ei) {

            String A[] = { arr[si] };
            return A;
        }

        // work

        int mid = si + (ei - si) / 2;
        // sorting left part
        String arr1[] = sort(arr, si, mid);
        // sorting right part
        String arr2[] = sort(arr, mid + 1, ei);

        // mearging both side

        String arr3[] = merge(arr1, arr2);

        return arr3;

    }

    // making a new function of merging

    public static String [] merge(String arr1[],String arr2[]){

        //taking out the length of the 1st and 2nd part of the array
        int m = arr1.length;
        int n = arr2.length;

        String arr3 [] = new String[m + n];
        
        int k = 0; //iterator fot main array

        int i = 0; //iterator for left part
        int j = 0;//iterator fot right part

        while(i<m && j<n){
            if(isAlphabeticaly(arr1[i],arr2[j])){

                arr3[k] =  arr1[i];
                i++;
                k++;
            }else{
                arr3[k] = arr2[j];
                k++;
                j++;
            }
        }

        //remaining elements

        //for part 1
        while(i<m){
            arr3[k++] = arr1[i++];
        }

        //for part 2
        while(j<n){

            arr3[k++] = arr2[j++];

        }

        
        return arr3;
    

    }

    public static boolean isAlphabeticaly(String str1, String str2){

        if(str1.compareTo(str2)<0){
            return true;
        }else{
            return false;
        }

    }

}
