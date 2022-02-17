/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compte;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt(),p=sc.nextInt(),k=sc.nextInt();
            int j,l,m=1;
            int arr[]=new int[n];
            arr[0]=1;
            for (j = (1+p)%n; j != 1; j=(j+p)%n){
                if(j==0){arr[m++]=n;continue;}
                arr[m++]=j;
                
            }
            Arrays.sort(arr,0,m);
            if(arr[k-1]==0||k>arr.length)System.out.println(-1);
            else System.out.println(arr[k-1]);
        }
    }
}
