/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dynamic;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class stockmaximizer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=0;k<t;k++){
        int n=sc.nextInt();
        int arr1[]=new int[n];
        for (int i = 0; i < arr1.length; i++) {
           arr1[i]=sc.nextInt();
        }
        int arr2[][]=new int[n+1][n+1];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i][n]=i*arr1[n-1];
        }
        for (int i =n-1 ; i >=0; i--) {
            for (int j = 0; j <= i; j++) {
                arr2[j][i]=max(arr2[j][i+1],arr2[j+1][i+1]-arr1[i-1],arr1[i-1]*j);
            }
        }
                 System.out.println(arr2[0][0]);
   
        }
    }
    //3 3 5 3 2 3 1 2 100 4 1 3 1 2
    static int max(int x, int y,int z){
        if(x>y){
            if(x>z)
                return x;
            else
                return z;
        }
        else{
            if(y>z)
                return z;
            else
                return y;
        }
    }
}
