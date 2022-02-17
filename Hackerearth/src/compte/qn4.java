/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compte;

import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            long l=sc.nextLong();
            long r=sc.nextLong();
            long ans=0;
            if(Math.sqrt(l)==(int)Math.sqrt(l))ans++;
            if(Math.sqrt(r)==(int)Math.sqrt(r))ans++;
            System.out.println((int)Math.sqrt(r)-(int)Math.sqrt(l)+ans);
        }
    }

}
