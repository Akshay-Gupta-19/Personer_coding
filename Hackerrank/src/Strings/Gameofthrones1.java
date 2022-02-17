/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.Scanner;

/**
 *
 * @author Injustice
 */
public class Gameofthrones1 {
    public static void main(String[] args) {
        String s=new Scanner(System.in).next();
        int noc[]=new int[27];
        int slen=s.length();
        for (int i = 0; i < slen; i++) {
            noc[s.charAt(i)-'a']++;
        }
        int i;
        for (i = 0; i < noc.length && noc[i]%2==0; i++);
        for (i++; i < noc.length && noc[i]%2==0; i++);
           if(i==noc.length)System.out.println("YES");
           else System.out.println("NO");
    }
    
}
