public class print_Kth_level {
    static class Node {
        int data;
        Node left;
        Node right;

        //constructor
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public static void kLevel(Node root, int level, int K){
        //base case
        if(root == null){
            return;
        }

        if(level == K){
            System.out.print(root.data+" ");
            return; // we do not want to go further as our value of level will increase
        }

        //going in left side
        kLevel(root.left,level+1,K);
        //for right side
        kLevel(root.right,level+1,K);

    }
    public static void main(String args[]){

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        /*
                 1
                / \
               /   \
              3     2
             / \   / \
            4   5 6   7

         */

         kLevel(root,1,3);

    }
}
