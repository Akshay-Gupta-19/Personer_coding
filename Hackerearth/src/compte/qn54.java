/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compte;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn54 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        test:  for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int sum=0;
            int arr[]=new int[n];
            for (int j = 0; j < arr.length; j++) {
                arr[j]=sc.nextInt();
                sum+=arr[j];
            }
            ArrayList<Boolean> al=new ArrayList<>();
            al.add(true);
            f2:for (int j = 1; j <=sum; j++) {
                for (int k = 0; k < arr.length && j>=arr[k]; k++) {
                   if(j-arr[k]<al.size() && al.get(j-arr[k]) && j-arr[k]!=arr[k]){
                       al.add(Boolean.TRUE);continue f2;
                   }
                }
                System.out.println(j);
                continue test;
            }
            System.out.println(sum+1);
        }
    }

}
