/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue_ex;

import java.util.*;

/**
 *
 * @author avnegers
 */
public class Qn4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int arr[]=new int[n*2];
            for (int j = 0; j < n; j+=2) {
                arr[j]=sc.nextInt();
                arr[j+1]=sc.nextInt();
            }
            
            
        }
    }
}
