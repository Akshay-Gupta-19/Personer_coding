/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dynamic;

import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class mrx2 {
    static boolean gr[][];
    static boolean xpo[][];
    static boolean ypo[][];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt(),n=sc.nextInt();
        gr=new boolean[m][n];
        for (int i = 0; i < gr.length; i++) {
            String cl=sc.next();
            for (int j = 0; j < gr[i].length; j++) {
               if(cl.charAt(j)=='x')
                   gr[i][j]=true;
               else
                   gr[i][j]=false;
            }
        }
        
    }
}
