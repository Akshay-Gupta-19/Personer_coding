/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compte;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author avnegers
 */
public class qn33 {
    public static void main(String[] args) {
       Main6 sc=new Main6();
        int t=sc.nextInt();
        for (int i = 0; i <t; i++) {
            
            String s=sc.nextLine();
            String s2[]=s.split(" ");
            for (int j = s2.length-1; j>=0; j--) {
                System.out.print(s2[j]+" ");
            }
            System.out.println("");
        }
    }
}


class Main6
{
        BufferedReader br;
        StringTokenizer st;

        Main6(){    br = new BufferedReader(new
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