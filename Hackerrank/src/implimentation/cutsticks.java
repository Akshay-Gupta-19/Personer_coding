/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implimentation;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class cutsticks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
           arr[i]=sc.nextInt(); 
        }
        Arrays.sort(arr);
        System.out.println(n);
        for (int i = 0; i < arr.length; i++) {
            while(i<arr.length-1 && arr[i+1]==arr[i]){i++;}
            if(i!=n-1)System.out.println(n-i-1);
        }
    }
 
}
