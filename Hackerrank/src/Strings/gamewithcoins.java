/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.Scanner;

/**
 *
 * @author akshay gupta
 */
public class gamewithcoins {
    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            boolean ans;
            if(a==0||b==0)System.out.println("First");
            else if((a+b)%2==1)
                System.out.println("First");
            else
                System.out.println("Second");
        }
    }
}
