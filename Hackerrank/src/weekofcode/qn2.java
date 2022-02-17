package weekofcode;
import java.util.Scanner;
public class qn2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        int ans=0;
        int arr[]=new int[n];
        int c=0;
        for (int i = 0; i < arr.length; i++) {
           int x=sc.nextInt();
           if(sc.nextInt() == 1)
               arr[c++]=x;
           else
               ans+=x;
        }
        sort(arr);
        int i;
        for (i = 0; i < k; i++) {
            ans+=arr[i];
        }
        for (; i < c; i++) {
            ans-=arr[i];
        }
        System.out.println(ans);
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
      if (helper[i] >= helper[j]) {
        numbers[k] = helper[i];
        i++;
      } else {
        numbers[k] = helper[j];
        j++;
      }
      k++;
    }
    while (i <= middle) {
      numbers[k] = helper[i];
      k++;
      i++;
    }

  }
}
