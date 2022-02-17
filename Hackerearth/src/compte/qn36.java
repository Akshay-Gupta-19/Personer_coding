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
public class qn36 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c[]=sc.next().toCharArray();
        int x=0,y=0;
        for (int i = 0; i < c.length; i++) {
            switch(c[i]){
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'L':
                    x--;
                    break;
                case 'R':
                    x++;
                    break;
            }
        }
        System.out.println(x+" "+y);
    }
   
}
