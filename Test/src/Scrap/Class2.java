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
public class Class2 {
    
}
class Solution473 {
    public int[] separateDigits(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            String curr=nums[i]+"";
            for (int j = curr.length()-1; j >=0; j--) {
                ans.add(curr.charAt(i)-'0');
            }
        }
        int arr[]=new int[ans.size()];
        for (int i = 0; i < arr.length; i++) {
           arr[i]=ans.get(i); 
        }
        return arr;
    }
}