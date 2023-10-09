import java.util.*;

public class bipartite {

    static class Edge{
        int src;
        int dest;

        Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }
    
    static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
    }

    public static boolean isBipartite(ArrayList<Edge>[] graph){
        int col[] = new int[graph.length];

        for(int i = 0; i<col.length; i++){
            col[i] = -1; // no color
        }

        Queue <Integer> q = new LinkedList<>();

        for(int i = 0; i<graph.length; i++){ //for travelling all subparts of the graph

            if(col[i] == -1){ //BFS
                q.add(i); //adding it to queue
                col[i] = 0; //yellow color

                while(!q.isEmpty()){
                    int curr = q.remove();

                    for(int j = 0; j<graph[curr].size(); j++){ //adding ever neighbour of the current to queue
                        Edge e = graph[curr].get(j); //dest
                        
                        //case 1 have no color
                        if(col[e.dest] == -1){ 
                            int nextCol = col[curr] == 0 ? 1 : 0; //if curr col = 0 then nextCol = 1 other wise 0;
                            col[e.dest] = nextCol;
                            q.add(e.dest);
                        }

                        //case 3 (if neighbour have same color)

                        else if(col[e.dest] == col[curr]){
                            return false; //Not bipartite
                        }

                        //case 2 continue so do nothing
                    }
                }
            }
        }

        return true;
    }
    public static void main(String args[]){
        int V = 5;
        ArrayList <Edge> graph [] = new ArrayList[V];
        createGraph(graph);

        System.out.println(isBipartite(graph));

    }
}
