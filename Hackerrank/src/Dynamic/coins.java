package Dynamic;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class coins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        int weight[]=new int[m];
        for (int i = 0; i < weight.length; i++) {
           weight[i]=sc.nextInt(); 
        }
        sort(weight);
        int arr[][]=new int[m+1][n+1];
        Arrays.fill(arr[0],0);
        for (int i = 0; i < arr.length; i++)
            arr[i][0]=1;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if(weight[i-1]>j)
                    arr[i][j]=arr[i-1][j];
                else
                    arr[i][j]=arr[i][j-weight[i-1]]+arr[i-1][j];
//                   if(j%weight[i-1]==0)
//                       arr[i][j]=arr[i-1][j]+1;
//                   else
//                       arr[i][j]=arr[i-1][j];
            }
        }
        System.out.println(arr[m][n]);
    }
  
  static int[] numbers;
  static int[] helper;

  static int number;

  public static void sort(int[] values) {
    numbers = values;
    number = values.length;
    helper = new int[number];
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
      if (helper[i] <= helper[j]) {
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
