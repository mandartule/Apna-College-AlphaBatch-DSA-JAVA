import java.util.*;

public class topological_DFS {
    
    static class Edge{
        int src;
        int dest;

        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]){

        for(int i =0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));


    }

    public static void topSort(ArrayList<Edge> graph []){
        boolean vis [] = new boolean[graph.length];
        Stack <Integer> s = new Stack<>();   

        for(int i = 0; i<graph.length; i++){
            if(!vis[i]){
                topSortUtil(graph,i,vis,s); // modified dfs
            }
        }


        while(!s.isEmpty()){  //removing each element
            System.out.print(s.pop()+" ");
        }
    }

    public static void topSortUtil(ArrayList<Edge> graph[], int curr, boolean vis[], Stack s){

        vis[curr] = true;

        for(int i = 0; i<graph[curr].size(); i++){

            Edge e = graph[curr].get(i);  //here we are travelling the arraylist of arraylist
            if(!vis[e.dest]){
                topSortUtil(graph, e.dest, vis, s);
            }
        }

        s.push(curr);
    }

    public static void main(String args[]){

        int V = 6;

        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        topSort(graph);
    }
}
