package KickStartA20;

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
            char c[][] = new char[n][];
            int maxi = 0;
            for (int j = 0; j < c.length; j++) {
                c[j] = sc.next().toCharArray();
                if (c[j].length > maxi) {
                    maxi = c[j].length;
                }
            }
            Arrays.sort(c, (a, b) -> {
                if (a.length != b.length) {
                    return a.length - b.length;
                }
                for (int j = 0; j < b.length; j++) {
                    if (a[j] - b[j] != 0) {
                        return b[j] - a[j];
                    }
                }
                return 0;
            });
            int ans = 0;
            for (int j = 0; j < n; j += k) {
                int ci = 0;
                iw: while (true) {
                    for (int l = 1 + j; l < j + k; l++) {
                        if (ci>=c[l].length || ci>=c[l-1].length ||c[l][ci]!=c[l-1][ci]) {
                            ans+=ci;
                            break iw;
                        }
                    }
                    ci++;
                }
            }
            System.out.println("Case #" + i + ": "+ans);
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
