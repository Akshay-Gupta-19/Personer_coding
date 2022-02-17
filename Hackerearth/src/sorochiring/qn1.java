/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorochiring;

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
public class qn1 {
    public static void main(String[] args) {
        Main1 sc=new Main1();
        int n=sc.nextInt();
        int q=sc.nextInt();
        long arr1[]=new long[n];
        long arr2[]=new long[n];
        long arr3[]=new long[n];
        for (int i = 0; i < arr1.length; i++) {
            long x=sc.nextLong();
            if(x==0)arr1[i]=0;
            else if(x%9==0)arr1[i]=9;
            else
            arr1[i]=x%9;
        }
        Arrays.sort(arr1);
        arr2[0]=arr1[0];
        arr3[0]=arr1[arr1.length-1];
        for (int i = 1; i < arr2.length; i++) {
           arr2[i]=arr2[i-1]+arr1[i];
           arr3[i]=arr3[i-1]+arr1[arr1.length-1-i];
           
        }
        for (int i = 0; i < q; i++) {
            int x=sc.nextInt();
            switch(x){
                case 1:
                    System.out.println(arr3[sc.nextInt()-1]);
                    break;
                case 2:
                    System.out.println(arr2[sc.nextInt()-1]);
                    break;
            }
        }
    }
    
}
class Main1
{
        BufferedReader br;
        StringTokenizer st;

        Main1(){    br = new BufferedReader(new
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