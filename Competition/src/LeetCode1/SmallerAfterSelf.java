/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode1;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author USER
 */
public class SmallerAfterSelf {

    public static void main(String[] args) {
        List<Integer> countSmaller = new SmallerAfterSelf().countSmaller(new int[]{5,2,6,1});
        System.out.println(countSmaller);
    }
    class Point {

        int n, i;

        Point(int x, int y) {
            n = x;
            i = y;
        }
    }
    int ans[];

    public List<Integer> countSmaller(int[] nums) {
        Point arr[] = new Point[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = new Point(nums[i], i);
        }
        ans = new int[nums.length];
        mergeSort(arr, 0, nums.length - 1);
        List<Integer> ans2 = new LinkedList<>();
        for (int i = 0; i < ans.length; i++) {
            ans2.add(ans[i]);
        }
        return ans2;
    }

    void mergeSort(Point nums[], int l, int r) {
        if (l >= r) {
            return;
        }
        int mid = l + (r - l) / 2;
        mergeSort(nums, l, mid);
        mergeSort(nums, mid + 1, r);
        merge(nums, l, mid + 1, r);
    }

    void merge(Point nums[], int l, int m, int r) {
        LinkedList<Point> ll = new LinkedList<>();
        int lptr = l, rptr = m;
        while (lptr < m || rptr <= r) {
            if (rptr == r+1 || (lptr < m && nums[lptr].n < nums[rptr].n)) {
                ll.add(nums[lptr]);
                ans[nums[lptr].i] += (rptr - m);
                lptr++;
            } else {
                ll.add(nums[rptr]);
                rptr++;
            }
        }
        int x = l;
        for (int i = 0; i < ll.size(); i++) {
            nums[x++] = ll.get(i);
        }

    }
}
