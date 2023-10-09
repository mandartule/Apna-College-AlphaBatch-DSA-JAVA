import java.util.*;

public class disjoint_set {

    static int n = 7;
    static int par[] = new int[n];
    static int rank[] = new int[n];

    public static void initialize() {

        for (int i = 0; i < n; i++) {
            par[i] = i; // all are self parent at start
        }
    }

    public static int find(int x) {

        if (x == par[x])
            return x;

        return par[x] = find(par[x]); // here we have optimized that after once the leader is found the leader of last
                                      // or called element become supreme leader
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

    // optimization (Path compresion)
    public static void main(String args[]) {
        initialize();
        System.out.println(3);
        union(1, 3);
        System.out.println(find(3));
        union(2, 4);

        union(3, 6);

        union(1, 4);
        System.out.println(find(3));
        System.out.println(find(4));
        union(1, 5);
    }

}
