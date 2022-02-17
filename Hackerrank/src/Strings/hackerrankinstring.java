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
public class hackerrankinstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int q=sc.nextInt();
       X: for (int i = 0; i < q; i++) {
            String s=sc.next();
            int cc=0;
            char hack[]="hackerrank".toCharArray();
            for (int j = 0; j < hack.length; j++) {
                int findex=s.indexOf(hack[j],cc);//index where char of hackerrank is found
                if(findex!=-1)cc=findex+1;
                else{ System.out.println("NO");continue X;}    
            }
            System.out.println("YES");
        }
    }
}
