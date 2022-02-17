package Searching;

import java.util.Scanner;

public class SherlockAndArray {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       test: for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int rsum=0,lsum=0;
            int arr[]=new int[n];
            for (int j = 0; j < n; j++) {
                arr[j]=sc.nextInt();
                rsum+=arr[j];
            }
            if(rsum-arr[0]==0){System.out.println("YES");continue test;}
            if(rsum-arr[n-1]==0){System.out.println("YES");continue test;}
            lsum+=arr[0];
            rsum-=arr[0];
            for (int j = 1; j < arr.length; j++) {
                rsum-=arr[j];
                if(rsum-lsum==0){
                    System.out.println("YES");continue test;
                }
            lsum+=arr[j];
            }
            System.out.println("NO");
        }
    }
    
}
