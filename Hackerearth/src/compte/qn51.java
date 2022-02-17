/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compte;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn51 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int pro=1;
            int arr[]=new int[n];int dy1[]=new int[n+1];int dy2[]=new int[n+1];
            Arrays.fill(dy1,-1);
            Arrays.fill(dy2,-1);
            for (int j = 0; j < arr.length; j++) {
               arr[j]=sc.nextInt(); 
            }boolean hz=false;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]!=0){hz=true;break;}
            } 
            int max=solve1(arr,0,dy2);
            if(!hz)
            System.out.print(0+" ");
            else
                System.out.print(Math.max(0, max)+" ");
            int min=solve2(arr,0,dy2);
            if(!hz)
            System.out.println(0);
            else
                System.out.println(Math.min(0, min));
        }
    }
    static int solve1(int arr[],int i,int dy[]){
        if(i==arr.length)return 1;
        if(dy[i]!=-1)return dy[i];
         dy[i]=Math.max(arr[i]*solve1(arr,i+1,dy),solve1(arr,i+1,dy));
         return dy[i];
        }
    static int solve2(int arr[],int i,int dy[]){
        if(i==arr.length)return 1;
        if(dy[i]!=-1)return dy[i];
         dy[i]=Math.min(arr[i]*solve2(arr,i+1,dy),solve2(arr,i+1,dy));
         return dy[i];
        }
}
