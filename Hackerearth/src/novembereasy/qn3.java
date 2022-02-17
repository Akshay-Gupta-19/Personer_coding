/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novembereasy;

import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        long pro=1;
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
            pro*=a[i];
        }
        long min=1000000000000l;
        int mini=0;
        for (int i = 0; i < a.length; i++) {
           if(pro/a[i]<min){
               min=pro/a[i];
               mini=i;
           } 
        }
        System.out.println(a[mini]);
    }
}
