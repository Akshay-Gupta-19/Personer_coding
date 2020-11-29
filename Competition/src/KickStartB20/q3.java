/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KickStartB20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author akggupta
 */
public class q3 {
   public static void main(String[] args) {
        FastReader sc=new FastReader();
        Boolean b=new Boolean(true);
        long t=sc.nextInt();
        for (long i = 1; i <=t; i++) {
            char c[]=sc.next().toCharArray();
            long fv[]=sol(c);
            System.out.println("Case #"+i+": "+(1+fv[0])+" "+(1+fv[1]));
        }
    }
   static long mv=1000000000;
   static long[] sol(char c[]){
       long rv[]=new long[2];
       for (int i = 0; i < c.length; i++) {
          switch(c[i]){
              case 'E':
                  rv[0]=corre(rv[0]+1);
                  break;
              case 'W':
                  rv[0]=corre(rv[0]-1);
                  break;
              case 'S':
                  rv[1]=corre(rv[1]+1);
                  break;
              case 'N':
                  rv[1]=corre(rv[1]-1);
                  break;
              default:
                  int mn=c[i]-'0';
                  int bc=1;
                  int ep=0;
                  for (int j = i+2; bc!=0; j++) {
                      if(c[j]=='(')bc++;
                      if(c[j]==')')bc--;
                      ep=j-1;
                  }
                  long ifr[]=sol(new String(c,i+2,ep-i-1).toCharArray());
                  rv[0]=corre(rv[0]+corre(corre(ifr[0])*mn));
                  rv[1]=corre(rv[1]+corre(corre(ifr[1])*mn));
                  i=ep+1;
          } 
       }
       return rv;
   }
   static long corre(long num){
       return (num+mv)%mv;
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
  
        long nextInt() 
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
