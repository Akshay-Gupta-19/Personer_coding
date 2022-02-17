import java.util.Scanner;
import java.util.Stack;
public class lazywhiltefalcon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), q = sc.nextInt();
        int weight[] = new int[n];
        int edges[][] = new int[n - 1][2];
        for (int i = 0; i < n - 1; i++) {
            edges[i][0] = sc.nextInt();
            edges[i][1] = sc.nextInt();
        }
        for (int i = 0; i < q; i++) {
            int qt = sc.nextInt();
            switch (qt) {
                case 1:
                    weight[sc.nextInt()] = sc.nextInt();
                    break;
                case 2:
                    int u = sc.nextInt(),
                     v = sc.nextInt();
                    System.out.println(getweight(weight, edges, u, v));
            }
        }
    }

    static int getweight(int weight[], int edges[][], int u, int v) {
        Stack<Integer> stn = new Stack();//stack of nodes
        Stack<Integer> stv = new Stack();//stack of weights
        boolean visited[] = new boolean[weight.length];
        visited[u] = true;
        stn.push(u);
        stv.push(weight[u]);
        int ans = weight[u];
        while (!stn.isEmpty()) {
            int cn = stn.pop();
            int cnw = stv.pop();
            for (int i = 0; i < edges.length; i++) {
                if (edges[i][0] == cn && !visited[edges[i][1]]) {
                    if (edges[i][1] == v) {
                        return cnw + weight[edges[i][1]];
                    }
                    stn.push(edges[i][1]);
                    stv.push(cnw + weight[edges[i][1]]);
                    visited[edges[i][1]] = true;
                }
                if (edges[i][1] == cn && !visited[edges[i][0]]) {
                    if (edges[i][1] == v) {
                        return cnw + weight[edges[i][1]];
                    }
                    stn.push(edges[i][0]);
                    stv.push(cnw + weight[edges[i][0]]);
                    visited[edges[i][0]] = true;
                }
            }
        }
        return 0;
    }
}
