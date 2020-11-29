package KickStartE20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        test:
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            LinkedList<Integer> ll = new LinkedList<>();
            for (int j = 0; j < c; j++) {
                ll.add(n);
            }
            for (int j = 0; j < a-c; j++) {
                ll.addFirst(n - 1 - j);
                if (n - 1 - j < 0) {
                    System.out.println("Case #" + i + ": IMPOSSIBLE");
                    continue test;
                }
            }
            for (int j = 0; j < b-c; j++) {
                ll.add(n - 1 - j);
                if (n - 1 - j < 0 || ll.size()>n) {
                    System.out.println("Case #" + i + ": IMPOSSIBLE");
                    continue test;
                }
            }
            int indOfN=ll.indexOf(n), lind=ll.lastIndexOf(n);
            while(ll.size()<n){
                if(indOfN>1 && ll.get(indOfN-1)>1)
                    ll.add(indOfN, 1);
                else if(ll.size()>lind+1 && lind>=0 && ll.get(lind+1)>1)
                    ll.add(lind+1,1);
                else{
                    System.out.println("Case #" + i + ": IMPOSSIBLE");
                    continue test;
                }
            }
            String ans=ll.toString();
            System.out.println("Case #" + i + ": "+ans.substring(1,ans.length()-1).replaceAll(",", ""));
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
