/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldcodesprint6;

import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr1[]=new int[5],arr2[]=new int[5];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=sc.nextInt();
        }for (int i = 0; i < arr2.length; i++) {
            arr2[i]=sc.nextInt();
        }
        int ans=0;
        for (int i = 0; i < 5; i++) {
            ans+=sol(arr1[i],arr2[i]);
            //System.out.println(sol(arr1[i],arr2[i]));
        }
        System.out.println(ans);
    }
   static int sol(int x,int y){
       if(y<x){
           int temp=x;
           x=y;
           y=temp;
       }
       return Math.min(y-x,10-y+x);
   }
}
