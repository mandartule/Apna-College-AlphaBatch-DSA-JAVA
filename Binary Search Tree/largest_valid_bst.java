public class largest_valid_bst
{
 
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

    static class Info{
        boolean isBst;
        int size;
        int min;
        int max;

        public Info(boolean isBst,int size, int min, int max){
            this.isBst = isBst;
            this.min = min;
            this.max = max;
            this.size = size;
        }
    }

    static int maxBst = 0;

    public static Info largestBST(Node root){

        //null node is always a bst so true, size of it is 0
        if(root == null){
            return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }

        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);

        int size =leftInfo.size+rightInfo.size+1;
        int min = Math.min(root.data,Math.min(leftInfo.min,rightInfo.min));
        int max = Math.max(root.data,Math.max(leftInfo.max,rightInfo.max));

        //conditions for is bst
        //condition 1
        if(root.data <= leftInfo.max || root.data >= rightInfo.min){
            return new Info(false,size,min,max);
        }

        //if both left and rigth bst is valid then get max size
        if(leftInfo.isBst && rightInfo.isBst){
            maxBst = Math.max(maxBst,size);
            return new Info(true,size,min,max);
        }

        //if the right tree and left tree is not Valid bst then the root is also not a bst
        return new Info(false,size,min,max);


    }

    public static void main(String args[]) {

        Node root = new Node(50);

        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
        root.right = new Node(60);

        root.right.left = new Node(45);

        root.right.right = new Node(70);

        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);


        //our answer should be 5;

         Info info = largestBST(root);

         System.out.println("largest bst size is "+maxBst);
    }

}
