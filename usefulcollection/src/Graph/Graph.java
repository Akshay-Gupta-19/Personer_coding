/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author akggupta
 */
public class Graph {

    ArrayList<HashSet<Integer>> adj;

    public Graph(ArrayList<HashSet<Integer>> adj) {
        this.adj = adj;
    }

        int[] uParents;//parent for union find
        int size[];//size for union
    public Graph(ArrayList<HashSet<Integer>> adj, int use) {
        this.adj = adj;
        //1 for union find
        switch (use) {
            case 1:
                clearUParent();
                break;
        }
    }
    
   
    int[] dfs(int src) {//minimum distance for unweighted directed connected graph
        int ans[] = new int[adj.size()];
        Arrays.fill(ans, -1);
        ans[src] = 0;

        boolean visited[] = new boolean[adj.size()];
        visited[src] = true;

        LinkedList<Integer> buffer = new LinkedList<>();
        buffer.add(src);

        while (!buffer.isEmpty()) {
            int next = buffer.pollLast();
            Iterator<Integer> nebirs = adj.get(next).iterator();
            for (int i = 0; nebirs.hasNext(); i++) {
                Integer neib = nebirs.next();
                if (!visited[neib]) {
                    visited[neib] = true;
                    buffer.add(neib);
                    ans[neib] = ans[next] + 1;
                }
            }
        }
        return ans;
    }

    int[] bfs(int src) {//minimum distance for unweighted directed connected graph
        int ans[] = new int[adj.size()];
        Arrays.fill(ans, -1);
        ans[src] = 0;

        boolean visited[] = new boolean[adj.size()];
        visited[src] = true;

        LinkedList<Integer> buffer = new LinkedList<>();
        buffer.add(src);

        while (!buffer.isEmpty()) {
            int next = buffer.pollFirst();
            Iterator<Integer> nebirs = adj.get(next).iterator();
            for (int i = 0;nebirs.hasNext(); i++) {
                Integer neib = nebirs.next();
                if (!visited[neib]) {
                    visited[neib] = true;
                    buffer.add(neib);
                    ans[neib] = ans[next] + 1;
                }
            }
        }
        return ans;
    }

    int bfsCountIsland() {//count number of island
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
                    Iterator<Integer> nebirs = adj.get(next).iterator();
                    for (int i = 0; nebirs.hasNext(); i++) {
                        Integer neib = nebirs.next();
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

    int find(int x) {
        int ci = x;
        while (uParents[ci] != ci) {
            uParents[ci] = uParents[uParents[ci]];
            ci = uParents[ci];
        }
        return ci;
    }

    void union(int x, int y) {//make sure x!=y
        if (size[x] > size[y]) {
            uParents[y] = x;
            size[x] += size[y];
        } else {
            uParents[x] = y;
            size[y] += size[x];
        }
    }
    void clearUParent(){//clear union parent
        uParents = new int[adj.size()];
                size = new int[adj.size()];
                for (int i = 0; i < uParents.length; i++) {
                    uParents[i] = i;
                }
                Arrays.fill(size, 1);
    }
    boolean detectCycle() {
        for (int i = 0; i < adj.size(); i++) {
            Iterator<Integer> neighb = adj.get(i).iterator();
            for (int j = 0;neighb.hasNext(); j++) {
                int x = find(i);
                int y = find(neighb.next());
                if (x == y) {
                    return true;
                }
                union(x, y);
            }
        }
        return false;
    }

      int[] topoSort() {
       boolean visited[]=new boolean[adj.size()];
       Stack<Integer> st=new Stack<>();
       for(int i=0;i<adj.size();i++){
           if(!visited[i]){
               topoSortRecursive(i,visited,st,adj);
           }
       }
       //System.out.println(st);
       int ans[]=new int[st.size()];
       for(int i=0;!st.isEmpty();i++)ans[i]=st.pop();
       return ans;
    }
void topoSortRecursive(int v,boolean visited[],Stack<Integer> st,ArrayList<HashSet<Integer>> adj){
        visited[v]=true;
        for(Integer nei:adj.get(v)){
            if(!visited[nei]){
                topoSortRecursive(nei,visited,st,adj);
            }
        }
        st.add(v);
    }
   
}
