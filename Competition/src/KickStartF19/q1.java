/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package KickStartF19;

/**
 *
 * @author akggupta
 */
import java.util.*;
public class q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        test: for (int i = 0; i < t; i++) {
            int n=sc.nextInt(),k=sc.nextInt();
            int arr[]=new int[n];
            int eff[]=new int[n];
            int cd=0;
            for (int j = 0; j < arr.length; j++){arr[j]=sc.nextInt(); if(j>0 && arr[j]!=arr[j-1])cd++; }
            if(arr[0]!=arr[1])eff[0]++;
            if(arr[n-1]!=arr[n-2])eff[n-1]++;
            for (int j = 1; j < eff.length-1; j++) {
                if(arr[j]!=arr[j-1])eff[j]++;else eff[j]--;
                if(arr[j]!=arr[j+1])eff[j]++;else eff[j]--;
                if(arr[j-1]!=arr[j+1])eff[j]--;
            }
            int ans=0;
            for (int j = 1; j < eff.length-1; j++) {
               if(eff[j]==2){ans++;cd-=2;eff[j]=0;eff[j-1]-=1;eff[j+1]-=1;}
               if(cd<=k){System.out.println(ans);continue test;}
            }
            for (int j = 0; j < eff.length; j++) {
                if(eff[j]==1){ans++;cd--;eff[j]=0;if(j>0)eff[j-1]-=1;if(j<n-1)eff[j+1]-=1;}
                if(cd<=k){System.out.println(ans);continue test;}
            }
            System.out.println(-1);
        }
    }
}
