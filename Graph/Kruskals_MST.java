import java.util.*;

public class Kruskals_MST {

    static class Edge implements Comparable<Edge> {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }

        @Override
        public int compareTo(Edge e2) {
            return this.wt - e2.wt; // accending sorting on the basis of weight
        }

    }

    static void createGraph(ArrayList<Edge> edges) { // here we not used adjancey list we used arrayList
        // edges
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 15));
        edges.add(new Edge(0, 3, 30));
        edges.add(new Edge(1, 3, 40));
        edges.add(new Edge(2, 3, 50));

    }

    static int n = 4; // n = vertices
    static int par[] = new int[n];
    static int rank[] = new int[n];

    public static void initialise() {
        for (int i = 0; i < n; i++) {
            par[i] = i;
        }
    }

    public static int find(int x) {
        if (par[x] == x) {
            return x;
        }
        return par[x] = find(par[x]); // with optimization
    }

    public static void union(int a, int b) {
        int parA = find(a);
        int parB = find(b);

        if (rank[parA] == rank[parB]) {
            par[parB] = parA;
            rank[parA]++;

        } else if (rank[parA] < rank[parB]) {
            par[parA] = parB;

        } else {
            par[parB] = parA;
        }
    }

    public static void Kruskals(ArrayList<Edge> edges, int V) {
        initialise();

        Collections.sort(edges);
        int mstCost = 0;
        int count = 0;

        for (int i = 0; i < V - 1; i++) {
            Edge e = edges.get(i);

            int parA = find(e.src);
            int parB = find(e.dest);

            if (parA != parB) { // if they are equal then cycle will form
                union(e.src, e.dest);
                mstCost += e.wt;
            }
        }

        System.out.println(mstCost);
    }

    public static void main(String args[]) {
        int V = 4;
        ArrayList<Edge> edges = new ArrayList<>();
        createGraph(edges);

        Kruskals(edges,V);

    }
}
