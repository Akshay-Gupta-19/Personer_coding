/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeNite2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/**
 *
 * @author avnegers
 */
public class Qn2 {
    public static void main(String[] args) {
        FastInput sc=new FastInput();
        int n=sc.nextInt();
        int arrXs[]=new int[n];
        long arrLs[]=new long[n];
        for (int i = 0; i < n; i++) {
            arrXs[i]=sc.nextInt();
            arrLs[i]=sc.nextLong();
        }
        for (int i = 0; i < arrXs.length; i++) {
            long len=arrLs[i];
            int j;
            for (j = i+1; j < arrLs.length; j++) {
                j=binSearch(arrXs,j,arrXs.length,arrXs[j-1]+len);
                if(j>=arrLs.length)break;
                if(len>=arrXs[j]-arrXs[j-1]){
                    len-=(arrXs[j]-arrXs[j-1]);
                    len=Math.max(arrLs[j],len);
                }
                else{
                    break;
                }
            }
            System.out.println(arrXs[j-1]+arrLs[j-1]+arrXs[i]);
        }
    }
    
    static int binSearch(int arr[], int l, int r, long x)
    {
        if(r-l<=1  && arr[l]!=x){
            return r;
        }
        if (r>=l)
        {
            int mid = l + (r - l)/2;
            if (arr[mid] == x)
               return mid;
            if (arr[mid] > x)
               return binSearch(arr, l, mid-1, x);
            return binSearch(arr, mid+1, r, x);
        }

  return -1;
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