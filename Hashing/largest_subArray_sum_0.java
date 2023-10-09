import java.util.*;
public class largest_subArray_sum_0 {
    public static void main(String args[]){
        int arr[] = {15,-2,2,-8,1,7,10,23};

        HashMap<Integer,Integer> map = new HashMap<>();

        int sum =0;
        int len =0;

        for(int i =0; i<arr.length; i++){
            sum+=arr[i];
            if(map.containsKey(sum)){
                //means the sum is repeating so value of max Subarray can increase
               len =  Math.max(len,i-map.get(sum));//here i is minused because we want only the between after the last zero sum subarray and till the elment now we are at

            }else{
                map.put(sum,i);
            }
        }

        System.out.println("Max subarray with sum  0 is "+len);
    }
}
