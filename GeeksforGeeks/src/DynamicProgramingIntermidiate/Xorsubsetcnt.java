/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicProgramingIntermidiate;
import java.util.*;

public class Xorsubsetcnt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int arr[]=new int[n];
            int maxor=0,cxor=0;
            for (int j = 0; j < arr.length; j++) {
               arr[j]=sc.nextInt(); 
               cxor^=arr[j];
               if(maxor<cxor)maxor=cxor;
            }
            int dp[][]=new int[n+1][maxor+1];
            System.out.println(sol(0,k,0,arr,dp));
        }
    }
    static int sol(int i,int k,int cxor,int arr[],int dp[][]){
        int ans=0;
        if(i>=arr.length){
            if(cxor==k)return 1;
            else return 0;
        }
        if(dp[i][cxor]!=0)return dp[i][cxor];
        
        ans+=(sol(i+1,k,cxor^arr[i],arr,dp)+sol(i+1,k,cxor,arr,dp));
        dp[i][cxor]=ans;
        return ans;
    
    }       
    
}
