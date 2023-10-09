public class Min_distance {

    static class Node{
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

    //optimized because no extra spaced is taken
    public static Node optimizedLca(Node root, int n1, int n2){

        //base case 
        if(root == null || root.data == n1 || root.data == n2  ){
            return root;
        }

        Node leftLca = optimizedLca(root.left,n1,n2);
        Node rightLca = optimizedLca(root.right,n1,n2);


        //if leftLca = null then rightLca = value and viceVersa

        if(leftLca == null){
            return rightLca;
        }
        if(rightLca == null){
            return leftLca;
        }

        return root;

    }

    public static int lcaDist(Node root,int n){

        if(root == null){
            return -1;
        }

        if(root.data == n){
            return 0;
        }

        int leftDist = lcaDist(root.left,n);
        int rightDist = lcaDist(root.right, n);

        if(leftDist == -1 && rightDist == -1){
            return -1;
        }

        else if(leftDist == -1){
            return rightDist+1;
        }
        else{
           return leftDist+1;
        }
    }

    public static int minDist(Node root,int n1,int n2){
        Node lca = optimizedLca(root,n1,n2);
        int dist1 = lcaDist(lca,n1);
        int dist2 = lcaDist(lca,n2);

        return dist1+dist2;
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
              2     3
             / \   / \
            4   5 6   7

         */


        System.out.println(minDist(root,4,7));

    }
}
