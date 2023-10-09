import java.util.*;

public class LinkedList_part_2{

    //creating head and tail
    public static Node head;
    public static Node tail;
    public static int size;

    public static class Node{
        
        int data;
        Node next;

        //constructor
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addLast(int data){
        
        Node newNode = new Node(data);
        size++;
        
        if(head == null){
            head = tail = newNode;
            tail.next = null;
            return;
        }

        tail.next = newNode;
        tail = newNode;

    }

    public boolean detectLoop(){

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;//loop exits
            }
        }

        return false;//loop does not exits
    }

    public void removeLoop(){
        
        //detect loop
        Node slow = head;
        Node fast = head;
        boolean loop = false;
        while(fast != null && fast.next != null){
            
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                loop = true;
                break;
            }
        }

        if(loop = false){
            return;
        }

        //remove loop
        if(loop = true){
            slow = head;
            Node prev = null;
            while(slow != fast){
                prev = fast;
                slow = slow.next;//+1
                fast = fast.next;//+1
            }

            //when the loop will end we will get the meeting point

            //breaking the loop
            prev.next = null;



        }
    }

    public static void main(String args[]){

        LinkedList_part_2 ll = new LinkedList_part_2();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);

        ll.tail.next = ll.head.next.next;

        System.out.println(ll.detectLoop());
        ll.removeLoop();
        System.out.println(ll.detectLoop());
    }
    
}
