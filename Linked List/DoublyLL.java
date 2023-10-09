public class DoublyLL {

    public class Node {
        int data;
        Node next;
        Node prev;

        // constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;

        // as the Node is increased

    }

    public int removeFirst() {
        int val = head.data;
        if (head == null) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            head = tail = null;
            return val;
        }

        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;

    }

    public int removeLast() {
        size--;
        int val = tail.data;
        //corner case
        //for no empty linked list
        if (head == null) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }
        //for ll having only one value
        if(head.next == null){
            tail = head = null;
        }

        tail = tail.prev;
        tail.next = null;

        return val;
    }

    public void print() {
        // corner case
        if (head == null) {
            System.out.println("The Doubly Linked list is empty");
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }

        head = prev;


    }

    public static void main(String args[]) {

        DoublyLL dll = new DoublyLL();
        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.print();
        // System.out.println(dll.size);
        // dll.removeFirst();

        // dll.addLast(6);
        // dll.addLast(7);
        // dll.print();

        // dll.addLast(8);
        // dll.addLast(9);

        dll.reverse();
        dll.print();
        
    }

}
