/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoogleKickStart.C20;

/**
 *
 * @author akggupta
 */
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
            int n = sc.nextInt(), k = sc.nextInt();
            int ans = 0;
            int arr[] = new int[n];
            for (int j = 0; j < arr.length; j++) {
               arr[j]=sc.nextInt();
            }
            for (int j = 0; j < n; j++) {
                int crn = k;
                while (j < n && crn > 0 && arr[j] == crn) {
                    j++;
                    crn = crn - 1;
                }
                if(crn!=k)j--;
                if (crn == 0) {
                    ans++;
                }
            }
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
