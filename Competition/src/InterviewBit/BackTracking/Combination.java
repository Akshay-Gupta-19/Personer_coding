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
public class Combination {
    public static void main(String[] args) {
        int A=2,B=1;
        int ans[][]=new int[binomialCoeff(A, B)][B];
        ArrayList<Integer> al=new ArrayList<>();
        comb(A,B,1,al,ans);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(i+" "+Arrays.toString(ans[i]));
        }
    }
   static int ci=0;
 static int binomialCoeff(int n, int k) 
    { 
        int res = 1; 
      
        // Since C(n, k) = C(n, n-k) 
        if ( k > n - k ) 
            k = n - k; 
      
        // Calculate value of [n * (n-1) *---* (n-k+1)] / [k * (k-1) *----* 1] 
        for (int i = 0; i < k; ++i) 
        { 
        res *= (n - i); 
        res /= (i + 1); 
        } 
      
        return res; 
    }
    static void comb(int A,int B,int cn,ArrayList<Integer> al,int ans[][]){
        if(al.size()+(A-cn)+1<B)return;
        if(al.size()==B){
            for (int i = 0; i < al.size(); i++) {
               ans[ci][i]=al.get(i); 
            }
            ci++;
            return;
        }     
        al.add(cn);
        comb(A,B,cn+1,al,ans);
        al.remove(new Integer(cn));
        comb(A,B,cn+1,al,ans);
    }
}
