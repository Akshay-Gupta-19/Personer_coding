/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank2;

import java.util.*;

/**
 *
 * @author akggupta
 */
public class BFSHackerrank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            int n = sc.nextInt(), m = sc.nextInt();
            for (int j = 0; j < n; j++) {
                adj.add(new ArrayList<>());
            }
            for (int j = 0; j < m; j++) {
                int s = sc.nextInt() - 1, d = sc.nextInt() - 1;
                adj.get(s).add(d);
                adj.get(d).add(s);
            }
            int src=sc.nextInt()-1;
            BFS b = new BFS(adj);
            int[] bfs = b.bfs(src);
            for (int j = 0; j < bfs.length; j++) {
               if(j!=src)System.out.print(bfs[j]+" "); 
            }
            System.out.println("");
        }
    }

}

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
