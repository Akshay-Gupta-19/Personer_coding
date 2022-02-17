/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS;

import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class KindergardenAdventure {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++)
           arr[i]=sc.nextInt();
        int ansID=0,ansVal=0;
        for (int i = 0; i < arr.length; i++) {
            int ca=0;
            int t=1;
            if(arr[i]==0)ca++;
            for (int j = (i+1)%n; j !=i; j=(j+1)%n) {
               if(t>=arr[j])ca++;
               t++;
            }
            if(ansVal<ca){ansVal=ca;ansID=i;}
 
        }
        System.out.println(ansID+1);
    }
    
}
