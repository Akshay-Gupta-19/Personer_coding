package Graph;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class kthanseter {
    static HashMap<Integer, Integer> graph;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int p = sc.nextInt();
            graph = new HashMap<>();
            for (int j = 0; j < p; j++) {
                int x = sc.nextInt(), y = sc.nextInt();
                graph.put(x, y);
            }
            int q = sc.nextInt();
            for (int j = 0; j < q; j++) {
                int qn = sc.nextInt();
                switch (qn) {
                    case 0:
                        int np=sc.nextInt(),c=sc.nextInt();
                        graph.put(c, np);
                        break;
                    case 1:
                       int ctd=sc.nextInt();
                       graph.remove(ctd);
                        break;
                    case 2:
                        int x=sc.nextInt(),k=sc.nextInt();
                        System.out.println(solve(x, k));
                        break;
                }
            }
        }
    }
static int solve(int x,int k){
    if(x==0)return 0;
    if(!graph.containsKey(x))return 0;
    if(k==0)return x;
    return solve(graph.get(x),k-1);
}
}
