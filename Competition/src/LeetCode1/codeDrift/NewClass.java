/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode1.codeDrift;

import java.util.Arrays;

/**
 *
 * @author AKGGUPTA
 */
public class NewClass {
    public static void main(String[] args) {
        int ans=new NewClass().sol(6);
        System.out.println(ans);
    }
    int sol(int n){
        int dp[]=new int[n+1];
        Arrays.fill(dp, -1);
        dp[0] = 0; dp[1] = 1; dp[2] = 2; dp[3] = 3;
        int max=n+1;
    for(int i = 1; i < max; ++i){
        if(dp[i] == -1 || dp[i] > (dp[i - 1] + 1))
            dp[i] = dp[i - 1] + 1;
        for(int j = 1; j <= i && j * i < max; ++j)
            if(dp[j * i] == -1 || (dp[i] + 1) < dp[j * i])
                dp[j * i] = dp[i] + 1;
    }
        System.out.println(Arrays.toString(dp));
    return dp[n];
    
    
    }
}
