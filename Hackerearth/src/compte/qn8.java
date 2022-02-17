/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compte;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sc.nextInt();
        int q=sc.nextInt();
        char s[]=sc.next().toCharArray();
        int s2[]=new int[s.length];
        for (int i = 0; i < s.length; i++) {
             s2[i]=s[i];
        }
        for (int i = 0; i <q; i++) {
            int l=sc.nextInt()-1;
            int r=sc.nextInt()-1;
            int k=sc.nextInt();
            //System.out.println((char)kthSmallest(s2, l, r, k));
        }
    }
    
  static  int findMedian(int arr[],int l, int n)
{
    quickSort(arr, l, n);// Sort the array
    return arr[n/2];   // Return middle element
}
  
  
// Returns k'th smallest element in arr[l..r] in worst case
// linear time. ASSUMPTION: ALL ELEMENTS IN ARR[] ARE DISTINCT
static int kthSmallest(int arr[], int l, int r, int k)
{
    // If k is smaller than number of elements in array
    if (k > 0 && k <= r - l + 1)
    {
        int n = r-l+1; // Number of elements in arr[l..r]
 
        // Divide arr[] in groups of size 5, calculate median
        // of every group and store it in median[] array.
        int i; 
        int median[]=new int[(n+4)/5];
        for (i=0; i<n/5; i++)
            median[i] = findMedian(arr,l+i*5, 5);
        if (i*5 < n) //For last group with less than 5 elements
        {
            median[i] = findMedian(arr,l+i*5, n%5); 
            i++;
        }    
 
        // Find median of all medians using recursive call.
        // If median[] has only one element, then no need
        // of recursive call
        int medOfMed = (i == 1)? median[i-1]:
                                 kthSmallest(median, 0, i-1, i/2);
 
        // Partition the array around a random element and
        // get position of pivot element in sorted array
        int pos = partition(arr, l, r, medOfMed);
 
        // If position is same as k
        if (pos-l == k-1)
            return arr[pos];
        if (pos-l > k-1)  // If position is more, recur for left
            return kthSmallest(arr, l, pos-1, k);
 
        // Else recur for right subarray
        return kthSmallest(arr, pos+1, r, k-pos+l-1);
    }
 
    // If k is more than number of elements in array
    return Integer.MAX_VALUE;
}
 

 
// It searches for x in arr[l..r], and partitions the array 
// around x.
static int partition(int arr[], int l, int r, int x)
{
    // Search for x in arr[l..r] and move it to end
    int i;
    for (i=l; i<r; i++)
        if (arr[i] == x)
           break;
 int temp = arr[i];
    arr[i] = arr[r];
    arr[r] = temp;
    // Standard partition algorithm
    i = l;
    for (int j = l; j <= r - 1; j++)
    {
        if (arr[j] <= x)
        {
            int temp2 = arr[i];
         arr[i] = arr[j];
            arr[j] = temp;
            i++;
        }
    }
    int temp2 = arr[i];
    arr[i] = arr[r];
    arr[r] = temp;
    return i;
}

    static void quickSort(int[] arr, int low, int high) {
		if (arr == null || arr.length == 0)
			return;
 
		if (low >= high)
			return;
 
		// pick the pivot
		int middle = low;
		int pivot = arr[middle];

		// make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}

			while (arr[j] > pivot) {
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

