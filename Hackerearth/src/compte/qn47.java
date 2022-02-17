/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compte;

import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn47 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        test:for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            long arr[]=new long[n];
            long sum=0;
            int li=0;
            for (int j = 0; j < arr.length; j++) {
               int x=sc.nextInt();
               arr[j]=x;
               sum+=x;if(x!=0){li=j;}
            }
            long m=sc.nextLong();
            if(m==0){System.out.println(0);continue test;}
            
            m=m%sum;
            int j;
            for (j = 0; j < arr.length && m>0; j++) {
                m-=arr[j];
            }
            if(j==0){System.out.println(li);continue test;}
            System.out.println(j);
        }
    }
}
