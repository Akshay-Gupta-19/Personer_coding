/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldcodesprint6;

import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn3 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt(),k=sc.nextInt();
         int sum=0;
         //int tor;
         for (int i = 0; i < n; i++) {
            if(i==k)sc.nextInt();
            else
            sum+=sc.nextInt();
        }
         System.out.println(sc.nextInt()-sum/2);
    }
   
}
