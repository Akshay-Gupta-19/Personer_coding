package adobe;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class qn2 {
    public static void main(String[] args) {
        Main sc=new Main();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
           arr[i]=sc.nextInt(); 
        }
        int q=sc.nextInt();
        for (int i = 0; i < q; i++) {
           int x=sc.nextInt();
           int k=sc.nextInt();
           boolean ans=false;
            for (int j = 0; j < arr.length; j++) {
               if(x%arr[j]==0)k--;
               if(k<=0)ans=true;
            }
            if(ans)System.out.println("Yes");
            else System.out.println("No");
        }
    }
    
}

class Main
{
        BufferedReader br;
        StringTokenizer st;

        Main(){    br = new BufferedReader(new
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