package KickStartE20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        int t=sc.nextInt();
        for (int i = 1; i <=t; i++) {
            int n=sc.nextInt();
            LinkedList<Pair<Integer,Integer>> ll=new LinkedList<>();
            int total=0;
            for (int j = 0; j < n; j++) {
               ll.add(new Pair<>(total+=sc.nextInt(),sc.nextInt()));
            }
            boolean change = true;
            while(change){
                change=false;
                for (int j = 0; j < ll.size(); j++) {
                   if(ll.get(j).b>=total-ll.get(j).a){
                       ll.remove(j);j--;
                       change=true;
                   }
                }
            }
            
            System.out.println("Case #"+i+": ");
        }
    }
}

class Pair<T0, T1> {
    T0 a;
    T1 b;

    public Pair(T0 a, T1 b) {
        this.a = a;
        this.b = b;
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
