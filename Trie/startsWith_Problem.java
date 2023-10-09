public class startsWith_Problem {
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

    public static void main(String args[]){
        String words[] = {"apple","app","mango","man","woman"};
        String prefix1 = "app";
        String prefix2 = "moon";

        for(int i =0; i<words.length; i++){
            insert(words[i]);
        }
        
        System.out.println(startsWith(prefix1));
        System.out.println(startsWith(prefix2));
    }
}
