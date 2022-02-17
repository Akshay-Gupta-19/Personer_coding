/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS.queue;

import java.util.Scanner;

/**
 *
 * @author avnegers""
 */
public class sowntozero2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        for (int i = 0; i < q; i++) {
            int n=sc.nextInt();
            int k;
            f1: for(k=0;n!=0;k++){
                int nn;
                int j;
                for (j = 2; j <= Math.sqrt(n); j++) {
                    if(n%j==0){
                    n=Math.max(j, n/j);
                    continue f1;}
                }
                n--;
            }
            System.out.println(k);
        }
    }
}
