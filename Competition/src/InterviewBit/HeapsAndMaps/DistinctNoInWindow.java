/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewBit.HeapsAndMaps;
import java.util.*;
/**
 *
 * @author akggupta
 */
public class DistinctNoInWindow {
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<>(); int B=0;
        HashMap<Integer,Integer> hm=new HashMap();
        for (int i = 0; i < B; i++) {
            hm.put(A.get(i), hm.getOrDefault(A.get(i), 0)+1);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(hm.size());
        for (int i = B; i < A.size(); i++) {
           hm.put(A.get(i-B), hm.get(A.get(i-B))-1);
           if(hm.get(A.get(i-B))==0)hm.remove(A.get(i-B));
           
            hm.put(A.get(i), hm.getOrDefault(A.get(i), 0)+1);
            ans.add(hm.size());
        }
    }
    
}
