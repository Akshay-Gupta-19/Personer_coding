package GoogleKickStart.G20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

class Solution2 {
    public static void main(String[] args) {
        FastReader2 sc=new FastReader2();
        int t=sc.nextInt();
        for (int i = 1; i <=t; i++) {
            int n=sc.nextInt();
            int arr[][]=new int[n][n];
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                   arr[j][k]=sc.nextInt(); 
                }
            }
            long ans=0;
            for (int j = 0; j < arr.length; j++) {
                int ci=j,cj=0;
                long cpa=0;
                while(ci<arr.length && cj<arr.length){
                    cpa+=arr[ci][cj];
                    ci++;cj++;
                }
                ans=Math.max(cpa,ans);
            }
            for (int j = 1; j < arr.length; j++) {
                int ci=0,cj=j;
                long cpa=0;
                while(ci<arr.length && cj<arr.length){
                    cpa+=arr[ci][cj];
                    ci++;cj++;
                }
                ans=Math.max(cpa,ans);
            }
            System.out.println("Case #"+i+": "+ans);
        }
    }
}
class FastReader2 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader2() 
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
