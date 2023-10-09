public class unique_substring {
    static  class Node{
        Node[] children = new Node[26];
        boolean eow;

        public Node(){
            for(int i =0; i<26; i++){
                children[i] = null;            
            }
            eow = false;
        }
    }

    public static Node root = new Node();

    public static void insert(String word){
        int level =0;
        int len = word.length();
        int idx;

        Node curr = root;

        for(level =0; level<len; level++){
            idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }

            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    public static boolean search(String key){
        int level;
        int len = key.length();
        int idx = 0;

        Node curr = root;
        for(level =0; level<len; level++){
            idx = key.charAt(level) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow ==true;

    }

    public static boolean startsWith(String word){
        int n = word.length();

        Node curr = root;

        for(int i =0; i<n; i++){
           int idx = word.charAt(i) - 'a';

            if(curr.children[idx] == null){
                return false;
            }

            curr = curr.children[idx];
        }

        return true;
    }

    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }

        int count =0;

        for(int i =0; i<26; i++){
            if(root.children[i] != null){
                count += countNodes(root.children[i]);
            }
        }

        return count+1;
    }

    public static void main(String args[]){
        String str = "ababa"; // ans =10;
        String str2 = "apple"; //ans = 15

        //suffix -> trie
        for(int i =0; i<str2.length(); i++){
           String curr =  str2.substring(i);
           insert(curr);
        }

        System.out.println(countNodes(root));
        
    }
}
