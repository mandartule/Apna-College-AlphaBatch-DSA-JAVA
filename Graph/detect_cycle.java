import java.util.*;
public class detect_cycle {
    
    static class Edge{
        int src;
        int dest;

        public Edge(int s,int d){
            this.src = s;
            this.dest = d;

        }
    }

    static void createGraph(ArrayList<Edge> graph []){
        for(int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1));
        //graph[0].add(new Edge(0,2));  commented to make it a uncycled graph
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));

        //graph[2].add(new Edge(2,0));  commented to make it a uncycled graph
        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,4));

        graph[4].add(new Edge(4,3));
    }


    public static boolean detectCycle(ArrayList<Edge> graph []){
       
        //vistited array
        boolean vis[] = new boolean[graph.length];

        for(int i = 0; i<graph.length; i++){
            if(!vis[i]){ //if the node is not visited and we are checking this again and again because graph may be present in parts so to check each part
                if(detectCycleUtil(graph,vis,i,-1)){ // -1 as the start has no parent
                    return true;
                }

            }
        }

        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge> graph [],boolean vis[], int curr, int par){
        
        //mark the node true as visited
        vis[curr] = true;
        
        
        for(int i = 0; i<graph[curr].size(); i++){

            Edge e = graph[curr].get(i);

            //case 3 -> if the neighboure is not visited but after visiting if it detects the cycle the return true
            if(!vis[e.dest] ){
                if(detectCycleUtil(graph, vis, e.dest, curr)){
                    return true;
                }
                
            }

            //case 1 
            else if(vis[e.dest] && e.dest != par){
                return true;
            }

            //case 2 do nothing continue
        }

        return false;
    }

    public static void main(String args[]){


        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        System.out.println(detectCycle(graph));
    }

    
}

