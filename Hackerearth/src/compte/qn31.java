/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compte;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author avnegers
 */
public class qn31 {
    public static void main(String[] args) {
        Main5 sc=new Main5();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        long ans=0;
        for (int i = 0; i < arr.length/2; i++) {
           ans=ans+Math.abs(arr[i]-arr[arr.length-1-i]); 
        }
        for (int i =1; i < arr.length/2; i++) {
           ans=ans+Math.abs(arr[i]-arr[arr.length-i]); 
        }
        if(n%2==0)ans+=Math.abs(arr[0]-arr[arr.length/2]);
        else ans+=Math.abs(arr[0]-arr[arr.length/2-1]);
        System.out.println(ans);
    }
}


class Main5
{
        BufferedReader br;
        StringTokenizer st;

        Main5(){    br = new BufferedReader(new
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