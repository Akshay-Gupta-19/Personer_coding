/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UbonaDeveloper;
import java.util.*;
/**
 *
 * @author avnegers
 */
public class Qn2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt(),n=sc.nextInt();
        int arr[]=new int[m];
        for (int i = 0; i < arr.length; i++) 
            arr[i]=sc.nextInt();
        long dy[][]=new long[m+1][n+1];
        System.out.println(solve(arr,0,n,dy));
    }
    static long solve(int arr[],int i,int n,long dy[][]){
        if(n==0)return 1;
        if(n<0)return 0;
        if(i>=arr.length)return 0;
        if(dy[i][n]!=0)return dy[i][n];
        dy[i][n]=(solve(arr,i+1,n,dy)+solve(arr,i,n-arr[i],dy))%1000000007;
        return dy[i][n];
    }
}
