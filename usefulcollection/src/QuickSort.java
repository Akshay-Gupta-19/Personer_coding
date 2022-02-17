
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class QuickSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().sortArray(new int[]{5,2,3,1})));
    }
}

class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums,0,nums.length-1);
        return nums;
    }
    void quickSort(int nums[],int l,int r){
        if(l>=r)return;
        int part=partition(nums,l,r);
        quickSort(nums,l,part-1);
        quickSort(nums,part+1,r);
    }
    int partition(int nums[],int l,int r){
        int pivot=nums[l];
        int ol=l;
        
        while(l<r){
            while(l<r && nums[l]<pivot)l++;
            while(l<r && nums[r]>pivot)r--;
            if(l<r){swap(nums,l,r);}
        }
        swap(nums,l-1,ol);
        return l-1;
    }
    void swap(int arr[],int l,int r){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
}
