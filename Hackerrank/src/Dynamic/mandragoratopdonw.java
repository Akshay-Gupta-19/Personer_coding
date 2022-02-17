package Dynamic;

import java.util.Arrays;
import java.util.Scanner;
public class mandragoratopdonw {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            arr=new int[n];
            arr2d=new int[n+1][n+1];
            for (int j = 0; j < arr.length; j++) {
               arr[j]=sc.nextInt(); 
            }
            sort(arr); 
            System.out.println(recsol(1,0));
        }
    }
    static int arr[];
    static int arr2d[][];
    static int recsol(int s,int si){
        if(si==arr.length) return 0;
        if(arr2d[s][si]!=0) return arr2d[s][si];
        else
            arr2d[s][si]=Math.max(recsol(s+1,si+1),s*arr[si]+recsol(s,si+1));
        return arr2d[s][si];
    }
  private static int[] numbers;
  private static int[] helper;

  private static int number;

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
