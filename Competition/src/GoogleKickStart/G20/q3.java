package GoogleKickStart.G20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

class Solution3 {

    public static void main(String[] args) {
        FastReader3 sc = new FastReader3();
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int w = sc.nextInt();long n = sc.nextInt();
            int arr[] = new int[w];
            long cs[] = new long[w];
            for (int j = 0; j < w; j++) {
                arr[j] = sc.nextInt();
             }

            Arrays.sort(arr);
            for (int j = 0; j < cs.length; j++) {
            long dummy = j != 0 ? (cs[j] = cs[j - 1] + arr[j]) : (cs[j] = arr[j]);
             
            }
            int p = 0, b = 0;
            long ans = Long.MAX_VALUE;
            for (int j = 0; j < arr.length; j++) {
                while (arr[j] - arr[p] > n - (arr[j] - arr[p])) {
                    p++;
                }
                while (b<w && arr[b] - arr[j] < n - (arr[b] - arr[p])) {
                    b++;
                }
                ans = Math.min(ans, (j - p + 1) * arr[j] - getSum(cs, p, j)+(p)*(n+arr[j])-getSum(cs, 0,p-1)+(b-j)*arr[b-1]-getSum(cs, j, b-1)+(w-b)*(n+arr[j])-getSum(cs,b ,w-1));
            }
            System.out.println("Case #" + i + ": " + ans);
        }
    }

    static long getSum(long arr[], int i, int j) {
        if(j<0)return 0;
        return i > 0 ? arr[j] - arr[i - 1] : arr[j];
    }
}

class FastReader3 {

    BufferedReader br;
    StringTokenizer st;

    public FastReader3() {
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
