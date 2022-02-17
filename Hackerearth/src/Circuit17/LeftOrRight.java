/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Circuit17;
import java.util.*;
/**
 *
 * @author avnegers
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class FastInput
{
        BufferedReader br;
        StringTokenizer st;

        FastInput(){    br = new BufferedReader(new
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
public class LeftOrRight {
    public static void main(String[] args) {
        FastInput sc=new FastInput();
        int n=sc.nextInt();
        int q=sc.nextInt();
        int arr[]=new int[3*n];
        HashMap<Integer,Integer> ansMap[][]=new HashMap[n][2];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            arr[i+n]=arr[i];
            arr[i+2*n]=arr[i];
        }
        HashMap<Integer,Integer> goingLeft=new HashMap<>();
        for (int i = 0; i < arr.length-n; i++) {
            goingLeft.put(arr[i], 0);
           if(i>=n){
               ansMap[i-n][0]=new HashMap<>();
               ansMap[i-n][1]=new HashMap<>();
               ansMap[i-n][0].putAll(goingLeft);
           }
           Set<Integer> ks=goingLeft.keySet();
           for(Integer kv:ks){
               goingLeft.replace(kv,goingLeft.get(kv)+1);
           }
        }
        goingLeft.clear();
        for (int i = 3*n-1; i >n; i--) {
           goingLeft.put(arr[i], 0);
           if(i<2*n){
               ansMap[i-n][1].putAll(goingLeft);
           }
           Set<Integer> ks=goingLeft.keySet();
           for(Integer kv:ks){
               goingLeft.replace(kv,goingLeft.get(kv)+1);
           }
        }
        for (int i = 0; i < q; i++) {
            int y=sc.nextInt(),z=sc.nextInt(),D=sc.next().charAt(0);
            int dir;
            if(D=='L')
                dir=0;
            else
                dir=1;
            if(ansMap[y][dir].containsKey(z))System.out.println(ansMap[y][dir].get(z));
            else System.out.println(-1);
        }
    }
    
}
