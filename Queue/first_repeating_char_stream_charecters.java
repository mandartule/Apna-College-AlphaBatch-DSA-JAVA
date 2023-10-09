import java.util.*;

public class first_repeating_char_stream_charecters {

    public static void work(String str) {

        // for storing the frequency of charecters
        int freq[] = new int[26]; // a - z
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            q.add(ch);

            // increasing freq of that number
            /*
             * if charecter is a the a-a = 0 so index at a will increase
             * and for example ch = c the c-a = 99-97 = 2 so the index 2 will increase
             */

            freq[ch - 'a']++;

            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();

            }
            if (q.isEmpty()) {
                System.out.print("-1 ");
            } else {
                System.out.print(q.peek() + " ");
            }

        }

    }

    public static void main(String args[]) {
        String str = "aabccxb";

        work(str);

    }

}
