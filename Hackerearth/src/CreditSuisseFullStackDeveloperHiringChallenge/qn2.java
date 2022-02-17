/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreditSuisseFullStackDeveloperHiringChallenge;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int m=1000000007;
        HashMap<Integer,String> hm=new HashMap<>();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            if(hm.containsKey(n)){System.out.println(hm.get(n));continue;}
            long ans=-2;
            ans+=pow(2,n,m);
            if(ans==-1)ans=1000000006;
            hm.put(n,ans+"");
            System.out.println(ans);
        }
    }
    static long pow(long x,int y,int m){
    long res = 1;     
    x = x % m;
    while (y > 0)
    {
        if ((y & 1)!=0)
            res = (res*x) % m;
        y = y>>1; // y = y/2
        x = (x*x) % m;  
    }
    return res;
    }
}

