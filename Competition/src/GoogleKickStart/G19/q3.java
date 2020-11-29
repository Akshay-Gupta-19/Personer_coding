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
            int n=sc.nextInt(),h=sc.nextInt();
            int as[]=new int[n];
            int bs[]=new int[n];
            for (int j = 0; j < as.length; j++) {
                as[j]=sc.nextInt();
            }
            for (int j = 0; j < bs.length; j++) {
               bs[j]=sc.nextInt();
            }
            int fa[]=new int[1];
            sol(0,as,bs,h,0,0,fa);
            System.out.println("Case #"+i+": "+fa[0]);
        }
    }
    static void sol(int ci,int as[],int bs[],int rhp,long acp,long bcp,int fa[]){
        if(ci==as.length){
            if(acp>=rhp && bcp>=rhp)fa[0]++;
            return;
        }
        sol(ci+1,as,bs,rhp,acp+as[ci],bcp,fa);
        sol(ci+1,as,bs,rhp,acp,bcp+bs[ci],fa);
        sol(ci+1,as,bs,rhp,acp+as[ci],bcp+bs[ci],fa);
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
