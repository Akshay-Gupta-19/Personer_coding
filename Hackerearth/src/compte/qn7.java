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
public class qn7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for (int j = 0; j < n; j++) {
                arr[j]=sc.nextInt();
            }
            int a1=0,a2=0;
            for (int j = 0; j < arr.length; j++) {
                for (int k = j; k < arr.length; k++) {
                    int xo=0,an=0;
                    for (int l = j; l <=k; l++) {
                        xo=xo^arr[l];
                        an=an&arr[l];
                    }
                    if((xo|an)>a1){a1=xo|an;a2=k-j;}
                    
                }
 
            }
            System.out.println(a1+" "+a2);
        }
    }
    
}
