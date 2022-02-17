package RemeberingTHings;


public class Dej3 {
    //recive adj matrix and src return src to all dis smallest
    static int[] shortestReach(int[][] ans, int s) {
        int n = ans.length;
        
        boolean visited[] = new boolean[n];
        visited[s] = true;
        for (int k = 0; k < n; k++) {
            int nn = s;
            for (int i = 0; i < n; i++) {
                if ((nn == s || ans[s][nn] > ans[s][i]) && !visited[i]) {
                    nn = i;
                }
            }
            visited[nn] = true;
            for (int i = 0; i < n; i++) {
                if (ans[s][i] > ans[s][nn] + ans[nn][i]) {
                    ans[s][i] = ans[s][nn] + ans[nn][i];
                }
            }
        }
        return ans[s];
    }
}
