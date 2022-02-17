/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package December17Easy;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class SupremSubset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
           arr[i]=sc.nextInt(); 
        }
        Arrays.sort(arr);
        int dyAns[][]=new int[n][2];
        int ansi=0;
        for (int i = 0; i < arr.length; i++) {
            dyAns[i][0]=1;
            dyAns[i][1]=-1;
            for (int j = i-1; j >=0 ; j--) {
                if((arr[i]-arr[j])%m==0 && (arr[i]-arr[j])!=0 && dyAns[j][0]+1>dyAns[i][0]){
                dyAns[i][0]=dyAns[j][0]+1;
                dyAns[i][1]=j;
                }
                if(dyAns[i][0]>dyAns[ansi][0])ansi=i;
            }
 
        }
        System.out.println(dyAns[ansi][0]);
        int ansArray[]=new int[n];
        int k=0;
        for (int i = ansi; i>=0; i=dyAns[i][1])
            ansArray[k++]=arr[i];
        for (int i = k-1; i >=0; i--) {
            System.out.println(ansArray[i]);
        }
    }
}
