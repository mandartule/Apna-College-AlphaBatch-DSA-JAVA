import java.util.*;

public class Valid_parenthesis {

    public static boolean check(String str) {

        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // cheking is there is a opening bracket
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {// cheking are there closing one
                    // if the stack is already empty as there is no opening bracket
                if (s.isEmpty()) {
                    return false;
                }
                // now we will check for pairs
                if ((s.peek() == '(' && ch == ')') ||
                        (s.peek() == '[' && ch == ']') ||
                        (s.peek() == '{' && ch == '}')) {
                    s.pop();
                } else {
                    return false;
                }

            }
        }
        if (s.isEmpty()) {
            return true;

        } else {
            return false;
        }

    }

    public static void main(String args[]) {
        String str = "({})[]";
        System.out.println(check(str));

    }
}
