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
public class qn15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int arr[]=new int[n];
            for (int j = 0; j < arr.length; j++) {
               arr[j]=sc.nextInt();
            }
            Arrays.sort(arr);
            long ans=1;
            long mo=1000000007;
            for (int j = arr.length-1; j >=0; j--) {
                ans=(ans*((m-arr[j]+1)-(arr.length-1-j)-pbn(m,arr[j]))%mo)%mo;
            }
            System.out.println(ans%mo);
        }
    }
    static boolean isprime(int n){
      if (n <= 1)  return false;
    if (n <= 3)  return true;
 
    // This is checked so that we can skip 
    // middle five numbers in below loop
    if (n%2 == 0 || n%3 == 0) return false;
 
    for (int i=5; i*i<=n; i=i+6)
        if (n%i == 0 || n%(i+2) == 0)
           return false;
 
    return true;
   }
    static int pbn(int x,int y){
        int rev=0;
        for (int i = y; i <= x; i++) {
            if(isprime(i))rev++;
        }
        return rev;
    }
}
