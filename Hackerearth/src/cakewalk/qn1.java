/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cakewalk;

import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn1 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int t=sc.nextInt();
         for (int i = 0; i < t; i++) {
            long l=sc.nextLong();
            long r=sc.nextLong();
            long sum=0;
            long j;
             for (j = l; j < r; j+=2) {
                 sum=(sum+(j+1)*(j+1)-(j*j))%1000000007;
             }
             if(j==r)sum+=r*r;
             System.out.println(sum);
        }
    }
    
}
