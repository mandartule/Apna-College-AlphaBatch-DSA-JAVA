import java.util.PriorityQueue;

public class PQ_objects {

    static class Student implements Comparable<Student>{
        int rank;
        String name;

        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }

        //to make this function comparable

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }

    }
    public static void main(String args[]){
                                        //to reverse the order just rignt Comparator.reverseOrder in the function argument
        PriorityQueue <Student> pq = new PriorityQueue<>();

        pq.add(new Student("A",4) );
        pq.add(new Student ("B",5));
        pq.add(new Student ("C", 2));
        pq.add(new Student ("D", 12));

        /*when the PriorityQueue is of integers the first priority is give to 
         smallest number as the accending order so when we remove the element
         they come in accending order */

         while(!pq.isEmpty()){
            System.out.print(pq.peek().name+"--->"+ pq.peek().rank);
            System.out.println();
            pq.remove();
         }

    }
}
