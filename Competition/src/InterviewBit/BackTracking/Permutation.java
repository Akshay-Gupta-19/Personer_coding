/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewBit.BackTracking;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author akggupta
 */
public class Permutation {
    public static void main(String[] args) {
        int A[]=new int[]{1,2,3};
        int pi[]=new int[A.length];
        int pii[]=new int[1];
        int ans[][]=new int[fact(A.length)][A.length];
        int cia[]=new int[1];
        ArrayList<Integer> al=new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            al.add(A[i]);
        }
        per(pi,pii,ans,cia,al);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }
    }
    static int fact(int a){
        int ans=1;
        for (int i = 2; i <= a; i++) {
            ans*=i;
        }
        return ans;
    }
   static void per(int pi[],int pii[],int ans[][],int cia[],ArrayList<Integer> al){
       if(al.isEmpty()){
           for (int i = 0; i < pi.length; i++) {
               ans[cia[0]][i]=pi[i];
           }
           cia[0]++;
           return;
       }
       for (int i = 0; i < al.size(); i++) {
       int x=al.get(i);
       pi[pii[0]]=x;
        pii[0]++;
        al.remove(i);
        per(pi,pii,ans,cia,al);
        al.add(i,x);
        pii[0]--;
       }
   }
}
