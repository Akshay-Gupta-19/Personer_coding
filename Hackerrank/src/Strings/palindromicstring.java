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
public class palindromicstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s=sc.next();
            int j=0;
            for ( int k=s.length()-1; j < s.length()/2; j++,k--) {
                if(s.charAt(j)!=s.charAt(k)){
                    if(s.charAt(j+1)==s.charAt(k))
                        System.out.println(j);
                    else
                        System.out.println(k);
                    break;
                }
            }
            if(j==s.length()/2)System.out.println(-1);
        }
        
    }
    
}
