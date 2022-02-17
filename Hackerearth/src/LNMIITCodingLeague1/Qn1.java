/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LNMIITCodingLeague1;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class Qn1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        ans=new HashSet();
        for (int i = 0; i < arr.length; i++)
           arr[i]=sc.nextInt(); 
        int dy[][]=new int[n][n];
        fillUp(arr,dy,0,n-1);
        System.out.println(ans.size());
    }
   static HashSet<Integer> ans;
    static int fillUp(int arr[],int dy[][],int i,int j){
        if(i==j){ans.add(arr[i]); return dy[i][i]=arr[i];}
        if(i>j){return 0;}
        if(dy[i][j]!=0)return dy[i][j];
        dy[i][j]=fillUp(arr,dy,i+1,j)+fillUp(arr,dy,i,j-1)-fillUp(arr,dy,i+1,j-1);
        ans.add(dy[i][j]);
        return dy[i][j];
    }
}
