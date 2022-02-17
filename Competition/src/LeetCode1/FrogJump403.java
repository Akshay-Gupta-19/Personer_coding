/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode1;

import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author USER
 */
class Solution403 {
    public static void main(String[] args) {
        boolean canCross = new Solution403().canCross(new int[]{0,1,3,5,6,8,12,17});
        System.out.println(canCross);
    }
    public boolean canCross(int[] stones) {
        if(stones[1]!=1)return false;
        HashMap<Integer,Integer> stoneSet=new HashMap<>();
        HashMap<String,Boolean> dp=new HashMap<>();
        for(int i=0;i<stones.length;i++)
            stoneSet.put(stones[i],i);
        return canCross(stones,1,1,stoneSet,dp);
    }
    boolean canCross(int st[],int ci,int lj,HashMap<Integer,Integer> hs,HashMap<String,Boolean> dp){
        if(ci==st.length-1)return true;
        System.out.println(st[ci]+" "+lj);
        String key=ci+" "+lj;
        if(dp.containsKey(key))return dp.get(key);
        if(hs.containsKey(st[ci]+lj) && canCross(st,hs.get(st[ci]+lj),lj,hs,dp)){
            dp.put(key, true);
            return true;
        }
        if(hs.containsKey(st[ci]+lj+1) && canCross(st,hs.get(st[ci]+lj+1),lj+1,hs,dp)){
            dp.put(key, true);
            return true;
        }
        if(lj!=1 && hs.containsKey(st[ci]+lj-1) && canCross(st,hs.get(st[ci]+lj-1),lj-1,hs,dp)){
            dp.put(key, true);
            return true;
        }
        dp.put(key, false);
        return false;
    }
}