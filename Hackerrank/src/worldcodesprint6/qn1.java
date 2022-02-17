/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldcodesprint6;

import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        for (int i = 0; i < q; i++) {
            int n=sc.nextInt();
            int ans=0;
            int arr[][]=new int[2*n][2*n];
            for (int j = 0; j < 2*n; j++) {
                for (int k = 0; k < 2*n; k++) {
                    arr[j][k]=sc.nextInt();
                }
            }
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    ans+=Math.max(Math.max(Math.max(arr[j][k], arr[2*n-j-1][k]), arr[j][2*n-k-1]),arr[2*n-j-1][2*n-k-1]);//j,k 
                }
            }
            System.out.println(ans);
        }
    }
}
