import java.util.*;

public class pair_Sum_Optimized {
    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5;

        System.out.println(pairSum(list, target));

    }

    public static boolean pairSum(ArrayList<Integer> list, int target) {

        int leftP = 0;
        int rightP = list.size() - 1;

        while (leftP < rightP) {

            if (list.get(leftP) + list.get(rightP) == target) {
                return true;
            }

            if(list.get(leftP)+list.get(rightP)< target){
                leftP++;
            }else{
                rightP--;
            }

        }

        return false;

    }

}
