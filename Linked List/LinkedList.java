import java.util.*;

public class LinkedList {

    // creating HEAD and TAIL of the list
    public static Node head;
    public static Node tail;

    public static int size;

    public static class Node {
        // data stored in the node
        int data;
        // for storing reffrence
        Node next;

        // constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // making a function that adds a node in front of head

    public void addFirst(int data) {
        // step 1 creating a new node

        Node newNode = new Node(data);
        size++;

        // if in our list there was no nodes that means null list the

        if (head == null) {
            head = tail = newNode;

        }
        // step 2 linking it with the orignal head
        newNode.next = head;
        // step 3 making it as the new head
        head = newNode;
    }

    // function for adding node in last
    public void addLast(int data) {

        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            tail.next = null;
            return;
        }

        tail.next = newNode;
        tail = newNode;

    }

    // function for adding a node in middle
    public void addMiddle(int index, int data) {

        /*
         * if our index is 0 means we are adding
         * element in first position in this case we
         * need to change out head so we will call add first function
         */

        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;

        int i = 0;
        Node temp = head;
        // finding the index
        while (i < index - 1) {

            temp = temp.next;
            i = i + 1;
        }

        newNode.next = temp.next; // breaking the chain from index and adding our new node
        temp.next = newNode; // rejoining the chain to our new node

    }

    public int removeFirst() {

        if (size == 0) {
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }

        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;

            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        int val = tail.data;

        if (size == 0) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }

        if (size == 1) {

            head = tail = null;
            size--;
            return val;
        }

        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = head.next;
        }

        temp.next.next = null;
        tail = temp;
        size--;
        return val;

    }

    public int iterativeSearch(int key) {

        int i = 0;
        Node temp = head;

        while (temp != null) {

            if (temp.data == key) {
                return i;
            } else {
                temp = temp.next;
                i++;
            }
        }
        return -1;
    }

    public int helper(Node head, int key) {

        // case when key not found
        if (head == null) {
            return -1;
        }

        // base case
        if (head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }

        return idx + 1;
    }

    public int recucrsiveSearch(int key) {
        return helper(head, key);
    }

    // method for reversing a list from a specific node
    public void reverse() {

        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head = prev;

    }

    public void remove_from_Nth(int n) {

        // for calculating the size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        // corner case if we have only one node in the LinkedList
        if (n == sz) {
            head = head.next;
            return;
        }

        // the nth node form backward is (size-n) node from forward
        Node prev = head;

        int i = 1;
        while (i < sz - n) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    public void print() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public Node findMiddle(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null) {
            return slow.next;
        }

        return slow;
    }

    public boolean palidrome() {

        // base case for empty or single node list
        if (head == null || head.next == null) {
            return true;
        }

        // step 1 find mid
        Node mid = findMiddle(head);

        // step 2 - reverse the 2nd half
        Node prev = null;
        Node curr = mid;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // step 3 cheking the palidrome
        Node right = prev;
        Node left = head;
        // right half head from backwards
        while (right != null) {

            if (left.data != right.data) {
                return false;
            }

            left = left.next;
            right = right.next;
        }
        return true;
    }

    public Node getmid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node head1, Node head2) {
        Node mergell = new Node(-1);
        Node temp = mergell;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;

            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergell.next;
    }

    public void zigzag(){
        //find middle
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid  = slow;

        //reverse second half

            Node rightHead = mid.next;
            //breaking the first half
            mid.next = null;
            Node prev = null;
            Node curr = rightHead;
            Node next;
            while(curr != null){

                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
        //Alternate merging

        Node left = head;
        Node right = prev;
        Node nextLeft, nextRight;

        while(left != null && right != null){
            nextLeft = left.next;
            left.next = right;
            nextRight = right.next;
            right.next = nextLeft;
            
            right = nextRight;
            left = nextLeft;

        }
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node mid = getmid(head);
        Node righthead = mid.next;
        mid.next = null;
        Node newleft = mergeSort(head);
        Node newright = mergeSort(righthead);

        return merge(newleft, newright);
    }

    public static void main(String args[]) {

        LinkedList ll = new LinkedList();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        
    
        
        ll.print();

        // System.out.println(size);

        // // ll.removeFirst();
        // // ll.print();
        // // System.out.println(size);

        // // ll.removeLast();
        // // ll.print();

        // int key = ll.iterativeSearch(3);
        // System.out.println(key);

        // int position = ll.recucrsiveSearch(3);
        // System.out.println(position);
        // System.out.println(ll.recucrsiveSearch(10));

        // ll.reverse();
        // ll.print();

        // ll.remove_from_Nth(3);
        // ll.print();

        // System.out.println(ll.palidrome());

        //ll.head = ll.mergeSort(head);

        ll.zigzag();
        ll.print();

    }

}
