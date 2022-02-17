package RemeberingTHings;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

class BFS {

    ArrayList<ArrayList<Integer>> adj;

    public BFS(ArrayList<ArrayList<Integer>> adj) {
        this.adj = adj;
    }

    int[] bfs(int src) {
        int ans[] = new int[adj.size()];
        Arrays.fill(ans, -1);
        ans[src] = 0;

        boolean visited[] = new boolean[adj.size()];
        visited[src] = true;

        LinkedList<Integer> buffer = new LinkedList<>();
        buffer.add(src);

        while (!buffer.isEmpty()) {
            int next = buffer.pollFirst();
            ArrayList<Integer> nebirs = adj.get(next);
            for (int i = 0; i < nebirs.size(); i++) {
                Integer neib = nebirs.get(i);
                if (!visited[neib]) {
                    visited[neib] = true;
                    buffer.add(neib);
                    ans[neib] = ans[next] + 6;
                }
            }
        }
        return ans;
    }
}
