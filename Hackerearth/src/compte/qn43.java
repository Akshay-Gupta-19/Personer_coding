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
public class qn43 {
    public static void main(String[] args) {
       
        Main7 sc=new Main7();
        int m=sc.nextInt(),n=sc.nextInt();
        int arr[]=new int[m];
        for (int i = 0; i < arr.length; i++) {
           arr[i]=sc.nextInt(); 
        }
        int ans=0;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            ans+=arr[arr.length-1];
            arr[arr.length-1]--;
            int tv=arr[arr.length-1];
           int k=arr.length-2; while(k>=0 && arr[k]>tv)arr[k+1]=arr[k--];arr[++k]=tv;
        }
        System.out.println(ans);
    }
}

class Main7
{
        BufferedReader br;
        StringTokenizer st;

        Main7(){    br = new BufferedReader(new
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