package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Matrix2 {

    static HashMap<Integer, ArrayList> g;
    static HashMap<Integer, ArrayList> t;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        g = new HashMap<>();
        t = new HashMap<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            g.put(i, new ArrayList());
            t.put(i, new ArrayList());
            g.get(i).add(false);
            t.get(i).add(false);
        }
        int k = sc.nextInt();
        for (int i = 0; i < n - 1; i++) {
            int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
            g.get(x).add(y);
            t.get(x).add(z);
            g.get(y).add(x);
            t.get(y).add(z);
        }
        for (int i = 0; i < k; i++) {
            int mc = sc.nextInt();//machine city
            g.get(mc).remove(0);
            t.get(mc).remove(0);
            g.get(mc).add(0, true);
            t.get(mc).add(0, true);
        }
        System.out.println(sol(0, -1, false, 0));
    }

    static int sol(int c, int par, boolean ma, int pet) {//parent edge time to destroy
        int ans = 0;
        boolean mm = (boolean) g.get(c).get(0);//my machine
        int sol1 = 0, sol2 = 0;
        if (mm) {
            for (int i = 1; i < g.get(c).size(); i++) {
                if ((int) g.get(c).get(i) != par) {
                    sol1 += sol((int) g.get(c).get(i), c, true, (int) t.get(c).get(i));
                }
            }
            if (ma) {
                ans += pet;
                ans += sol1;
            } else {
                ans += sol1;
            }
        } else if (ma) {
            for (int i = 1; i < g.get(c).size(); i++) {
                if ((int) g.get(c).get(i) != par) {
                    sol1 += sol((int) g.get(c).get(i), c, true, (int) t.get(c).get(i));
                }
                if ((int) g.get(c).get(i) != par) {
                    sol2 += sol((int) g.get(c).get(i), c, false, (int) t.get(c).get(i));
                }
            }
            ans += Math.min(pet + sol2, sol1);
        }
        return ans;
    }
}
