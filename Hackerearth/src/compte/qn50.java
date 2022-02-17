/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compte;

import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn50 {
    static int arr[];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        arr=new int[10000];
        for (int i = 0; i < t; i++) {
            System.out.println((5+solve(sc.nextInt()+1))%m);
        }
    }
    static int m=1000000007;
    static int solve(int n){
        if(arr[n]!=0)return arr[n];
        if(n==1) return 1;
        if(n==2) return 4;
        arr[n]=(2*((solve(n-1)+solve(n-2))%m))%m+6;
        return arr[n];
    }
}
