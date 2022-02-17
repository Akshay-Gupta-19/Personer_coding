/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedinr2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author avnegers
 */
public class qn3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(reductionCost(arr));
    }
    
    static int reductionCost(int[] num) {
       // Arrays.sort(num);
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<num.length;i++){
            al.add(num[i]);
        }
        int ans=0;
        while(al.size()>1){
         int nv=0;
            nv+=al.remove(0);
            nv+=al.remove(0);
            ans+=nv;
            int t=al.size();
            while(--t>0&&al.get(t)>nv);
            
            al.add(t+1, nv);
        }
        return ans;
    }
    
    
static int binarySearch(ArrayList<Integer> al, int l, int r, int x)
    {
        if (r>=l)
        {
            int mid = l + (r - l)/2;
            if (al.get(mid) == x)
               return mid;
            if (al.get(mid) > x)
               return binarySearch(al, l, mid-1, x);
            return binarySearch(al, mid+1, r, x);
        }

  return -1;
    }
}