/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clgchal1;

import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=sc.nextInt();
        }
        if(sum/n>7.5)
            System.out.println("READY");
        else
            System.out.println("NOT READY");
    }
}
