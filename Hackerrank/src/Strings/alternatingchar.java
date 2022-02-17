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
public class alternatingchar {
    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int ans=0;
            String s=sc.next();
            for (int j = 0; j < s.length(); j++) {
                for (int k = j+1; k < s.length(); k++) {
                    if(s.charAt(j)==s.charAt(k)){ans++;j=k;}
                    else break;
                }
            }
            System.out.println(ans);
        }
    }
}
