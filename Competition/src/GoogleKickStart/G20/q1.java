package GoogleKickStart.G20;

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
            char c[] = sc.next().toCharArray();
            int kc = 0, ans=0;
            for (int j = 0; j < c.length; j++) {
                if (c[j] == 'K' && j + 3 < c.length) {
                    if (c[j + 1] == 'I') {
                        if (c[j + 2] == 'C') {
                            if (c[j + 3] == 'K') {
                                kc++;
                            }
                        }
                    }
                }
                if (c[j] == 'S' && j + 4 < c.length) {
                    if (c[j + 1] == 'T') {
                        if (c[j + 2] == 'A') {
                            if (c[j + 3] == 'R') {
                                if (c[j + 4] == 'T') {
                                     ans+=kc;
                                }
                            }
                        }
                    }
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
