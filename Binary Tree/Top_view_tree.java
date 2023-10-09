import java.util.*;

public class Top_view_tree {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // as we want to save data as well as horizontal distance of the node
    static class Info {

        Node node;
        int hd;// horizontal distance

        public Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }

    }

    public static void topView(Node root) {

        // Level order trevers

        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max = 0;
        q.add(new Info(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Info curr = q.remove();

            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                    // this null is for next line
                }
            } else {

                // if the key is not added before(Unique key)
                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }

                // checking the left side of the node
                // level order treversal step

                if (curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd - 1)); // hd-1 as we are moving left side of tree
                    min = Math.min(min, curr.hd - 1);
                }

                if (curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }

                

            }

        }

        //printing the hashmap
        for(int i = min; i<=max; i++){
            System.out.print(map.get(i).data+" ");
            }


    }

    public static void main(String args[]) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        /*
         * 1
         * / \
         * / \
         * 2 3
         * / \ / \
         * 4 5 6 7
         * 
         */

        topView(root);

    }
}
