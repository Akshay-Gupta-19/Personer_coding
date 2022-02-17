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
class Main {

    public static void main(String[] args) {
        String minWindow = new Solution().minWindow("ADOBECODEBANC","ABC");
        System.out.println(minWindow);
    }
}

class Solution {

    public String minWindow(String s, String t) {
        HashMap<Character, Integer> hmt = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            hmt.put(t.charAt(i), hmt.getOrDefault(t.charAt(i), 0) + 1);
        }
        int l=0,r=0;
        String ans="";
        HashMap<Character,Integer> hms=new HashMap<>();
        while(r<s.length()){
            while(r<s.length() && !isGreat(hms, hmt)){
                if(hmt.containsKey(s.charAt(r)))
                    hms.put(s.charAt(r),hms.getOrDefault(s.charAt(r), 0)+1);
                r++;
            }
            if(!isGreat(hms, hmt))break;
            while(l<r){
                if(!hmt.containsKey(s.charAt(l))){
                    l++;
                    continue;
                }
                hms.put(s.charAt(l), hms.get(s.charAt(l))-1);
                if(hms.get(s.charAt(l))<hmt.get(s.charAt(l))){
                    l++;
                    break;
                }
                if(hms.get(s.charAt(l))==0){
                    hms.remove(s.charAt(l));
                }
                l++;
            }
            if(ans.equals("") || ans.length()>r-l+1){
                ans=s.substring(l-1,r);
            }
        }
        return ans;
    }
    boolean isGreat(HashMap<Character,Integer> hm1,HashMap<Character,Integer> hm2){
        for(Character c1:hm2.keySet()){
            if(!hm1.containsKey(c1) || hm1.get(c1)<hm2.get(c1))
                return false;
        }
        return true;
    }
}
