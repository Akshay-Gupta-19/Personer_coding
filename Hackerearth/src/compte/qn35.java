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
public class qn35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c[][]=new char[2005][];
        int x=0;
        while(sc.hasNext()){
            c[x++]=sc.nextLine().toCharArray();
        }
        for (int i = 0; i < x; i++) {
            int j;
            for (j = 0; j < c[i].length; j++) {
              if(c[i][j]=='-' && j+1<c[i].length && c[i][j+1]=='>')
              { System.out.print(".");j++;}
             else if(c[i][j]=='/' && j+1<c[i].length && c[i][j+1]=='/')
                    break;
              else 
                    System.out.print(c[i][j]);
            }
            for (; j < c[i].length; j++) {
                System.out.print(c[i][j]);
            }
            System.out.println();
        }
    }
}
