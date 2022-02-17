/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ntanixbackedhiring;

import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn2 {
    static int pp[][];
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       pp=new int[n][2];
        for (int i = 0; i < n; i++) {
            pp[i][0]=sc.nextInt();
            pp[i][1]=sc.nextInt();
        }
        int d=sc.nextInt(),p=sc.nextInt();
        dp=new int[d+1][(p+1)][n+1][n+1];
        System.out.println(solve(d,p,0,n-1));
      }
    static int dp[][][][];
    static int solve(int cd,int cp,int cs,int i){//current distence ,current petrol current stop
        if(cd<=0)return cs;
        int ans=0;
        if(cp<0)return 2000000000;
        if(dp[cd][cp][cs][i]!=0)return dp[cd][cp][cs][i];
        if(i<0)ans=solve(cd-1,cp-1,cs,i-1);
        else if(cd==pp[i][0])ans=Math.min(solve(cd-1,cp+pp[i][1]-1,cs+1,i-1),solve(cd-1,cp-1,cs,i-1));
        else ans=solve(cd-1,cp-1,cs,i);
        dp[cd][cp][cs][i]=ans;
        return ans;
    }
}
