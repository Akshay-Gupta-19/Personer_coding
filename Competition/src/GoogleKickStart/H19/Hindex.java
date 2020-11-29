/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoogleKickStart.H19;

import java.util.Scanner;

/**
 *
 * @author akggupta
 */
 class Solution{
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 1; i <=t; i++) {
            System.out.print("Case #"+i+": ");
            int n=sc.nextInt();
            int minTN=0;
            for (int j = 0; j < n; j++) {
                int x=sc.nextInt();
                System.out.print(" "+Math.max(j+1,minTN));
                minTN=Math.min(x, minTN);
            }
            System.out.println("");
        }
    }
}
