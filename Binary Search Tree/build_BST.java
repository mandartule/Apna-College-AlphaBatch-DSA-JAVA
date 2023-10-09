public class build_BST {

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
    
    public static Node build(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            root.left = build(root.left,val);
        }

        if(root.data < val){
            root.right = build(root.right,val);
        }

        return root;
    }

    public static void inorder(Node root){
        
        if(root == null){
            return;
        }

       
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }

        if(root.data == key){
            return true;
        }

        if(root.data>key){
            return search(root.left,key);
        }
        else{
            return search(root.right, key);
        }
    }
    public static void main(String args[]){

        int values [] = {5,1,3,4,2,7};
        Node root = null;

        int n = values.length;

        for(int i = 0; i<n; i++){
            root = build(root,values[i]);
        }

        //inorder(root);

        if(search(root,7)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }


    }
}
