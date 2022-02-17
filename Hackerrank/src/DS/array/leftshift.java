/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS.array;

import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class leftshift {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int arr[]=new int[n];
        int arr2[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
           arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
           arr2[i]=arr[(i+d)%n];
        }
    }
}
