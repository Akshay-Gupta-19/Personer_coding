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
            int book[]=new int[n+1];
            for (int j = 0; j < q; j++) {
                int x=sc.nextInt();
                for (int k = x; k < book.length; k=k+x) {
                    book[k]++;
                }
            }
            long ans=0;
            
            for (int j = 0; j <pt.length; j++) {
              book[pt[j]]=0; 
            }
            for (int j = 0; j < book.length; j++) {
               ans+=book[j]; 
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