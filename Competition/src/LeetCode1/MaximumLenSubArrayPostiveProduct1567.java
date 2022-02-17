/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode1;

/**
 *
 * @author USER
 */
public class MaximumLenSubArrayPostiveProduct1567 {

    public static void main(String[] args) {

    }
}

class Solution1567 {

    public int getMaxLen(int[] nums) {
        int fz=-1,sz=-1;
        for (int i = 0; i < nums.length; i++) {
           if(nums[i]==0){
               if(fz==-1)fz=i;
               sz=i;
           } 
        }
        return Math.max(solve(nums,0,fz-1),solve(nums,sz+1,nums.length));
    }

    int solve(int arr[], int l, int r) {
        int fn = -1, sn = -1, tn = 0;
        for (int i = l; i <=r; i++) {
            if (arr[i] < 0) {
                if (fn == -1) {
                    fn = i;
                } else if (sn == -1) {
                    sn = i;
                }
                tn++;
            }
        }
        if (tn % 2 == 0) {
            return  r-l+1;
        }
        if (sn == -1) {
            return Math.max(r - fn, fn-l);
        }
        return Math.max(r - fn, sn-l);
    }
}
