/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SapTest;

import java.util.*;

/**
 *
 * @author AKGGUPTA
 */
public class Q1 {
    public static void main(String[] args) {
        ArrayList al=new ArrayList<>();
        al.add(1);
        al.add(3);
        al.add(5);
        al.add(3);
        al.add(5);
        
        long totalTriplets = totalTriplets2(al, 15);
        System.out.println(totalTriplets);
    }

 public static long totalTriplets(List<Integer> capacity,long desiredCapacity){
     HashMap<Long,Integer> hm=new HashMap<>();
     long ans=0;
     for(int i=0;i<capacity.size();i++){
         hm.put((long)capacity.get(i),hm.getOrDefault((long)capacity.get(i),0)+1);
     }
     for(int i=1;i<capacity.size();i++){
         long cdc=desiredCapacity/((long)capacity.get(i)*capacity.get(i-1));
         ans+=hm.getOrDefault(cdc, 0);
         if(cdc==(long)capacity.get(i-1))ans--;
         if(cdc==(long)capacity.get(i))ans--;
     }
     return ans;
     
 }
 public static long totalTriplets2(List<Integer> capacity,long desiredCapacity){
     HashMap<Long,HashSet<Integer>> hm=new HashMap<>();
     List<Long> cap2=new ArrayList<>();
     for (int i = 0; i < capacity.size(); i++) {
         cap2.add((long)capacity.get(i));
     }
     for (int i = 0; i < capacity.size(); i++) {
        hm.putIfAbsent(cap2.get(i), new HashSet<>());
        hm.get(cap2.get(i)).add(i);
     }
     long ans=0;
     for (int i = 1; i < cap2.size(); i++) {
         long rn=desiredCapacity/(cap2.get(i)*cap2.get(i-1));
         HashSet<Integer> chs=hm.getOrDefault(rn,new HashSet<>());
         ans+=
                 (chs).size();
         if(chs.contains(i))ans--;
         if(chs.contains(i-1))ans--;
         if(chs.contains(i-2))ans--;
     }
     return ans;
 }
}



