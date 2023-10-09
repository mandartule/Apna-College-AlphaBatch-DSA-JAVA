import java.util.*;

public class nearest_cars {

    static class Point implements Comparable<Point>{
        int x,y;
        int distSq;
        int idx;

        public Point(int x, int y, int distSq,int idx){
            this.x = x;
            this.y = y;
            this.distSq = distSq;
            this.idx = idx;
        }

        //we will priotize this queue on the basis of the distSq value
        @Override
        public int compareTo(Point p2){
            return this.distSq - p2.distSq;
        }
    }
    public static void main(String args[]){
        int pts[][] = {{3,3},{5,-1},{-2,4}};
        int k = 2;

        PriorityQueue<Point> list = new PriorityQueue<>(); // we are making a pq of the Point class

        for(int i =0; i<pts.length; i++){
            int distSq = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1]; // this is for a^2 + b^2 as the another value in second colum
            list.add(new Point(pts[i][0],pts[i][1], distSq, i)); // we are storing the point x and Y cordinate and also its distance form the origin
        }

        //printing k numbers of nearest cars
        for(int i =0; i<k; i++){
            System.out.println("C"+list.remove().idx+" ");
        }
    }
}
