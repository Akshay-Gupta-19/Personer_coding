/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode1;

import java.util.LinkedList;

/**
 *
 * @author USER
 */
public class InsertInvervel57 {
    public static void main(String[] args) {
        new Solution57().insert(new Integer[][]{}, newInterval);
    }
}

class Solution57 {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        int firstRej = findFirst(intervals,newInterval[0]);
        int lastRej = findLast(intervals,newInterval[1]);
        if(firstRej!=intervals.length)
            newInterval[0]=Math.min(intervals[firstRej][0],newInterval[0]);
        if(lastRej<intervals.length-1)
            newInterval[1]=Math.max(intervals[lastRej-1][1],newInterval[1]);
        LinkedList<Integer[]> ll=new LinkedList<>();
        for (int i = 0; i < intervals.length; i++) {
           if(i<firstRej || i>=lastRej)
               ll.add(new Integer[]{intervals[i][0],intervals[i][1]});
           if(i==firstRej)
               ll.add(new Integer[]{newInterval[0],newInterval[1]});
        }
        int ans[][]=new int[ll.size()][];
        for (int i = 0; i < ll.size(); i++) {
           ans[i]=new int[]{ll.get(i)[0],ll.get(i)[1]};
        }
        return ans;
    }
    int findFirst(int intervals[][],int left){
        for (int i = 0; i < intervals.length; i++) {
           if(intervals[i][1]>=left)
               return i;
        }
        return intervals.length;
    }
    int findLast(int intervals[][],int right){
        for (int i = 0; i < intervals.length; i++) {
           if(intervals[i][0]>right)
               return i;
        }
        return intervals.length;
    }
}
