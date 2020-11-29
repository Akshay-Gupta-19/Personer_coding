/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoogleKickStart.C20;

/**
 *
 * @author akggupta
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

class Solution3 {
    public static void main(String[] args) {
        FastReader3 sc=new FastReader3();
        int t=sc.nextInt();
        for (int i = 1; i <=t; i++) {
            int n=sc.nextInt();
            int arr[]=new int[n];
            int cs[]=new int[n+1];
            for (int j = 0; j < arr.length; j++) {
               arr[j]=sc.nextInt();
            }
            for (int j = 1; j < cs.length; j++) {
               cs[j] =cs[j-1]+arr[j-1];
            }
            int fa=0;
            ArrayList<Integer> sqrs=new ArrayList<>();
            for (int j = 0; j * j <= 10000000; j++) {
                sqrs.add(j*j);
            }
            for (int j = 0; j < cs.length; j++) {
                for (int k = 0; k < sqrs.size(); k++) {
                    Integer get = sqrs.get(k);
                    if(Arrays.binarySearch(cs, 0, j, cs[j]-get)>0)fa++;
                }
            }
            System.out.println("Case #"+i+": "+fa);
        }
    }
}
class FastReader3 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader3() 
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
