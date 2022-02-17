/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicProgramingIntermidiate;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            sc.nextInt();
            char c[]=sc.next().toCharArray();
            int dp[]=new int[c.length+1];
            Arrays.fill(dp, -1);
            System.out.println(solve(c,0,dp));
        }
    }
    static int solve(char c[],int i,int dp[]){
        if(i>=c.length)return 1;
        int ans=0;
        if(dp[i]!=-1)return dp[i];
        ans+=solve(c,i+1,dp);
        if(i<c.length-1 && (c[i]-'0')*10+(c[i+1]-'0')<27 && c[i]!='0')ans+=solve(c, i+2,dp);
        return dp[i]=ans;
    }
    
}
