/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoogleKickStart.B21.G18;

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
            int n=sc.nextInt(),m=sc.nextInt(),e=sc.nextInt(),sr=sc.nextInt()-1,scl=sc.nextInt()-1,tr=sc.nextInt()-1,tc=sc.nextInt()-1;
            int arr[][]=new int[n][m];
            for(int j=0;j<n;j++)
                for(int k=0;k<n;k++)
                    arr[j][k]=sc.nextInt();
            PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->arr[a.x][a.y]-arr[b.x][b.y]);
            pq.add(new Pair(sr,scl));
            int ans[][]=new int[n][m];
            for (int j = 0; j < ans.length; j++) {
               Arrays.fill(ans[j], 1000000);
            }
            ans[sr][scl]=0;
            int dir[][]=new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
            new LinkedList<>();
            while(!pq.isEmpty()){
                Pair next=pq.poll();
                if(next.x==tr && next.y==tc)break;
                for(int k=0;k<dir.length;k++){
                    int nr=dir[k][0]+next.x;
                    int nc=dir[k][1]+next.y;
                    if(valid(nr,nc,arr) && ans[nr][nc]>ans[next.x][next.y]+arr[nr][nc]){
                        pq.add(new Pair(nr,nc));
                        ans[nr][nc]=ans[next.x][next.y]+arr[nr][nc];
                    }
                }
            }
            System.out.println("Case #"+i+": "+(e-ans[tr][tc]));
        }
    }
        static boolean valid(int nr,int nc,int arr[][]){
            return nr>=0 && nr<arr.length && nc>=0 && nc<arr[0].length && arr[nr][nc]!=-100000;
        }
}

/*
1
4 4 100 1 1 4 4
0 0 0 0
0 0 0 0
0 0 0 -100000
0 0 -100000 0
*/
class Pair{
    int x,y;
    Pair(int a,int b){
        x=a;
        y=b;
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
