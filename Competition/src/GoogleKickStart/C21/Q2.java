package GoogleKickStart.C21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

class SolutionC2 {

    public static void main(String[] args) {
        FastReaderC212 sc = new FastReaderC212();
        int t = sc.nextInt();
        int mod = 1000000007;
        new int[43];
        for (int i = 1; i <= t; i++) {
            long g = sc.nextLong();
            int ans = 0;
            int y = 0;
            for (int j = 0; j <= g; j += (++y)) {
                for (long k = 1; k <= g; k++) {
                    if ((k) * (y + 1) + j == g) {
                        ans++;
                    }
                }
            }
            System.out.println("Case #" + i + ": " + (int) ans);
        }
    }
}

class FastReaderC212 {

    BufferedReader br;
    StringTokenizer st;

    public FastReaderC212() {
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
