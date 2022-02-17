/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compte;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn45 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
           int k=sc.nextInt(),n=sc.nextInt();
            BigInteger bi=new BigInteger(k+"");
            bi=bi.pow(n+1);
            bi=bi.subtract(BigInteger.ONE);
            bi=bi.divide(new BigInteger((k-1)+""));
            char c[]=bi.toString().toCharArray();
           int ans=0;
            for (int j = 0; j < c.length; j++) {
               ans+=(c[j]-'0'); 
            }
            System.out.println(ans);
        }
    }
}
