/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching;

import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class countluck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
           int n=sc.nextInt(),m=sc.nextInt();
           char c[][]=new char[n][m];
           int slr=0,slc=0;
            for (int j = 0; j < c.length; j++) {
                String as=sc.next();
                c[j]=as.toCharArray();
                if(as.contains("M")){slc=as.indexOf("M");slr=j;}
            }
            int k=sc.nextInt();
            if(k==sol(c,slr,slc))
                System.out.println("Impressed");
            else
                System.out.println("Oops!");
        }
    }
    static int sol(char a[][],int slr,int slc){
       if(a[slr][slc]=='*')return 0;
    //   if((slr==))
      //  int s1=0,s2=0,s3=0,s4=0;
        boolean here;
        if(slr!=0 && a[slr-1][slc]!='.'){
            
        }
            
    return 0;
    }
}
