/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SapTest;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'largestSubgrid' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. 2D_INTEGER_ARRAY grid
     *  2. INTEGER maxSum
     */

    public static int largestSubgrid(List<List<Integer>> grid, int maxSum) {
        int n=grid.size();
        int arr[][]=new int[n][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
            if(i==0 && j==0)
                arr[i][j]=grid.get(i).get(j);
            else if(i==0)
                arr[0][j]=grid.get(0).get(j)+arr[i][j-1];
            else if(j==0)
                arr[i][0]=grid.get(i).get(0)+arr[i-1][0];
            else
                arr[i][j]=grid.get(i).get(j)+arr[i-1][j]+arr[i][j-1]-arr[i-1][j-1];
        }
    }
        int l=0,r=arr.length-1;
        while(l<r){
            int mid=l+(r-l+1)/2;
            long cur=0;
            for(int i=mid-1;i<n;i++){
                for(int j=mid-1;j<n;j++){
                    long total=arr[i][j];
                    if(i>=mid)total-=arr[i-mid][j];
                    if(j>=mid)total-=arr[i][j-mid];
                    if(i>=mid && j>=mid)total+=arr[i-mid][j-mid];
                    long val=Math.max(cur,total);
                    cur=val;
                    
                }
            }
            if(maxSum>=cur)l=mid;
            else r=mid-1;
        }
        return r;
    }

}