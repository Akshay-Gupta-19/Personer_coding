/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Circuit17;
import java.util.*;
/**
 *
 * @author avnegers
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class FastInput2
{
        BufferedReader br;
        StringTokenizer st;

        FastInput2(){    br = new BufferedReader(new
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
public class LeftOrRight_2 {
    public static void main(String[] args) {
        FastInput2 sc=new FastInput2();
        int n=sc.nextInt();
        int q=sc.nextInt();
        int arr[]=new int[n];
        HashMap<Integer,Integer> ansMap[][]=new HashMap[n][2];
        HashSet<Integer> hs=new HashSet<>();
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            hs.add(arr[i]);
        }
        int notypes=hs.size();
        for (int i = 0; i < ansMap.length; i++) {
            ansMap[i][0]=new HashMap<>();
            ansMap[i][1]=new HashMap<>();
            ansMap[i][0].put(arr[i], 0);
            ansMap[i][1].put(arr[i], 0);
            
            for (int j = (i-1+n)%n,k=1; j !=i; j=(j-1+n)%n,k++) {
                if(!ansMap[i][0].containsKey(arr[j]))
                    ansMap[i][0].put(arr[j], k);
                if(ansMap[i][0].size()==notypes)break;
            }
            for (int j = (i+1)%n,k=1; j !=i; j=(j+1)%n,k++) {
                if(!ansMap[i][1].containsKey(arr[j]))
                    ansMap[i][1].put(arr[j], k);
                if(ansMap[i][1].size()==notypes)break;
            }
            
        }
        
        for (int i = 0; i < q; i++) {
            int y=sc.nextInt(),z=sc.nextInt(),D=sc.next().charAt(0);
            int dir;
            if(D=='L')
                dir=0;
            else
                dir=1;
            if(ansMap[y][dir].containsKey(z))System.out.println(ansMap[y][dir].get(z));
            else System.out.println(-1);
        }
    }
    
}
