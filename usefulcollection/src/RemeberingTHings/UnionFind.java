package RemeberingTHings;


import java.util.ArrayList;
import java.util.Arrays;

class Graph {

    ArrayList<ArrayList<Integer>> adj;
    int parents[];
    int size[];

    Graph(ArrayList<ArrayList<Integer>> adj) {
        this.adj = adj;
        int v = adj.size();
        parents = new int[v];
        size = new int[v];
        for (int i = 0; i < parents.length; i++) {
            parents[i] = i;
        }
        Arrays.fill(size, 1);
    }

    int find(int x) {
        int ci = x;
        while (parents[ci] != ci) {
            parents[ci] = parents[parents[ci]];
            ci = parents[ci];
        }
        return ci;
    }

    void union(int x, int y) {//make sure x!=y
        if (size[x] > size[y]) {
            parents[y] = x;
            size[x] += size[y];
        } else{
            parents[x] = y;
            size[y] += size[x];
        }
    }

    boolean detectCycle() {
        for (int i = 0; i < adj.size(); i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                int x = find(i);
                int y = find(adj.get(i).get(j));
                if (x == y) {
                    return true;
                }
                union(x, y);
            }
        }
        return false;
    }
}
