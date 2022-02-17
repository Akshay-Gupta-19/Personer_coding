/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moodysanalytics;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author avnegers
 */
public class qn3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String b=sc.next();
        b=b.replaceAll("**", "p");
        String exp[]=b.split("*");
        long ans=1;
        int m=1000000007;
        try{
        for (int i = 0; i < exp.length; i++) {
           String nfp[]=exp[i].split("p");
           long no=Long.parseLong(nfp[0]);
           for (int j = 1; j < nfp.length; j++) {
              no=pow(no,Long.parseLong(nfp[j]),m);
            }
           ans=(ans*no)%m;
        }
        System.out.println(ans);
        }
        catch(Exception ex){
            System.out.println("Syntax Error");
        }
    }
    static long pow(long a,long p,int m){
        if(p==1)return a;
        int reasult=1;
        while(p!=0){
            if((p&1)!=0)
                reasult*=a;
            reasult%=m;
            p>>=1;
            a*=a;
            a%=m;
        }
        return reasult;
    }
}
