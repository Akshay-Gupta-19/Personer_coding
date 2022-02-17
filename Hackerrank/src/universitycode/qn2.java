package universitycode;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {
    static int k;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
         k = in.nextInt();
        int[] x = new int[n];
        for(int x_i=0; x_i < n; x_i++){
            x[x_i] = in.nextInt();
        }
        Arrays.sort(x);
        System.out.println(solve(x,0,0,0));
    }
    static int solve(int arr[],int x,int y,int z){
        if(x==arr.length && y<=arr[0] && z>=arr[arr.length-1])return 0;
        else if(x==arr.length)return Integer.MAX_VALUE-10000;
        if(y<=arr[0] && z>=arr[arr.length-1])return 0;
        if(arr[x]>=y && arr[x]<=z)return solve(arr,x+1,y,z);
        return Math.min(solve(arr,x+1,Math.min(y,arr[x]-k),Math.max(z,arr[x]+k))+1,solve(arr,x+1,y,z));
    }
}
