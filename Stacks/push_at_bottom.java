import java.util.*;

public class push_at_bottom {

    public static void pushAtBottom(Stack<Integer> s, int data) {
        // base case
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        // first work is to remove the to element
        int top = s.pop();
        // call for the function again until the list became empty
        pushAtBottom(s, data);
        // to push the elments again back in the stack
        s.push(top);

    }

    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s, 4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }

}
