

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

class Solution2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 1; i <=t; i++) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int arr[]=new int[n];
            PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)-> b-a);
            for (int j = 0; j < arr.length; j++) {
               arr[j]=sc.nextInt(); 
               if(j!=0)pq.add(arr[j]-arr[j-1]);
            }
            while(k>0 && pq.peek()>=2){
                int val=pq.poll();
                if(val%2==0)pq.add(val/2);
                else pq.add(val/2+1);
                k--;
            }
            System.out.println("Case #"+i+": "+pq.peek());
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
