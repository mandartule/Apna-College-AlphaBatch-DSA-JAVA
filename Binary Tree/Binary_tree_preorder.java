
public class Binary_tree_preorder {

    static class Node{
        int data;
        Node left;
        Node right;

        //constructor of node
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //another class to build a tree
    static class BinaryTree{
        /*we will treverse the whole tree index wise and at first only 
        we will increase the index so basical we will start with zero*/

        static int idx = -1;
        public static Node buildTree(int nodes[]){ //parameter that is passed is the full array of nodes
            idx++; // now it is 0
            //base case we will stop at null node
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }
    public static void main(String args[]){

        int nodes []  = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1,-1};
        
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        //verifying as we know the root will be one
        System.out.println(root.data);
    }
    
}
