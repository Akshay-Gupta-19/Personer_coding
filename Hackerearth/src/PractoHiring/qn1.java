/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PractoHiring;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[2*n];
        for (int i = 0; i < n *2; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int ans=0;
        for (int i = 0; i < arr.length; i+=2) {
        ans+=arr[i];
        }
        System.out.println(ans);
    }
   
}
