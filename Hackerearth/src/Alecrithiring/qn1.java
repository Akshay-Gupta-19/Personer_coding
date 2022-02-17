package Alecrithiring;

import java.util.Scanner;

public class qn1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int j = 0; j < t; j++)
        {int n=sc.nextInt();
        int arr[]=new int[n];
        int dy[][]=new int[n+1][n+1];
           for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(solve(arr,0,arr.length-1,dy));
    }
    }
    static int solve(int arr[],int i,int j,int dy[][]){
        if(i>=arr.length || j<0 || j<=i)return 0;
        if(dy[i][j]!=0)return dy[i][j];
        if(arr[i]>=arr[j])dy[i][j]=j-i+1;
        else dy[i][j]= Math.max(solve(arr,i+1,j,dy),solve(arr,i,j-1,dy));
        return dy[i][j];
    }
}
