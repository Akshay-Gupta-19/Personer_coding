/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode1;

import java.util.*;
import java.util.TreeSet;

/**
 *
 * @author akggupta
 */
public class ArraySwapToMax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

class Solution {
    public int[] prevPermOpt1(int[] A) {
        TreeMap<Integer,Integer> ts=new TreeMap<>();
        for(int i=A.length-1;i>=0;i--){
            SortedMap<Integer,Integer> tn=ts.headMap(A[i]);
            if(!tn.isEmpty()){
                int thatn=tn.firstKey();
                int ind=tn.get(thatn);
                int temp=A[ind];
                A[ind]=A[i];
                A[i]=temp;
            }
        
        ts.put(A[i],i);
        }
        return A;
    }
}