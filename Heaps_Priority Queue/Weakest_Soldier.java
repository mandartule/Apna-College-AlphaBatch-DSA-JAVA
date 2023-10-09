import java.util.*;

public class Weakest_Soldier  {

    static class Row implements Comparable<Row>{
        int soldiers;
        int idx;

        public Row(int soldiers,int idx){
            this.soldiers = soldiers;
            this.idx = idx;
        }

        @Override
        public int compareTo(Row r2){
            if(this.soldiers == r2.soldiers){
                return this.idx - r2.idx;
            }else{
                return this.soldiers - r2.soldiers;
            }
        }
    }
    public static void main(String args[]) {
        int army[][] = { { 1, 0, 0, 0 },
                { 1, 1, 1, 1 },
                { 1, 0, 0, 0 },
                { 1, 0, 0, 0 } };
        int key = 2;

        PriorityQueue<Row> pq = new PriorityQueue<>();
        
        //taking the values of each row specificaly

        for(int i =0; i<army.length; i++){
            int count = 0;
            for(int j = 0; j<army[0].length; j++){
                count+= army[i][j] == 1 ? 1 : 0;
            }

            pq.add(new Row(count,i));
        }

        for(int i =0; i<2; i++){
            System.out.print("R"+pq.remove().idx+" ");
        }
    }
}