package KickStartA20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

class Solution {
    static String toBin(int n,int l){
        String ans=Integer.toBinaryString(n);
        while(ans.length()<l)ans="0"+ans;
        return ans;
    }
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        int t=sc.nextInt();
        new Date().setDate(8);
        for (int i = 1; i <=t; i++) {
            int n=sc.nextInt(),k=sc.nextInt(),p=sc.nextInt();
            int arr[][]=new int[n][k];
            int trk=(int)(Math.log(k)/Math.log(2));
            int dp[][]=new int[100000][p+1];
            for (int j = 0; j < arr.length; j++) {
                for (int l = 0; l < arr[j].length; l++) {
                    arr[j][l]=sc.nextInt();
                }
            }
            int sl[]=new int[n];
            int ans=sol(arr,sl,p,dp,trk);
            System.out.println("Case #"+i+": "+ans);
        }
    }
    static int sol(int arr[][],int sl[],int p,int dp[][],int trk){
        int ans=0;
        if(p<=0)return 0;
        String br="";
        for (int i = 0; i < sl.length; i++) {
            br=toBin(sl[i],trk)+br;
        }
        int dpr=Integer.parseInt(br,2);
        if(dp[dpr][p]!=0)return dp[dpr][p];
        for (int i = 0; i < sl.length; i++) {
            sl[i]++;
            if(sl[i]>arr[i].length){sl[i]--;continue;}
            ans=Math.max(ans,sol(arr,sl,p-1,dp,trk)+arr[i][sl[i]-1]);
            sl[i]--;
        }
        return dp[dpr][p]=ans;
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
