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
public class qn4 {
    public static void main(String[] args) {
        Main sc=new Main();
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int q=sc.nextInt();
            int arr[]=new int[q];
            for (int j = 0; j < q; j++) {
                arr[j]=sc.nextInt();
                int ca=1;
                for(int k=j-1;k>=0 && arr[k]<=arr[j];k--)ca++;
                System.out.print(ca+" ");
            }
            System.out.println();
        }
    }
}
class Main
{
    
        BufferedReader br;
        StringTokenizer st;

        public Main()
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