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
public class qn27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            char s[]=sc.next().toCharArray();
            for (int j = 0; j < s.length; j++) {
                System.out.print(s[j]);
               while(j+1<s.length && s[j+1]==s[j])j++; 
            }
            System.out.println("");
        }
    }
}
