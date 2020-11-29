package KickStartD20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

class Solution3 {

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt(), q = sc.nextInt();
            int arr[] = new int[n - 1];
            HashMap<Integer, Integer> hm = new HashMap<>();
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
                hm.put(arr[j], j);
            }
            String qa="";
            HashMap<Integer,ArrayList<Integer>> hm2=new HashMap<>();
            for (int j = 0; j < q; j++) {
                int sr = sc.nextInt() - 1, k = sc.nextInt() - 1;
                if(hm2.containsKey(sr)){
                    qa+=hm2.get(sr).get(k)+" ";continue;
                }
                PriorityQueue<Integer> pq = new PriorityQueue<>();
                ArrayList<Integer> al = new ArrayList<Integer>();
                    al.add(sr + 1);
                try {
                    pq.add(arr[sr - 1]);
                } catch (ArrayIndexOutOfBoundsException ex) {
                }
                try {
                    pq.add(arr[sr]);
                } catch (ArrayIndexOutOfBoundsException ex) {
                }
                while (!pq.isEmpty()) {
                    int nr = pq.poll();
                    int ni = hm.get(nr);
                    if (ni < sr) {
                        al.add(ni+1);
                        try{pq.add(arr[ni -1]);}
                        catch(ArrayIndexOutOfBoundsException ex){}
                    } else {
                        al.add(ni + 2);
                        
                        try{pq.add(arr[ni+1]);}
                        catch(ArrayIndexOutOfBoundsException ex){}
                    }
                }
                hm2.put(sr, al);
                qa+=al.get(k)+" ";
            }
            qa=qa.substring(0,qa.length()-1);
            System.out.println("Case #" + i + ": "+qa);
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
