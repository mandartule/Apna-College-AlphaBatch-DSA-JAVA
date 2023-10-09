import java.util.*;
public class last_comon_ancestor {

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
    public static boolean getPath(Node root,int n,ArrayList <Node> path){
        
        if(root == null){
            return false;
        }

        path.add(root);

        if(root.data == n){
            return true;
        }

        boolean left = getPath(root.left,n,path);
        boolean right = getPath(root.right,n,path);

        if(left || right){
            return true;
        }

        path.remove(path.size()-1);
        return false;

    }

    public static Node lca(Node root, int n1, int n2){

        ArrayList <Node> path1 = new ArrayList<>();
        ArrayList <Node> path2 = new ArrayList<>();
        
        getPath(root,n1,path1);
        getPath(root,n2,path2);

        //last common ancestor
        int i;
        for(i = 0; i<path1.size() && i<path2.size(); i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }

        //last equal node = 
        Node lca = path1.get(i-1);
        return lca;
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

    //System.out.println(lca(root,4,5).data);
    System.out.println(optimizedLca(root,4,7).data);

    
    

    }

    
}
