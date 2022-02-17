package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class flowers {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int k=sc.nextInt();
       int ans=0;
       int mul=0;
       int arra[]=new int[n];
        for (int i = 0; i < arra.length; i++)
           arra[i]=sc.nextInt(); 
        quickSort(arra, 0, n-1);
        for (int i = 0; i < n; i++) {
            if(i%k==0)mul++;
            ans+=(mul)*arra[i];
        }
        System.out.println(ans);
    }
    static void quickSort(int[] arr, int low, int high) {
		if (arr == null || arr.length == 0)
			return;
 
		if (low >= high)
			return;
 
		// pick the pivot
		int middle = low + (high - low) / 2;
		int pivot = arr[middle];
 
		// make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			while (arr[i] > pivot) {
				i++;
			}
 
			while (arr[j] < pivot) {
				j--;
			}
 
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
 
		// recursively sort two sub parts
		if (low < j)
			quickSort(arr, low, j);
 
		if (high > i)
			quickSort(arr, i, high);
	}
}
