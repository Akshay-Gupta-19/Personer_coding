/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RemeberingTHings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

/**
 *
 * @author akggupta
 */
public class TopoSort {
    
    ArrayList<HashSet<Integer>> adj;
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
