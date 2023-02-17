/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scrap;
import java.util.*;
/**
 *
 * @author guptaakshay
 */
public class Clas16 {
    
}
class Solution356 {
    public long countFairPairs(int[] nums, int lower, int upper) {
        TreeSet<Integer> ts=new TreeSet<>((a,b)->a.equals(b)?1:a-b);
        long ans=0;
        for (int i = 0; i < nums.length; i++) {
           ans+=(ts.subSet(lower-nums[i], true, upper-nums[i], true).size()); 
        }
        return ans;
    }
}