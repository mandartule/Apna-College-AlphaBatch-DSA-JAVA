public class stack_using_LinkeList {

    public static class Node {

        int data;
        Node next;

        // creator function

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static class Stack {
        public static Node head = null;

        //1) isEmpty function 
        public static boolean isEmpty(){
            return head == null;
        }

        //2) push function
        public static void push(int data){
            Node newNode = new Node(data);

            //corner case if the list is empty
            if(isEmpty()){
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;

        }

        //3) pop function - to remove the top
        public static int pop(){
            //if stack is empty
            if(isEmpty()){
                return Integer.MIN_VALUE;
            }

            int top = head.data;

            head = head.next;
            return top;

        } 

        //4) peek function
        public static int peek(){
            //corner case if the list empty
            if(isEmpty()){
                return -1;
            }

            return head.data;
        }

    }

    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    

        
    }

}
