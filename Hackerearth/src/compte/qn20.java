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
public class qn20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        test:for (int i = 0; i < t; i++) {
            boolean b1[]=new boolean[26];
            boolean b2[]=new boolean[26];
            char c1[]=sc.next().toCharArray();
            char c2[]=sc.next().toCharArray();
            for (int j = 0; j < c1.length; j++) {
               b1[c1[j]-'a']=true;
            }for (int j = 0; j < c2.length; j++) {
               b2[c2[j]-'a']=true;
            }
            for (int j = 0; j < b1.length; j++) {
                if(b1[j]&&b2[j]){
                    System.out.println("Yes");continue test;
                }
            }
            System.out.println("No");
        }
    }
}
