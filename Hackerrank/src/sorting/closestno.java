/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class closestno {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> hs=new ArrayList();
        int mindiff=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(Math.abs(arr[i]-arr[j])<mindiff){
                    hs.clear();
                    hs.add(i);
                    hs.add(j);
                    mindiff=arr[i]-arr[j];
                }
                else if(arr[i]-arr[j]==mindiff){
                    hs.add(i);
                    hs.add(j);
                }
            }
        }
        for (int i = 0; i < hs.size(); i++) {
            System.out.print(arr[hs.get(i)]+" ");
        }
    }
    
}
