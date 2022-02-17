/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Scanner;

/**
 *
 * @author Avengers
 */
public class insort1 {
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
    
    public static void insertionSort(int array[]) {

        int n = array.length;
        

            int key = array[n-1];

            int i = n - 2;

            while ((i > -1) && (array[i] > key)) {

                
                array[i + 1] = array[i];

                i--;
                for (int j = 0; j < array.length; j++) {
                    System.out.print(array[j]+" "); 
                }
                System.out.println();
            }

            array[i + 1] = key;
       
    }

}
