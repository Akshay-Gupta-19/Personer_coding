/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scrap;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;
/**
 *
 * @author guptaakshay
 */
public class Clas12 {
    
}
class Solution55 {
    public long minCost(int[] basket1, int[] basket2) {
        Map<Integer, Long> b1 = Arrays.stream(basket1).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Map<Integer, Long> b2 = Arrays.stream(basket2).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        ArrayList<Integer> firstList=new ArrayList();
        ArrayList<Integer> secondList=new ArrayList();
        
        for(Integer vals:b1.keySet()){
            long b1f=b1.get(vals);
            long b2f=b2.getOrDefault(vals,0l);
            if(b1f%2==0 || b2f%2==0)return -1;
            if(b1f>b2f){
                for(int i=0;i<b1f-b2f;i++){
                    firstList.add(vals);
                }
            }else if(b1f<b2f){
                for(int i=0;i<b2f-b1f;i++){
                    secondList.add(vals);
                }
            }
        }
        long ans=0;
        assert firstList.size()==secondList.size();
        for (int i = 0; i < secondList.size(); i++) {
           ans+= Math.min(secondList.get(i),(long)firstList.get(firstList.size()-1-i));
        }
        return ans;
    }
}