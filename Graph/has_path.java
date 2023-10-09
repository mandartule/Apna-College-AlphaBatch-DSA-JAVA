import java.util.*;

public class has_path {
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

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();

        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 6, 1));
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));

    }

    public static boolean hasPath(ArrayList<Edge> graph[], int src, int dest, boolean vis[]){

        if(src == dest) return true;//checking we arrived or not

        vis[src] = true;//marking it as visited

        for(int i =0; i<graph[src].size(); i++){
            Edge e = graph[src].get(i);
            //e.dest = neighbour

            if(!vis[e.dest] && hasPath(graph,e.dest/*here new src is the curr node*/,dest, vis)){
                return true;
            }
        }

        return false; // in the case of no path is available
    }


 // TC = O(v+e)
    public static void main(String args[]){
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        System.out.println(hasPath(graph, 0, 6, new boolean [V]));

        System.out.println(hasPath(graph, 0,7,new boolean [V]));


    }

}
