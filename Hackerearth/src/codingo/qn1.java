/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingo;

import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
            if(a==b+c||b==a+c||c==a+b){
                System.out.println("Possible");
                
                
            }
            else
                System.out.println("Not Possible");
        }
    }
}
