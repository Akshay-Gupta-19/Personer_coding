/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicProgramingIntermidiate;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int m=sc.nextInt();
            int n=sc.nextInt();
            int x=sc.nextInt();
            long dy[][]=new long[n+1][x+1];
            for (int j = 0; j < dy.length; j++) {
               Arrays.fill(dy[j],-1); 
            }
            System.out.println(sol(m,n,x,dy));
        }
    }
    static long sol(int m,int n,int x,long dy[][]){
        long ans=0;
        if(n==0){
           if(x==0)
               return dy[n][x]=1;
              return dy[n][x]=0;
        }
        if(dy[n][x]!=-1)return dy[n][x];
        for (int i = 1; i <= m; i++) {
            if(x-i>=0)
            ans+=sol(m,n-1,x-i,dy);
        }
        return dy[n][x]=ans;
    }
}
