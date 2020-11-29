package KickStartA20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

class Solution2 {
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        int t=sc.nextInt();
        for (int i = 1; i <=t; i++) {
            int n=sc.nextInt(),k=sc.nextInt(),p=sc.nextInt();
            int arr[][]=new int[n][k+1];
            for (int j = 0; j < arr.length; j++) {
                for (int l = 1; l < arr[j].length; l++) {
                    arr[j][l]=arr[j][l-1]+sc.nextInt();
                }
            }
            int dp[][]=new int[n+1][k+2];
            int ans=sol(arr,0,p,dp);
            System.out.println("Case #"+i+": "+ans);
        }
    }
    static int sol(int arr[][],int ci,int p,int dp[][]){
        int ans=0;
        if(ci>=arr.length || p<=0)return 0;
        if(dp[ci][p]!=0)return dp[ci][p];
        for (int i = 0; i < arr[ci].length && p-i>=0; i++) {
           ans=Math.max(ans,sol(arr,ci+1,p-i,dp)+arr[ci][i]);
        }
        return dp[ci][p]=ans;
    }
}
class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
