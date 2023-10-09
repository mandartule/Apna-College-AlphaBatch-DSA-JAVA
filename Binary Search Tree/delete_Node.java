import java.util.*;

public class delete_Node {

    static class Node {
        int data;
        Node left;
        Node right;

        // constructor
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void inorder(Node root) {

        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public static Node build(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            root.left = build(root.left, val);
        }

        if (root.data < val) {
            root.right = build(root.right, val);
        }

        return root;
    }

    public static Node delete(Node root, int val) {

        if (root.data < val) { // so going right side
            root.right = delete(root.right, val);
        } else if (root.data > val) {
            root.left = delete(root.left, val);
        } else {

            // case 1 - leaf node
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2 - single child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case 3 - have both children
            /* so we will return the in order succesor */
            Node is = findInOrderSuccessor(root.right);
            /*
             * we will find it form right subtree because
             * In order successor is present in right subtree only
             */

            // replace root.data with InorderSuccesor
            root.data = is.data;

            // delete that node of inorder succesor
            root.right = delete(root.right, is.data); // this funcitons deletes the requried node and return the
                                                      // remaining branch

        }

        return root;

    }

    public static Node findInOrderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void printInRange(Node root, int k1, int k2) {

        // base case
        if (root == null) {
            return;
        }

        if (root.data >= k1 && root.data <= k2) {

            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        } else if (root.data > k2) { // data only in right side
            printInRange(root.right, k1, k2);

        } else { // data only in left side
            printInRange(root.left, k1, k2);
        }
    }

    public static void print(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println("null");
    }

    public static void printRootToLeaf(Node root, ArrayList<Integer> path) {

        if (root == null) {
            return;
        }

        path.add(root.data);

        if (root.left == null && root.right == null) {
            print(path);
        }

        printRootToLeaf(root.left,path);
        printRootToLeaf(root.right,path);
        path.remove(path.size()-1);

    }

    public static boolean isValidBST(Node root,Node min, Node max){

        if(root == null){
            return true;
        }

        if(min != null &&  root.data <= min.data ){
            return false;
        }

        else if(max != null && max.data <= root.data){
            return false;
        }

        return isValidBST(root.left,min,root) && isValidBST(root.right,root,max);
    }

    public static void main(String args[]) {

        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        int n = values.length;

        for (int i = 0; i < n; i++) {
            root = build(root, values[i]);
        }

        inorder(root);
        System.out.println();

        // delete(root, 1);
        // inorder(root);

        //printInRange(root, 5, 11);



       // printRootToLeaf(root,new ArrayList<>());

       System.out.println(isValidBST(root, null, null));

    }
}
