/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Avengers
 */
public class insort2 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        insertionSort(arr);
    }
    
    public static int insertionSort(int array[]) {

        int n = array.length;
        int ans=0;

        for (int j = 1; j < n; j++) {

            int key = array[j];

            int i = j - 1;

            while ((i > -1) && (array[i] > key)) {

                ans++;
                
                array[i + 1] = array[i];

                i--;
                

            }
            
            array[i + 1] = key;
       }
return ans;
    }

    
}
