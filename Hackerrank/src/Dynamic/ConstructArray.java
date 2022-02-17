/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dynamic;
import java.util.*;

/**
 *
 * @author avnegers
 */
public class ConstructArray {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt(),k=sc.nextInt(),x=sc.nextInt();
       long dp[]=new long[n+1];
       int arr[]=new int[n];
       arr[0]=1;
       System.out.println(solve(1,k,n,x,dp,arr));
    }
    static int mod=1000000007;
 static long solve(int ci,int k,int n,int x,long dp[],int arr[]){
    long ans=0;
    int pe=0;
    if(dp[ci]!=0 && arr[ci-1]!=x)return dp[ci];
     if(ci==n-1){
         if(pe==x)return 0;
         else return 1;
     }
     for (int i = 1; i <= k; i++) {
       
     }
     return ans;
 }
}
