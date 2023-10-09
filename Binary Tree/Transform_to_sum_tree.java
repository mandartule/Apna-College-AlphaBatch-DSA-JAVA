public class Transform_to_sum_tree {

    static class Node{
        int data;
        Node left;
        Node right;
        
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int transform(Node root){
        if(root == null){
            return 0;
        }

        int leftChild = transform(root.left);
        int rightChild = transform(root.right);

        //saving data to a another variable
        int data = root.data;

        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;

        //changing the data
        root.data = newLeft+leftChild+newRight+rightChild;

        return data;
    
    }

    //function for printing a tree
    public static void preorder(Node root){

        if(root == null){
            return;
        }

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
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

        /* expected sum tree

                27
               /  \
              9   13
             / \  / \
            0  0 0   0

        */

        transform(root);
        preorder(root);


    }
}
