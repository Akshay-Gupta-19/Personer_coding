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
public class qn48 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int arr[]=new int[t];
        arr[0]=sc.nextInt();
        for (int i = 1; i <arr.length; i++) {
            arr[i]=arr[i-1]+sc.nextInt();
        }
        int q=sc.nextInt();
        q: for (int i = 0; i < q; i++) {
            long targ=sc.nextLong();
            for (int j = 0; j < arr.length; j++) {
               if(arr[j]>=targ){System.out.println(j+1);continue q;} 
            }
            System.out.println(-1);
        }
    }
}
