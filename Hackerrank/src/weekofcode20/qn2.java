/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int g1 = 0, g2 = 0;
        boolean ndc = false, ndrk2 = false;
        if(k % 2 == 0) {
            for(int i = 0; i < n; i++) {
                int no = sc.nextInt();
                if (no % k == 0 && !ndc) {
                    g1++;
                    g2++;
                    ndc = true;
                } else if (no % k < k / 2) {
                    g1++;
                } else if (no % k > k / 2) {
                    g2++;
                } else if (!ndrk2 && (no % k) == k / 2) {
                    g1++;
                    g2++;
                    ndrk2 = true;
                }

            }
        } else {
            for (int i = 0; i < n; i++) {
                int no = sc.nextInt();
                if ( no % k == 0 &&!ndc) {
                    g1++;
                    g2++;
                    ndc = true;
                }
                if (no % k <= k / 2) {
                    g1++;
                } else {
                    g2++;
                }
            }
        }
        System.out.println(Math.max(g1, g2));
    }
}
