/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class gameofthrones {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        boolean b[]=new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            b[s.charAt(i)-'a']=!b[s.charAt(i)-'a'];
        }
        int i;
        for (i = 0; i < b.length; i++) {
            if(b[i])
                break;
        }
        for(i++;i<b.length;i++){
            if(b[i])
            {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
