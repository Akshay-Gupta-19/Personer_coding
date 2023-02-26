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
public class Test12 {
    
}
class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int left=0,right=0;
        Stack<int[]> st=new Stack<>();
        while(left<nums1.length || right<nums2.length){
            if(right==nums2.length || (left<nums1.length && nums1[left][0]<nums2[right][0])){
                if(!st.isEmpty() && nums1[left][0]==st.peek()[0]){
                    int old[]=st.pop();
                   nums1[left][1]+=old[1];
                }
                st.add(new int[]{nums1[left][0],nums1[left][1]});
                left++;
            }else{
                if(!st.isEmpty() && nums2[right][0]==st.peek()[0]){
                    int old[]=st.pop();
                   nums2[right][1]+=old[1];
                }
                st.add(new int[]{nums2[right][0],nums2[right][1]});
                right++;
            }
        }
        int i=0;
        int ans[][]=new int[st.size()][2];
        for(int[] x:st){
            ans[i++]=x;
        }
        return ans;
    }
}