/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewBit.DP;

import java.util.Arrays;

/**
 *
 * @author akggupta
 */
public class InterLivingString {
    public static void main(String[] args) {
        String   A = "aabcc",
    B = "dbbca",
    C = "aadbbbaccc"

;
        int dp[][][]=new int[A.length()+1][B.length()+1][C.length()+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                Arrays.fill(dp[i][j],-1);
            }
 
        }
        System.out.println(find(A.toCharArray(),B.toCharArray(),C.toCharArray(),0,0,0,dp));
    }
    static int find(char a[],char b[],char c[],int ai,int bi,int ci,int dp[][][]){
        if(ci==c.length)return a.length==ai && b.length==bi ?1:0;
        if(ai==a.length)return new String(b,bi, b.length-bi).equals(new String(c,ci,c.length-ci))?1:0;
        if(bi==b.length)return new String(a,ai, a.length-ai).equals(new String(c,ci,c.length-ci))?1:0;
        int ans=0;
        if(dp[ai][bi][ci]!=-1)return dp[ai][bi][ci];
        if(a[ai]==c[ci])ans=find(a,b,c,ai+1,bi,ci+1,dp);
        if(b[bi]==c[ci])ans=ans+find(a,b,c,ai,bi+1,ci+1,dp);
        if(ans>0)return 1;
        return 0;
    }
}
