package KickStartD20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

class Solution2 {

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int k = sc.nextInt();
            int arr[] = new int[k];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }
            int dp[][] = new int[k][5];
            for (int j = 0; j < dp.length; j++) {
                Arrays.fill(dp[j], -1);
            }
            int a1 = Math.min(sol(arr, 1, 0, dp), sol(arr, 1, 1, dp));
            int a2 = Math.min(sol(arr, 1, 2, dp), sol(arr, 1, 3, dp));
            System.out.println("Case #" + i + ": " + Math.min(a1, a2));
        }
    }

    static int sol(int arr[], int ci, int cc, int dp[][]) {
        if (cc > 3 || cc < 0) {
            return 1000000;
        }
        if (ci == arr.length) {
            return 0;
        }
        if (dp[ci][cc] != -1) {
            return dp[ci][cc];
        }
        int ans = 0;
        if (arr[ci] > arr[ci - 1]) {
            int a1, a2;
            if (cc == 3) {
                ans++;
                a1 = Math.min(sol(arr, ci + 1, 0, dp), sol(arr, ci + 1, 1, dp));
                a2 = Math.min(sol(arr, ci + 1, 2, dp), sol(arr, ci + 1, 3, dp));
            } else {
                a1 = Math.min(sol(arr, ci + 1, cc + 1, dp), sol(arr, ci + 1, cc + 2, dp));
                a2 = Math.min(sol(arr, ci + 1, cc + 3, dp), sol(arr, ci + 1, cc + 4, dp));
            }
            ans += Math.min(a1, a2);
        }
        if (arr[ci] < arr[ci - 1]) {
            int a1, a2;
            if (cc == 0) {
                ans++;
                a1 = Math.min(sol(arr, ci + 1, 0, dp), sol(arr, ci + 1, 1, dp));
                a2 = Math.min(sol(arr, ci + 1, 2, dp), sol(arr, ci + 1, 3, dp));
            } else {
                a1 = Math.min(sol(arr, ci + 1, cc - 1, dp), sol(arr, ci + 1, cc - 2, dp));
                a2 = Math.min(sol(arr, ci + 1, cc - 3, dp), sol(arr, ci + 1, cc - 4, dp));
            }
            ans += Math.min(a1, a2);
        }
        if (arr[ci] == arr[ci - 1]) {
            ans = sol(arr, ci + 1, cc, dp);
        }
        return dp[ci][cc] = ans;
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
