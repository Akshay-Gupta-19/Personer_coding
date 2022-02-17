package GoogleKickStart.C21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

class SolutionC1 {

    public static void main(String[] args) {
        FastReaderC211 sc = new FastReaderC211();
        int t = sc.nextInt();
        int mod = 1000000007;
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt(), k = sc.nextInt();
            long ans = 1;
            char c[] = sc.next().toCharArray();
            for (int j = 0; j < c.length / 2; j++) {
                ans = (ans + ((Math.min(c[j], c[c.length - j - 1]) - 'a') * (Math.max((c.length / 2 - 1 - j) * k, 1)) % mod) % mod) % mod;
            }
            if (c.length % 2 == 1) {
                ans = (ans * k) % mod;
            }
            System.out.println("Case #" + i + ": " + (int) ans);
        }
    }
}

class FastReaderC211 {

    BufferedReader br;
    StringTokenizer st;

    public FastReaderC211() {
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
