package RemeberingTHings;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

class BFSCountIsland {

    ArrayList<ArrayList<Integer>> adj;

    public BFSCountIsland(ArrayList<ArrayList<Integer>> adj) {
        this.adj = adj;
    }

    int bfs() {
        int island = 0;
        boolean visited[] = new boolean[adj.size()];
        for (int j = 0; j < adj.size(); j++) {
            if (!visited[j]) {
                visited[j] = true;
                island++;
                LinkedList<Integer> buffer = new LinkedList<>();
                buffer.add(j);

                while (!buffer.isEmpty()) {
                    int next = buffer.pollFirst();
                    ArrayList<Integer> nebirs = adj.get(next);
                    for (int i = 0; i < nebirs.size(); i++) {
                        Integer neib = nebirs.get(i);
                        if (!visited[neib]) {
                            visited[neib] = true;
                            buffer.add(neib);
                        }
                    }
                }
            }
        }
        return island;
    }
}
