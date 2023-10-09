import java.util.*;

public class reverse_Stack_recursion {
    
    public static void print(Stack <Integer> list){

        while(!list.isEmpty()){
            System.out.println(list.pop());
        }
    }

    public static void pushAtBottom(Stack<Integer> s,int data){

        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s,data);
        s.push(top);

    }

    public static void reverse(Stack <Integer> list){
        /*we will remove the elements as we go down and then push at bottom them */
        
        //base case
        if(list.isEmpty()){
            return;
        }
        
        int top = list.pop();
        reverse(list);
        pushAtBottom(list,top);

    }
    public static void main(String args[]){

        Stack <Integer> list = new Stack<>();

        list.push(1);
        list.push(2);
        list.push(3);

        

        reverse(list);

        print(list);

        //if the out put in same order then out stack is reversed
        /*because a normal stack is get printed in reverse order so a reversed stack will be get printed in reversed order */


    }
}
