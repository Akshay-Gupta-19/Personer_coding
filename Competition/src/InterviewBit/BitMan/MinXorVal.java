/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewBit.BitMan;

import java.util.Arrays;

/**
 *
 * @author akggupta
 */
public class MinXorVal {
    public static void main(String[] args) {
        int A[]=new int[10];
            Arrays.sort(A);
            int ans=Integer.MAX_VALUE;
            for (int i = 0; i < A.length-1; i++) {
                ans=Math.min(ans,A[i]^A[i+1]);
            }
            System.out.println(ans);
           // return ans;
        }
}
