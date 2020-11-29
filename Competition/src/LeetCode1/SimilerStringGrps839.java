/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

/**
 *
 * @author akggupta
 */
public class SimilerStringGrps839 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(new SimilerStringGrps839().numSimilarGroups(new String[]{"kccomwcgcs","socgcmcwkc","sgckwcmcoc","coswcmcgkc","cowkccmsgc","cosgmccwkc","sgmkwcccoc","coswmccgkc","kowcccmsgc","kgcomwcccs"}));
    }

    public int numSimilarGroups(String[] A) {
       ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
           adj.add(new ArrayList<>());
        }
 
       for (int i = 0; i < A.length; i++) {
            for (int j = i+1; j < A.length; j++) {
                if(swapable(A[i], A[j])){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
       return new BFSCountIsland(adj).bfs();
    }
    
     boolean swapable(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int state = 0;
        char s2h = 0, s1h = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                switch (state) {
                    case 0:
                        s1h = s1.charAt(i);
                        s2h = s2.charAt(i);
                        state = 1;
                        break;
                    case 1:
                        if (s1.charAt(i) != s2h || s2.charAt(i) != s1h) {
                            return false;
                        }
                        state = 2;
                        break;
                    case 2:
                        return false;
                }
            }
        }
        return true;
    }
}

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

    
  

   

