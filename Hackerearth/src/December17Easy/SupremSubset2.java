/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package December17Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author avnegers
 */
public class SupremSubset2 {
    public static void main(String[] args) {
        FastInput sc=new FastInput();
        int n=sc.nextInt(),m=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
           arr[i]=sc.nextInt(); 
        }
        Arrays.sort(arr);
        int ansi=0;
        int ans=0;
        HashSet<Integer> hs=new HashSet<>();
        for (int i = 0; i < arr.length ; i++) {
            int ca=1;
            if(hs.contains(i))continue;
            for (int j = i+1; j < arr.length; j++) {
             if((arr[j]-arr[i])%m==0){hs.add(j);ca++;}   
            }
            if(ca>ans){ans=ca;ansi=i;}
        }
        System.out.println(ans);
        for (int i = ansi; i < arr.length; i++) {
           if((arr[i]-arr[ansi])%m==0)
                System.out.print(arr[i]+" ");
        }
    }
}


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