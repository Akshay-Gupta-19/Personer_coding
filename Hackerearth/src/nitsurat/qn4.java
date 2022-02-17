/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nitsurat;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        HashMap<Long,Long> helper=new HashMap<>();
        for (int i = 0; i < t; i++) {
            long n=sc.nextLong();
            long ans=0;
            if(helper.containsKey(n)){System.out.println(helper.get(n));continue;}
            for (long j = Math.max(0,n-400); j <= n; j++) {
                if(j+solve(j)==n)ans++;
            }
            helper.put(n,ans);
            System.out.println(ans);
        }
    }
    static long solve(long n){
    int ca=0;
        while(n!=0){
            ca+=(n%10);
            n/=10;
        }
        if(ca>9) return ca+solve(ca);
       else return ca;
        
    }
}
