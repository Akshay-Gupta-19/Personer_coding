package cakewalk;
import java.util.Scanner;
public class qn3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        char sol[]=n.toCharArray();
        sort(sol);
        correct(sol);
        if(new String(sol).equals(sc.next()))
            System.out.println("OK");
        else
            System.out.println("WRONG_ANSWER");
    }
    static void correct(char[] c){
        if(c[0]!='0')return;
        int i=-1;
        while(++i<c.length&&c[i]=='0');
        if(i==c.length)return;
        c[0]=c[i];
        c[i]='0';
    }
   private static char[] numbers;
  private static char[] helper;

  private static int number;

  public static void sort(char[] values) {
    numbers = values;
    number = values.length;
    helper = new char[number];
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
    while (i <= middle) {
      numbers[k] = helper[i];
      k++;
      i++;
    }

  }
}
