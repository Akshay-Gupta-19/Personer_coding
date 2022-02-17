/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import java.util.Scanner;

public class snakesandladder {

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int graph[][] = new int[100][100];
            for (int j = 0; j < graph.length; j++) {
                Arrays.fill(graph[j], 10000);
            }
            for (int j = 0; j < graph.length; j++) {
                for (int k = 0; k < 6; k++) {
                    try {
                        graph[j][j + k + 1] = 1;
                    } catch (Exception ex) {
                    }
                }
            }
            int n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                int src = sc.nextInt() - 1, des = sc.nextInt() - 1;
                graph[src][des] = 0;
                for (int k = 0; k < 6; k++) {
                    try {
                        graph[src][src + 1 + k] = 10000;
                    } catch (Exception ex) {
                    }
                }
            }
            int m = sc.nextInt();
            for (int j = 0; j < m; j++) {
                int src = sc.nextInt() - 1, des = sc.nextInt() - 1;
                graph[src][des] = 0;
                for (int k = 0; k < 6; k++) {
                    try {
                        graph[src][src + 1 + k] = 10000;
                    } catch (Exception ex) {
                    }
                }
            }

            int ans = dij(graph);
            if (ans >= 10000) {
                System.out.println(-1);
            } else {
                System.out.println(ans);
            }
        }
    }

    static int dij(int x[][]) {
        int way = 0;
        boolean visited[] = new boolean[x.length];
        int maxindex = 0;//setting initial intermidiate node as 1
        visited[0] = true;
        for (int i = 0; i < x.length; i++) {
            int k;
            for (k = 0; k < x[i].length; k++) {
                if (visited[k]) {
                    continue;
                }
                int minway=Integer.MAX_VALUE;
                if (x[0][k] < minway) {
                    way = k;
                    break;
                }
            }
            for (; k < x[i].length; k++) {
                if (visited[k]) {
                    continue;
                }
                if (x[0][k] < x[0][way]) {
                    way = k;
                }
            }
            visited[way] = true;
            for (int j = 0; j < x.length; j++) {
                if (x[0][j] > x[0][way] + x[way][j]) {
                    x[0][j] = x[0][way] + x[way][j];
                }
            }
        }
        return x[0][99];
    }
}
