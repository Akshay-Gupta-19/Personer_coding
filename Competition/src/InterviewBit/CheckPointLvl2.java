/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewBit;

import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * @author akggupta
 */

public class CheckPointLvl2 {
    public static void main(String[] args) {
        int A=6;
        int si=(2*A)-1;
        int arr[][]=new int[si][si];
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < A-i; j++) {
                arr[A-1-i][j]=A-j;
                arr[j][A-1-i]=A-j;
            }
        }
        for (int i = A; i < arr.length; i++) {
            for (int j = 0; j < A; j++) {
                arr[j][i]=arr[j][2*A-i-2];
            }
        }
        for (int i = A; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]=arr[2*A-2-i][j];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i])); 
        }
    }
}
