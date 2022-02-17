/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moodysanalytics;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        for (int i = 0; i < n; i++) {
         int a[]=new int[3];
         a[0]=sc.nextInt();
         a[1]=sc.nextInt();
         a[2]=sc.nextInt();
         Arrays.sort(a);
         if(a[0]+a[1]>ans)ans=a[0]+a[1];
        }
        System.out.println(ans);
    }
    
}
