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
public class qn44 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        test: for (int i = 0; i <t; i++) {
            long a=sc.nextLong(),b=sc.nextLong(),m=sc.nextLong();
          if(a%m==0)System.out.println(b/m-a/m+1);
          else   System.out.println(b/m-a/m);
        }
    }
}
