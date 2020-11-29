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

class Solution3_1 {

    public static void main(String[] args) {
        FastReader5 sc = new FastReader5();
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int cs[] = new int[n + 1];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }
            for (int j = 1; j < cs.length; j++) {
                cs[j] = cs[j - 1] + arr[j - 1];
            }
            ArrayList<Integer> sqrs = new ArrayList<>();
            for (int j = 0; j * j <= 10000003; j++) {
                sqrs.add(j * j);
            }
            int ans = 0;
            for (int j = 0; j < sqrs.size(); j++) {
                Integer currentSqure = sqrs.get(j);
                HashMap<Integer, Integer> hm = new HashMap<>();
                for (int k = 0; k < cs.length; k++) {
                    ans += (hm.getOrDefault(cs[k] - currentSqure, 0));
                    hm.putIfAbsent(cs[k], 0);
                    hm.put(cs[k], hm.get(cs[k]) + 1);
                }
            }
            System.out.println("Case #" + i + ": " + ans);
        }
    }
}

class FastReader5 {

    BufferedReader br;
    StringTokenizer st;

    public FastReader5() {
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
