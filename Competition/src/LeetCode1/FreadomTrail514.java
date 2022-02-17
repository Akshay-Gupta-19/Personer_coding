/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author USER
 */
public class FreadomTrail514 {
    public static void main(String[] args) {
        new Solution514().findRotateSteps("godding","gd");
    }
}
class Solution514 {
    public int findRotateSteps(String ring, String key) {
        char r[]=ring.toCharArray();
        char k[]=ring.toCharArray();
        HashMap<Character,List<Integer>> hs=new HashMap<>();
        for(int i=0;i<r.length;i++){
            hs.putIfAbsent(r[i],new LinkedList<>());
            hs.get(r[i]).add(i);
        }
        System.out.println(hs);
        return solve(r,0,k,0,hs);
    }
    int solve(char r[],int ri,char k[],int ki,HashMap<Character,List<Integer>> hm){
        if(ki==k.length)return 0;
        List<Integer> next=hm.get(k[ki]);
        int ans=Integer.MAX_VALUE;
        for(Integer nextInd:next){
            ans=Math.min(ans,solve(r,nextInd,k,ki+1,hm)+
                         Math.min(
                             Math.abs(nextInd-ri),
                             r.length-(Math.abs(nextInd-ri)))+1);
        }
        System.out.println(ri+" "+ki+" "+ans);
        return ans;
    }
}