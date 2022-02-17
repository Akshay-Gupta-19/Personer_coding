/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moodysanalytics;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn2 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int k=sc.nextInt();
       float x[]=new float[n];
       float y[]=new float[n];
       float z[]=new float[n];
       for (int i = 0; i < n; i++) {
            x[i]=sc.nextFloat();
        }for (int i = 0; i < n; i++) {
            y[i]=sc.nextFloat();
        }for (int i = 0; i < n; i++) {
            z[i]=sc.nextFloat();
        }
        float res[]=new float[n];
        for (int i = 0; i < res.length; i++) {
           float pa=x[i]*y[i]-(1-x[i])*z[i];
           if(pa>0)res[i]=pa;
        }
        sort(res);
        float fa=0;
        for (int i = 0; i <k && res[i]!=0; i++) {
            fa+=res[i];
        }
        System.out.printf("%.2f",fa);
        
    }
     private static float[] numbers;
  private static float[] helper;

  private static int number;

  public static void sort(float[] values) {
   numbers = values;
    number = values.length;
   helper = new float[number];
    mergesort(0, number - 1);
  }

  private static void mergesort(int low, int high) {
    // check if low is smaller then high, if not then the array is sorted
    if (low < high) {
      // Get the index of the element which is in the middle
      int middle = low + (high - low) / 2;
      // Sort the left side of the array
      mergesort(low, middle);
      // Sort the right side of the array
      mergesort(middle + 1, high);
      // Combine them both
      merge(low, middle, high);
    }
  }

  private static void merge(int low, int middle, int high) {

    // Copy both parts into the helper array
    for (int i = low; i <= high; i++) {
      helper[i] = numbers[i];
    }

    int i = low;
    int j = middle + 1;
    int k = low;
    // Copy the smallest values from either the left or the right side back
    // to the original array
    while (i <= middle && j <= high) {
      if (helper[i] >= helper[j]) {
        numbers[k] = helper[i];
        i++;
      } else {
        numbers[k] = helper[j];
        j++;
      }
      k++;
    }
    // Copy the rest of the left side of the array into the target array
    while (i <= middle) {
      numbers[k] = helper[i];
      k++;
      i++;
    }

  } 
}
/*
4 2
0.5 0.5 0.5 0.5
4.0 1.0 2.0 3.0
4.0 0.5 1.0 1.0
*/