/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijekstra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/**
 *
 * @author USER
 */
public class Dej4PriorityQueue {
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        int ans[]=new int[V];
        Arrays.fill(ans,10000001);
        ans[S]=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->ans[a]-ans[b]);
        pq.add(S);
        while(!pq.isEmpty()){
            int next=pq.poll();
            for(List<Integer> neigh:adj.get(next)){
                if(ans[neigh.get(0)]>ans[next]+neigh.get(1)){
                    ans[neigh.get(0)]=ans[next]+neigh.get(1);
                    pq.add(neigh.get(0));
                }
            }
        }
        return ans;
    }
}
