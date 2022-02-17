/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saplabsclosed;

import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i <t; i++) {
            int n=sc.nextInt();
            long ans=0;
            long arr[]=new long[n];
            for (int j = 0; j < arr.length; j++) {
                arr[j]=sc.nextInt();
            }
            for (int j = 0; j < arr.length; j++) {
               long ca=0,ans2=1;
               while( ++j < arr.length && arr[j]==arr[j-1]){
                   ans2++;
               }
               ans+=(ans2*(ans2+1))/2;
               j--;
            }
            System.out.println(ans);
        }
    }
    
}
