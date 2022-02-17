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
public class qn34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
           int n=sc.nextInt();
           int ans=0;
           int arr[]=new int[n];
            for (int j = 0; j < arr.length; j++) {
               arr[j]=sc.nextInt(); 
            }
            Arrays.sort(arr);
            for (int j = 0; j < arr.length; j++) {
                int ca=1;
                    while(j+1<arr.length && arr[j]==arr[j+1]){ca++;j++;}
                ans=Math.max(ca,ans);
            }
            System.out.println(ans);
        }
 
    }
}
//1
//14 1 3 4 1 5 6 1 1 1 3 3 5 5 8
