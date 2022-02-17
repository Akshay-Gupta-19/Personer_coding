/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nitsurat;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong(),k=sc.nextLong();
        int m=sc.nextInt();
        int ans=0;
        for (long i = 0; i <n; i++) {
            ans+= ((ans*2)%m+(int)Math.pow(n%m, k))%m;
        }
        System.out.println(ans);
    }
}
