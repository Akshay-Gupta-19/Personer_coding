/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class missingno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]=new int[102];
        int mul=0;
        int x1=sc.nextInt();arr1[x1%100]++;mul=x1/100;//for getting multipplier take 1 element sepratly
        for (int i = 1; i <n; i++) {
            arr1[sc.nextInt()%100]++;
        }
        int m=sc.nextInt();
        int arr2[]=new int[102];
        for (int i = 0; i <m; i++) {
            arr2[sc.nextInt()%100]++;
        }
        HashSet<Integer> hs=new HashSet<>();
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i]>arr1[i])hs.add(i+mul*100);
        }
        Iterator i=hs.iterator();
        
        while(i.hasNext())
            System.out.print(i.next()+" ");
        
    }
 
}
