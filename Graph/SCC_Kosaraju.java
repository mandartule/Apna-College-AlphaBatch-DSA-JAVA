import java.util.*;

public class SCC_Kosaraju {

    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));
    }

    public static void topSort(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> s) {
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                topSort(graph, e.dest, vis, s);
            }
        }

        s.push(curr);
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]) {
        vis[curr] = true;

        System.out.print(curr + " ");

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (!vis[e.dest]) {
                dfs(graph, e.dest, vis);
            }
        }
    }

    public static void kosaraju(ArrayList<Edge> graph[], int V){  //T.C  = O(V+E)

        //step 1
        //adding all our nodes in stack to have a sequence for SCC

        Stack<Integer> s = new Stack<>();
        boolean vis [] = new boolean[V];

        for(int i = 0; i<graph.length; i++){
            if(!vis[i]){
                topSort(graph,i,vis,s);
            }
        }
        

        //step 2
        //making a new graph with revers edges

        ArrayList<Edge> tranpose[] = new ArrayList[V];
        for(int i = 0; i<graph.length; i++){ //creating a empty arraylist at each node
            vis[i] = false; //because we will need the vis array again to use
            tranpose[i] = new ArrayList<Edge>();
        }

        for(int i = 0; i<V; i++){ //copying the graph but with reverse edges
            for(int j = 0; j<graph[i].size(); j++){
                Edge e = graph[i].get(j);
                tranpose[e.dest].add( new Edge(e.dest,e.src)); //reverse edge by passing dest at src and src at dest
            }
        }

        //Step 3

        while(!s.isEmpty()){
            int curr = s.pop();
            if(!vis[curr]){
                System.out.print("SCC -> ");
                dfs(tranpose,curr,vis);
                System.out.println();
            }
        }
    }

    public static void main(String args[]) {

        int V = 5;

        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        kosaraju(graph, V);
    }
}
