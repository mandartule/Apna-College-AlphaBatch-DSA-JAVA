
// this code is incomplete

public class Search_in_a_rotated_array {

    public static void search_in_a_rotated_array(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            if (target == nums[i]) {
                System.out.println(i);

            } else {
                System.out.println(-1);
            }

        }

    }

    public static void main(String args[]) {

        int nums[] = { 4, 5, 6, 7, 0, 1, 2 };

        int target = 2;

        search_in_a_rotated_array(nums, target);

    }

}
