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
class Graph{
    int v;
    ArrayList<ArrayList<Integer>> adj;
    int parents[];
    int size[];
    
    Graph(int v,ArrayList<ArrayList<Integer>> adj){
        this.adj=adj;
        this.v=v;
        parents=new int[v];
        size=new int[v];
        for (int i = 0; i < parents.length; i++) {
           parents[i]=i; 
        }
        Arrays.fill(size,1);
    }
    
    int find(int x){
        int ci=x;
        while(parents[ci]!=ci){
            parents[ci]=parents[parents[ci]];
            ci=parents[ci];
        }
        return ci;
    }
    
    void union(int x,int y){
        if(size[x]>size[y]){
            parents[y]=x;
            size[x]+=size[y];
        }else{
            parents[x]=y;
            size[y]+=size[x];
        }
    }
    
    boolean detectCycle(){
        boolean foundCycle=false;
        for (int i = 0; i <adj.size(); i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                int x=find(i);
                int y=find(adj.get(i).get(j));
                if(x==y)foundCycle=true;
                else union(x,y);
            }
        }
        return foundCycle;
    }
}
public class FriendCircle547 {

    
    public static void main(String[] args) {
        
    }
     public int findCircleNum(int[][] M) {
         ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
         for (int i = 0; i < M.length; i++) {
             adj.add(new ArrayList<>());
             for (int j = 0; j < M[i].length; j++) {
                 if(M[i][j]==1)adj.get(i).add(j);
             }
         }
        Graph graph = new Graph(M.length, adj);
         graph.detectCycle();
         HashSet<Integer> hs=new HashSet<>();
         for (int i = 0; i < M.length; i++) {
             hs.add(graph.find(i));
         }
         return hs.size();
    }   
}
