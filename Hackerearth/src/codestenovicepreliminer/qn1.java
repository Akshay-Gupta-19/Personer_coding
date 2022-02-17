/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codestenovicepreliminer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author avnegers
 */
public class qn1 {
    public static void main(String[] args) {
      Main3 sc=new Main3();
      int n=sc.nextInt(),q=sc.nextInt();
      int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int dy[][]=new int[n][n];
        for (int i = 0; i <q; i++) {
            System.out.println(solve(dy,arr,sc.nextInt()-1,sc.nextInt()-1));
        }
    }
   static int solve(int a[][],int b[],int c,int d){
       if(a[c][d]!=0)return a[c][d];
       if(c>d)return 0;
       int a1=0,a2=0;
       if(c==d){
          if((c==0 || b[c]>b[c-1]) && (c==b.length-1 || b[c]>b[c+1]))
              a[c][d]=1;
              return a[c][d];
       }
       if((c==0 || b[c]>b[c-1]) && (c==b.length-1 || b[c]>b[c+1]))a1++;
       if((d==0 || b[d]>b[d-1]) && (d==b.length-1 || b[d]>b[d+1]))a2++;
       if(a[c+1][d]!=0)a[c][d]=a[c+1][d]+a1;
       else if(a[c][d-1]!=0)a[c][d]=a[c][d-1]+a2;
       else a[c][d]=solve(a,b,c+1,d-1)+a1+a2;
       return a[c][d];
   }
}

class Main3
{
    
        BufferedReader br;
        StringTokenizer st;

        public Main3()
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