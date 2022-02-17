/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoogleKickStart.B21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

class Solution {

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int d[] = new int[arr.length - 1];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
                if (j > 0) {
                    d[j - 1] = arr[j] - arr[j - 1];
                }
            }
            int ans = 0;
            for (int j = 0; j < d.length; j++) {
                int ct1=d.length;
                int k;
                for (k = j+1; k < d.length; k++) {
                    if(d[k]!=d[j]){
                        if(ct1!=d.length)
                            break;
                        ct1=k;
                        k++;
                    }
                }
                if(ct1==d.length)
                    ans=Math.max(ans,ct1-j+1);
                else
                    ans=Math.max(ans,ct1-j+2);
                if(ct1+1<d.length&&d[ct1+1]-(d[j]-d[ct1])==d[j])
                    ans=Math.max(ans,k-j+1);
            }
            // System.out.println(Arrays.toString(d));
            System.out.println("Case #" + i + ": " + ans);
        }
    }
}

class FastReader {

    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    double nextDouble() {
        return Double.parseDouble(next());
    }

    String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
