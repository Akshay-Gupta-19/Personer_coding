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
            int pt[]=new int[m];
            for (int j = 0; j < pt.length; j++) {
               pt[j]=sc.nextInt(); 
            }
            int rc[]=new int[q];
            
            for (int j = 0; j < rc.length; j++) {
                rc[j]=sc.nextInt();
            }
            long ans=0;
            for (int j = 0; j < rc.length; j++) {
                ans+=(n/rc[j]);
                for (int k = 0; k < pt.length; k++) {
                    if(pt[k]%rc[j]==0)ans--;
                }
            }
            System.out.println("Case #"+i+": "+ans);
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