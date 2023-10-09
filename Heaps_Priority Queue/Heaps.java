import java.util.*;

public class Heaps {

    static class Heap {

        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            // add at last index
            arr.add(data);

            int x = arr.size() - 1; // index of last element
            int par = (x - 1) / 2; // index of parent element

            // (1) if we change the sign below to make it accending order 
            while (arr.get(x) > arr.get(par)) { // T.C log(n)

                // swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                //updating the values

                x = par;
                par = (x-1)/2;
            }
        }

        // to see the last element
        public int peek() {
            return arr.get(0);
        }

        private void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i; // considering it as a min indx

            // rearringing the root, left child, and right child

            // also check weather our left child or right chile exist or not
            if (left < arr.size() && arr.get(minIdx) < arr.get(left)) { // (2) if we change the sign here to make it accending order
                minIdx = left;
            }

            if (right < arr.size() && arr.get(minIdx) < arr.get(right)) {// (3) if we change the sign here to make it accending order
                minIdx = right;
            }

            if (minIdx != i) {

                // swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                // now if the below tree also got mixed up so

                heapify(minIdx);
            }

        } 

        // to remove form heap
        // removing minimum element

        public int remove() {
            int data = arr.get(0);

            // step 1 swap 1st element and last element
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // step 2 delete the last node
            arr.remove(arr.size() - 1);

            // step 3 fix the heap
            heapify(0);

            return data;

        }

        public boolean isEmpty() {

            return arr.size() == 0;
        }

    }

    public static void main(String args[]) {

        Heap h = new Heap();

        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);
        h.add(2);
        

        while(!h.isEmpty()){
            System.out.print(h.peek());
            h.remove();
        }
    }

}