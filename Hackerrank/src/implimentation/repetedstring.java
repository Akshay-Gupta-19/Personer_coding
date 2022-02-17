/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implimentation;

import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class repetedstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        long n=sc.nextLong();
        long ans=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='a')ans++;
        }
        ans*=(n/s.length());
        s=s.substring(0,(int)(n%s.length()));
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='a')ans++;
        }
        System.out.println(ans);
    }
}
