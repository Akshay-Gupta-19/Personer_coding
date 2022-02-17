/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoogleKickStart.B21;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

class Solution {
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        int t=sc.nextInt();
        for (int i = 1; i <=t; i++) {
            int n=sc.nextInt(),q=sc.nextInt();
            List<List<Integer>> adj=new ArrayList<>();
            List<List<Long>> cost=new ArrayList<>();
            for (int j = 0; j <n; j++) {
                adj.add(new ArrayList<>());
                cost.add(new ArrayList<>());
            }
            for (int j = 0; j < n-1; j++) {
                int x=sc.nextInt()-1,y=sc.nextInt()-1,l=sc.nextInt();
                long a=sc.nextLong();
                adj.get(x).add(y);
                adj.get(x).add(l);
                cost.get(x).add(a);
                
                adj.get(y).add(x);
                adj.get(y).add(l);
                cost.get(y).add(a);
            }
            
            int par[][]=new int[n][2];
            long parCost[]=new long[n];
            buildPar(adj, cost, par, parCost, 0);
            System.out.print("Case #"+i+": ");
            for (int j = 0; j < q; j++) {
                int c=sc.nextInt()-1,w=sc.nextInt();
                long ans=0;
                while(c!=0){
                    if(par[c][1]<=w)
                        ans=gcd(ans,parCost[c]);
                    c=par[c][0];
                }
                System.out.print(ans+" ");
            }
            System.out.println("");
        }
    }
    static long gcd(long a,long b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    
    static void buildPar(List<List<Integer>> adj,List<List<Long>> cost,int par[][], long parCost[],int cn){
        for (int i = 0,j=0; i < adj.get(cn).size(); i+=2,j++) {
            int currChild=adj.get(cn).get(i);
            if(currChild==par[cn][0])continue;
            par[currChild][0]=cn;
            par[currChild][1]=adj.get(cn).get(i+1);
            parCost[currChild]=cost.get(cn).get(j);
            buildPar(adj , cost, par ,parCost, currChild);
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
/*
1
7 5
2 1 2 4
2 3 7 8
3 4 6 2
5 3 9 9
2 6 1 5
7 1 5 7
5 10
5 8
4 1
6 1
7 6
*/