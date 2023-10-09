import java.util.*;

public class cycleDetect_directedGraph {

    static class Edge {

        int dest;
        int src;

        Edge(int s, int d) {
            this.dest = d;
            this.src = s;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 3));





    }

    // static void createGraph(ArrayList<Edge> graph[]) {
    //     for (int i = 0; i < graph.length; i++) {
    //         graph[i] = new ArrayList<>();
    //     }

    //     graph[0].add(new Edge(0, 2));

    //     graph[0].add(new Edge(1, 0));

    //     graph[0].add(new Edge(2, 3));

    //     graph[0].add(new Edge(3, 0));

    // }

    public static boolean isCycle(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) { // so that if graph are in diffrent parts then all parts must be visited
            if (!vis[i]) {
                if (isCycleUtil(graph, i, vis, stack)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean isCycleUtil(ArrayList<Edge> graph[], int curr, boolean vis[], boolean stack[]) {

        vis[curr] = true;
        stack[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {

            Edge e = graph[curr].get(i);

            if (stack[e.dest]) { // as in stack array the node is visited therefore cycle exists
                return true;
            }

            if (!vis[e.dest] && isCycleUtil(graph, e.dest, vis, stack)) {
                return true; // here our curr will be e.dest
            }
        }

        stack[curr] = false; // removing the curr from stack as returning back
        return false;

    }

    public static void main(String args[]) {
        int V = 4;

        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);

        System.out.println(isCycle(graph));
    }
}
