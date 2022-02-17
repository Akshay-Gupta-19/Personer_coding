/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class CiscoComp1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
           arr[i]=sc.nextInt(); 
        }
        Arrays.sort(arr);
        int ans=Integer.MAX_VALUE;
        for (int i = m-1; i < arr.length; i++) {
            ans=Math.min(ans,arr[i]-arr[i-(m-1)]);
            
        }
        System.out.println(ans);
    }
}
