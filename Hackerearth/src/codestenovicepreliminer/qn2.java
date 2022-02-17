/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codestenovicepreliminer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author avnegers
 */
public class qn2 {
    public static void main(String[] args) {
        Main2 sc= new Main2();
        //Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for (int j = 0; j <arr.length; j++) {
                arr[j]=sc.nextInt();
            }
            int ip=sc.nextInt()-1;
            int m=sc.nextInt();
            int d=sc.nextInt();
            int j;
            for (j = ip; m>=0; j=(j+d)%n) {
                if(j==-1)j=n-1;
                m-=arr[j];
            }
            if(d==1)
            System.out.println(j);
            else if(j!=n)
                System.out.println(j+1);
            else
                System.out.println(0);
        }
    }
}

class Main2
{
    
        BufferedReader br;
        StringTokenizer st;

        public Main2()
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