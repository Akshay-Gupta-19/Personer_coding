/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class BearAndSteadyGene {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sc.nextInt();
        char c[]=sc.next().toCharArray();
        int elecnt[]=new int[4];
        Arrays.fill(elecnt,-c.length/4);
        for (int i = 0; i < c.length; i++) {
            cntr(elecnt,c[i],true);
        }
        int minLen=0;
        for (int i = 0; i < elecnt.length; i++) {
           if(elecnt[i]>0)minLen+=elecnt[i]; 
        }
        int substrcnt[]=new int[4];
        for (int i = minLen; i <=c.length; i++) {
            for (int j = 0; j < i; j++) {
                cntr(substrcnt,c[j],true);
            }
            if(isOk(elecnt,substrcnt)){
                System.out.println(i);
                System.exit(0);
            }
            for (int j = i; j < c.length; j++) {
                cntr(substrcnt,c[j],true);
                cntr(substrcnt,c[j-i],false); 
                if(isOk(elecnt,substrcnt)){
                System.out.println(i);
                System.exit(0);
            }
            }
        }
    }
    static boolean isOk(int arr1[],int arr2[]){
        for (int i = 0; i < arr2.length; i++) {
           if(arr1[i]>arr2[i]){
               return false;
           } 
        }
        return true;
    }
    static void cntr(int arr[],char c,boolean iod){//increment or decrement
        switch(c){
                case 'A':
                    if(iod)arr[0]++;else arr[0]--;
                    break;
                case 'G':
                    if(iod)arr[1]++;else arr[1]--;
                    break;
                case 'T':
                    if(iod)arr[2]++;else arr[2]--;
                    break;
                case 'C':
                    if(iod)arr[3]++;else arr[3]--;
                    break;
            }
    }
}