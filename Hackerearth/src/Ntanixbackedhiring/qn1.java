/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ntanixbackedhiring;

import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long ans=0;
        int jp=sc.nextInt();
        for (int i = 1; i < args.length; i++) {
            int ci=sc.nextInt();
            ans+=Math.max(0,jp-ci+1);
            jp=Math.max(ci+1,jp);
        }
        System.out.println(ans);
    }
   
}
