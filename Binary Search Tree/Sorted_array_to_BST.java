public class Sorted_array_to_BST {
    
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

    public static void preOrder(Node root){
        if(root == null)
        return;

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node createBST(int arr[],int st, int end){

        if(st>end)
        return null;

        int mid = (st+((end-st)/2));

        Node root = new Node(arr[mid]);
        root.left = createBST(arr,st,mid-1);
        root.right = createBST(arr,mid+1,end);

        return root;

    }
    public static void main(String args[]){
        int arr[] = {3,5,6,8,10,11,12};
    
        Node root = createBST(arr,0,arr.length-1);

        preOrder(root);
    }
}
