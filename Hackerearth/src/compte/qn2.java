/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compte;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author avnegers
 */
public class qn2 {
    public static void main(String[] args) {
        Main1 sc=new Main1();
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int arr[]=new int[1000002];
            int max=0;
            ArrayList<Integer> al=new ArrayList<>();
            for (int j = 0; j < n; j++) {
                int x=sc.nextInt();
                arr[x]++;if(arr[x]>max){max=arr[x];al.clear();al.add(x);}
                else if(arr[x]==max){al.add(x);}
            }
            al.sort(null);
            for (int j = al.size()-1; j>=0; j--) {
               System.out.print(al.get(j)+" "); 
            }
            System.out.println();
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