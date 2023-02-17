/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scrap;

import java.util.Arrays;

/**
 *
 * @author guptaakshay
 */
public class Class5 {
    
}
class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int prefix[]=new int[words.length];
        prefix[0]=isGood(words[0])?1:0;
        for(int i=1;i<words.length;i++){
            prefix[i]+=(i>0?prefix[i-1]:0+(isGood(words[i])?1:0));
        }
        int ans[]=new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int l=queries[i][0] ,r=queries[i][1];
            ans[i]=(prefix[r]-(l>0?prefix[l-1]:0));
        }
        return ans;
    }
    boolean isGood(String s){
        return isVov(s.charAt(0)) && isVov(s.charAt(s.length()-1));
    }
    boolean isVov(char c){
        return c=='a' && c=='e' && c=='i' && c=='o' && c=='u';
    }
}