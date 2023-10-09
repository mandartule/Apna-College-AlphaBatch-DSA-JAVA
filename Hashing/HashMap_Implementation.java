import java.util.*;

public class HashMap_Implementation{

    static class HashMap<K,V>{
        
        private class Node{
            K key;
            V value;

            public Node(K key,V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n; //n
        private int N; //for taking out the value of lambda
        private LinkedList<Node> buckets[];//N = buckets.length

        @SuppressWarnings("uncheked")
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i =0; i<4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key){
            int hc = key.hashCode(); // hc = hashcode
            return Math.abs(hc)%N; // because hc can be negetive and % size because it should fit between the array

        }

        //this for searching is a linked list 
        private int SearchInLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];
            int di = 0; // di = data index

            for(int i =0; i<ll.size(); i++){
                Node node = ll.get(i);
                if(node.key == key){
                    return di;
                }
                di++;
            }

            return -1;
            
        }

        private void rehash() {
            LinkedList<Node> oldBuck[] = buckets;
            buckets = new LinkedList[N*2];
            N = 2*N;

            for(int i =0; i<buckets.length; i++){
                buckets[i] = new LinkedList<>();
            }

            //Nodes -> add in bucket
            for(int i =0; i<oldBuck.length; i++){
                LinkedList<Node> ll = oldBuck[i];
                for(int j =0; j<ll.size(); j++){
                    Node node = ll.remove();

                    put(node.key,node.value);
                }
            }
        }

        public void put(K key, V value){ //)(lambda)
            int bi = hashFunction(key); // bi = bucket index
            int di = SearchInLL(key,bi);

            if(di != -1){
                Node node = buckets[bi].get(di); //bi is for the bucket number di is for the node no. in linked list
                node.value = value;
            } else{ // when there is no such value stored
                
                buckets[bi].add(new Node(key,value));
                n++;

            }

            double lambda = (double)n/N;
            if(lambda > 2.0){
                rehash();
            }
        }

        //first we will get the bi then we will search in that bucket
        public boolean containsKey(K key){ //O(1)
            int bi = hashFunction(key); // bi = bucket index
            int di = SearchInLL(key,bi);

            if(di != -1){
                return true;
            } else{ // when there is no such value stored
                
                return false;
            }
            
        }

        public V remove(K key){ //O(1)
            int bi = hashFunction(key); // bi = bucket index
            int di = SearchInLL(key,bi);

            if(di != -1){
                Node node = buckets[bi].remove(di); //bi is for the bucket number di is for the node no. in linked list
                n--;
                return node.value;
            } else{ // when there is no such value stored
                
                return null;
            }
        }

        public V get(K key){
            int bi = hashFunction(key); // bi = bucket index
            int di = SearchInLL(key,bi);

            if(di != -1){
                Node node = buckets[bi].get(di); //bi is for the bucket number di is for the node no. in linked list
                return node.value;
            } else{ // when there is no such value stored
             
                return null;
            }
           
        }

        public ArrayList <K> keyset() { // for returning keyset
            ArrayList<K> keys = new ArrayList<>();

            for(int i=0; i<buckets.length; i++){
                LinkedList<Node> ll = buckets[i];
                for(Node node : ll){
                    keys.add(node.key);
                }
            }

            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }

    }


    public static void main(String args[]){
        HashMap<String ,Integer> hm = new HashMap<>();
        hm.put("one",1);
        hm.put("two",2);
        hm.put("three",3);
        hm.put("four",4);
        hm.put("five",5);

        ArrayList<String> keys = hm.keyset();
        for(String key : keys){
            System.out.println(key);
        }

        System.out.println(hm.get("five"));
        hm.remove("five");

        System.out.println(hm.get("five"));

    }
}