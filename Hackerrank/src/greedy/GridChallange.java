/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greedy;

import java.util.Scanner;

/**
 *
 * @author Avengers
 */
public class GridChallange {

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        x:
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            for (int j = 0; j < n; j++) {
            String a=sc.next();
            for (int k = 1; k < a.length(); k++) {
               if(a.charAt(k-1)>a.charAt(k)){System.out.println("NO");continue x;} 
            }
            }
            System.out.println("YES");
        }
    }

}
