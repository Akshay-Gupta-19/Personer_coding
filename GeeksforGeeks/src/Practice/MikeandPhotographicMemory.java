/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class MikeandPhotographicMemory {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i <t; i++) {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for (int j = 0; j < arr.length; j++) {
                arr[j]=sc.nextInt();
            }
            Arrays.sort(arr);
            int sum=0;
            HashSet<Integer> hs=new HashSet<>();
            for (int j = arr.length-1; j >=0 && arr[j]>0; j--) {
                if(!containsDigits(hs,arr[j]))
                {
                    sum+=arr[j];
                    hs.addAll(digitsOf(arr[j]));
                }
                if(hs.size()==10)break;
            }
            System.out.println(sum);
        }
    }
    static HashSet<Integer> digitsOf(int i){
        HashSet<Integer> hs=new HashSet<>();
        while(i>0){
            hs.add(i%10);
            i/=10;
        }
        return hs;
    }
    static boolean containsDigits(HashSet<Integer> hs,int i){
        while(i>0){
            if(hs.contains(i%10))return true;
            i/=10;
        }
        return false;
    }
}