/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moraextream16;

import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int w=sc.nextInt();
        int sum[]=new int[n];
        sum[0]=sc.nextInt();
        System.out.print(sum[0]+" ");
        for (int i = 1; i < n; i++) {
            sum[i]=sum[i-1]+sc.nextInt();
            if(i>=w){
                System.out.print(sum[i]-sum[i-w]+" ");
            }
            else{
                System.out.print(sum[i]+" ");
            }
        }
    }
    
}
