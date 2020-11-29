/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewBit.Hashing;

import java.util.*;

/**
 *
 * @author akggupta
 */
public class FourSum {
    public static void main(String[] args) {
        int[] A=new int[]{1,0,-1,0,-2,2};
        int B=0;
        Arrays.parallelSort(A);
        //A=rmDup(A);
        HashSet<ArrayList<Integer>> al=new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            for (int j = i+1; j < A.length; j++) {
               int l=j+1,r=A.length-1;
               int cs=A[i]+A[j];
               while(l<r){
                   if(cs+A[l]+A[r]<B)l++;
                   else if(cs+A[l]+A[r]>B)r--;
                   else{
                       ArrayList<Integer> nal=new ArrayList<>();
                       nal.add(A[i]);nal.add(A[j]);nal.add(A[l]);nal.add(A[r]);
                       al.add(nal);
                       l++;r--;
                   }
               }
            }
        }
        int ans[][]=new int[al.size()][4];
        Iterator<ArrayList<Integer>> it=al.iterator();
       for(int i=0;it.hasNext();i++){
            ArrayList<Integer> cal=it.next();
            ans[i][0]=cal.get(0);
            ans[i][1]=cal.get(1);
            ans[i][2]=cal.get(2);
            ans[i][3]=cal.get(3);
            
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(Arrays.toString(ans[i])); 
        }
    }
    static int[] rmDup(int arr[]){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
           while(i<arr.length && arr[i]==arr[i-1])i++; 
          if(i<arr.length) al.add(arr[i]);
        }
        int ans[]=new int[al.size()];
        for (int i = 0; i < ans.length; i++) {
           ans[i]=al.get(i); 
        }
        return ans;
    }
}
