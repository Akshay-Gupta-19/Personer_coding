/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Scanner;

/**
 *
 * @author Injustice
 */
public class countging4 {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int oarr[]=new int[n];
        int nl[]=new int[100];
        String strlist[]=new String[n];
        for (int i = 0; i < n; i++) {
            oarr[i]=sc.nextInt();
            nl[oarr[i]]++;
            strlist[i]=sc.next();
        }
          for (int i = 1; i < nl.length; i++)
              nl[i]+=nl[i-1];
        String ans[]=new String[n];
        int i;
        for (i=strlist.length-1; i >=n/2; i--) {
               ans[--nl[oarr[i]]]=strlist[i];
          }
        for ( ; i >=0; i--) {
          ans[--nl[oarr[i]]]="-";
        }
          
          for (int j = 0; j <ans.length; j++) {
              System.out.print(ans[j]+" ");
          }
        System.out.println("");
    }
    
}
