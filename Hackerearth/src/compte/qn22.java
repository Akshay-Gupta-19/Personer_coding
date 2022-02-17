/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compte;

import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][3];
        for (int i = 0; i <arr.length; i++) {
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
            arr[i][2]=sc.nextInt();
        }
        int ans=0;
        for (int i = 1; i <= 1000; i++) {
            test: for (int j = 1; j <= 1000; j++) {
                for (int k = 0; k < arr.length; k++) {
                   if(dis(i,j,arr[k][0],arr[k][1])<=arr[k][2]){
                       for (int l = k+1; l < arr.length; l++) {
                           if(dis(i,j,arr[l][0],arr[l][1])<=arr[l][2]){ans++;continue test;}
                       }
                   } 
                }
            }
        }
        System.out.println(ans);
    }
    static int dis(int a1,int a2,int a3,int a4){
        int x= (int)(Math.sqrt(Math.pow(a4-a2,2)+Math.pow(a3-a1,2))+0.5);
    return x;
    }
}
