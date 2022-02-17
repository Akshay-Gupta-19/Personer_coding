/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JanEasy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/**
 *
 * @author avnegers
 */
public class qn1 {
    public static void main(String[] args) {
        FastInput sc=new FastInput();
        int n=sc.nextInt();
        long ans=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i = 0; i < n; i++) {
            int x=sc.nextInt();
            if(!hm.containsKey(x))
                hm.put(x, 0);
            int prev=hm.get(x);
            hm.put(x,prev+1);
            ans+=prev;
        }
        System.out.println(ans);
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