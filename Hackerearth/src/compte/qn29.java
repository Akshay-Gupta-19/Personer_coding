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
public class qn29 {
    public static void main(String[] args) {
        Main4 sc=new Main4();
        int c=sc.nextInt(),p=sc.nextInt(),n=sc.nextInt();
         int z[]=new int[c];
        int c1[]=new int[c];
        int x[][]=new int[c][2];
        for (int i = 0; i < n; i++) {
           int u=sc.nextInt();
           c1[i]=1;
           x[i][1]=u;
           z[i]=x[i][1];
        }
        for (int i = 0; i <p; i++) {
            int qpc=sc.nextInt();
            int mini=0;
            
            for (int j = 0; j < x.length; j++) {
                if(z[j]<z[mini])mini=j;
            }
            System.out.print(mini+1+" ");
            c1[mini]++;
            x[mini][0]=x[mini][1];
            x[mini][1]=qpc;
            z[mini]=c1[mini]*(x[mini][0]+x[mini][1]);
        }
    }
}

class Main4
{
        BufferedReader br;
        StringTokenizer st;

        Main4(){    br = new BufferedReader(new
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
    
}