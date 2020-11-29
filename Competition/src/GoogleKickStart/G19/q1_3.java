package GoogleKickStart.G19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        int t=sc.nextInt();
        for (int i = 1; i <=t; i++) {
            int n=sc.nextInt(),m=sc.nextInt(),q=sc.nextInt();
            boolean book[]=new boolean[n+1];
            for (int j = 0; j < m; j++) {
               book[sc.nextInt()]=true;
            }
            int fcal[]=new int[n+1];
            for (int j = 1; j < fcal.length; j++) {
                for (int k = j; k <= n; k+=j) {
                    if(!book[k])fcal[j]++;
                }
            }
            int ans=0;
            for (int j = 0; j < q; j++) {
                ans+=fcal[sc.nextInt()];
            }
            System.out.println("Case #"+i+":"+ans);
        }
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