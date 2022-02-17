/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author akshay gupta
 */
class dis {

    String com, col;
    int size1;
    boolean type;//true for right false for left

    public dis(String com, int size, String col, boolean type) {
        this.com = com;
        this.col = col;
        this.size1 = size;
        this.type = type;
    }

    boolean cmp(dis c) {
        if (c.size1 != this.size1) {
            return false;
        }
        if (!c.col.equals(this.col)) {
            return false;
        }
        if (!c.com.equals(this.com)) {
            return false;
        }
        if (c.type == this.type) {
            return false;
        }
        return true;
    }
}

class q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        ArrayList<dis> al = new ArrayList<dis>();
        xy:
        for (int i = 0; i < n; i++) {
            dis c = new dis(sc.next(), sc.nextInt(), sc.next(), sc.next().charAt(0) == 'R');
            for (int j = 0; j < al.size(); j++) {
                if (al.get(j).cmp(c)) {
                    ans++;
                    al.remove(j);
                    continue xy;
                }
            }
            al.add(c);
        }
        System.out.println(ans);
    }
}
