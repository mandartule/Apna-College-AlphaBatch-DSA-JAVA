public class creating_Trie {

    static class Node{
        
        Node children[] = new Node [26];
        boolean eow = false;

        Node(){
            for(int i =0; i<26; i++){
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word){ // T>C = O(L)   length of level

        Node curr = root;
        for(int level = 0; level<word.length(); level++){
            int idx = word.charAt(level) - 'a';   // minus a because any charecter - a gives the index of the charecter with 0 based indexing
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }

            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    public static boolean search(String key){

        Node curr = root;
        for(int i =0; i<key.length(); i++){
            int idx = key.charAt(i) - 'a';

            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }

        if(curr.eow == true){
            return true;
        }

        return false;
    }
    public static void main(String args[]){
        String words[] = {"the","their","a","their","any","thee"};

        for(int i =0; i<words.length; i++){
            insert(words[i]);
        }

        System.out.println(search("any"));
        System.out.println(search("an"));
    }
}
