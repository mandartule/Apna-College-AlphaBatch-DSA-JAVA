import java.util.*;

public class tree {
    
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

    //function to calculate height
    public static int height(Node root){

        //base case 
        if(root == null){
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight,rightHeight)+1;
    }

    //function to calculate NUMBER OF NODES
    public static int count(Node root){

        //base case 
        if(root == null){
            return 0;
        }

        int leftCount = count(root.left);
        int rightCount = count(root.right);

        int tree = leftCount + rightCount + 1;

        return tree;

    }

    //function to calculate sum of tree

    public static int sum(Node root){

        //base case
        if(root == null){
            return 0;
        }

        int leftSum = sum(root.left);
        int rightSum = sum(root.right);

        int sum = leftSum+rightSum+ root.data;

        return sum;
    }

    //function to calculate diameter of tree // O(n^2)
    public static int diameter(Node root){

        //base case
        if(root == null){
            return 0;
        }

        int leDia = diameter(root.left);
        int lfHeight = height(root.left);
        int rgDia = diameter(root.right);
        int rgHeight = height(root.right);

        int selfDiameter = lfHeight+rgHeight+1;

        return Math.max(selfDiameter,Math.max(leDia,rgDia));
    }

    //function to calculate diameter //T.C = O(n)
    public static Info diameter2(Node root){

        //base case 
        if(root == null){
            return new Info(0,0);
        }

        Info leftInfo = diameter2(root.left);
        Info rightInfo = diameter2(root.right);

        int diam = Math.max(leftInfo.ht+rightInfo.ht+1,Math.max(leftInfo.diam,rightInfo.diam));
        int ht = Math.max(leftInfo.ht,rightInfo.ht)+1;

        return new Info(diam,ht);

    }
    //we will need a class for above function
    static class Info{

        int diam;
        int ht;

        //constructor 
        public Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
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

        System.out.println(height(root));

        System.out.println("Total nodes = "+count(root));

        System.out.println("Sum of the tree is = "+ sum(root));

        System.out.println("Diameter of tree is = "+diameter(root));

        System.out.println("Diameter of tree optimized way is = "+diameter2(root).diam);
    }
}
