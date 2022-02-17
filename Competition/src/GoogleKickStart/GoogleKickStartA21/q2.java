package GoogleKickStart.GoogleKickStartA21;

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
            int r = sc.nextInt(), c = sc.nextInt();
            int mat[][] = new int[r][c];
            for (int j = 0; j < mat.length; j++) {
                for (int k = 0; k < mat[j].length; k++) {
                    mat[j][k] = sc.nextInt();
                }
            }
            int ans = 0;
            boolean vis[][]=new boolean[r][c];
            for (int j = 0; j < mat.length; j++) {
                for (int k = 0; k < mat[j].length; k++) {
                    if (mat[j][k] == 1 ) {
                        ans += checkDown(mat, j,k,vis);
                    }
                }

            }
            System.out.println("Case #" + i + ": " + ans);
        }
    }

    static int checkDown(int mat[][], int i, int j,boolean vis[][]) {

        int height = 0;
        int oi = i;
        ArrayList<Integer> al=new ArrayList<>();
        while (i < mat.length && mat[i][j] == 1) {
            vis[i][j]=true;
            int nj=j,wc=0;
            while(nj>=0 && mat[i][nj]==1){
                nj--;
                wc++;
            }
            al.add(wc);
            wc=0;
            nj=j;
            while(nj<mat[0].length && mat[i][nj]==1){
                nj++;
                wc++;
            }
            al.add(wc);
            i++;
            height++;
        }
        i--;
        
        return get(height, al);
    }

    static int get(int hei, ArrayList<Integer> al) {
        int ans = 0;
        for (int i = 0; i < al.size(); i++) {
            ans+=Math.min(hei,al.get(i)/2==0?1:al.get(i)/2)-1+Math.min(hei/2==0?1:hei/2,al.get(i))-1;
        }
        return ans;
    }
}


/*
2
4 3
1 0 0
1 0 1
1 0 0
1 1 0
6 4
1 0 0 0
1 0 0 1
1 1 1 1
1 0 1 0
1 0 1 0
1 1 1 0

*/
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
