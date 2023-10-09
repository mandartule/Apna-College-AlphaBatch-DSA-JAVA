import java.util.*;

public class creating_graph {

    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void main(String args[]) {

        int V = 5; // no. of vertices
        ArrayList<Edge>[] graph = new ArrayList[V];

        // creating arraylist at each array

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();// null -> empty Arraylist
        }

        // at 0-vertex
        graph[0].add(new Edge(0, 1, 5));

        // at 1-vertex
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 1));

        // at 2-vertex
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        // at 3-vertex
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        // at 4-vertex
        graph[4].add(new Edge(4, 2, 3));

        //now printing the neighbours of 2 vertex

        for(int i =0; i<graph[2].size(); i++){
            Edge e = graph[2].get(i);
            System.out.println(e.dest);
        }
    }
}
