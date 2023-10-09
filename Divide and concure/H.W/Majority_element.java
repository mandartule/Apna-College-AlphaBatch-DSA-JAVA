public class Majority_element {

    public static void main(String args[]) {

        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
        int a = repetedElement(arr, 0, arr.length-1 );

        System.out.println(a);
    }

    public static int repetedElement(int arr[], int lo, int hi) {

        // base case
        // the only element in an array of size 1 is the majority

        if (lo == hi) {
            return arr[lo];
        }

        int mid = lo + (hi - lo) / 2;

        // left part
        int left = repetedElement(arr, lo, mid);
        // right part
        int right = repetedElement(arr, mid + 1, hi);

        // if the two part aggress on the majority element then returns it

        if (left == right) {

            //here we have returned the max repeated value
            return left;
        }


        //otherwise the element that will be in the majority will be the answer
        //so we will just count the their count  with the new function

        int leftCount = count(arr,lo,mid,left);
        int rightCount = count(arr,mid+1,hi,right);

        return leftCount>rightCount?left:right;




    }

    public static int count(int arr[], int lo, int hi, int ele) {

        int count = 0;

        for (int i = lo; i <= hi; i++) {

            if (ele == arr[i]) {
                count++;

            }

        }
        return count;

    }

}
