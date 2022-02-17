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
public class Counting2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nl[]=new int[100];
        for (int i = 0; i < n; i++) {
            nl[sc.nextInt()]++;
        }
        for (int i = 0; i < nl.length; i++) {
            for (int j = 0; j < nl[i]; j++) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
