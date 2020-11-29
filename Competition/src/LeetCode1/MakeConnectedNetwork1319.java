/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author akggupta
 */
public class MakeConnectedNetwork1319 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(  new Solution().makeConnected(4, new int[][]{{0,1},{0,2},{1,2}}));
    }
    
}
class Solution {
    public int makeConnected(int n, int[][] connections) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList());
        }
        for(int i=0;i<connections.length;i++){
            adj.get(connections[i][0]).add(connections[i][1]);
            adj.get(connections[i][1]).add(connections[i][0]);
        }
        Graph2 g=new Graph2(adj);
        for(int i=0;i<connections.length;i++){
            int x=g.find(connections[i][0]);
            int y=g.find(connections[i][1]);
          if(x!=y)  g.union(x,y);
        }
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<n;i++){
            hs.add(g.find(i));
        }
        if(hs.size()-1>=connections.length)return hs.size()-1;
        return -1;
    }
}
class Graph2{
    ArrayList<ArrayList<Integer>> adj;
    int parent[];
    int size[];
    Graph2(ArrayList<ArrayList<Integer>> adj){
        this.adj=adj;
        int v=adj.size();
         parent=new int[v];
         size=new int[v];
        for(int i=0;i<v;i++)parent[i]=i;
        Arrays.fill(size,1);
    }
    int find(int x){
        int cv=x;
        while(parent[cv]!=cv){
            parent[cv]=parent[parent[cv]];
            cv=parent[cv];
        }
        return cv;
    }
    void union(int x,int y){
        if(size[x]>size[y]){
            parent[y]=x;
            size[x]+=size[y];
        }    
        else if(size[x]<size[y]){
            parent[x]=y;
            size[y]+=size[x];
        }
    }
    
}