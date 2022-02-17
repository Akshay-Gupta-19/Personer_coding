/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LNMIITCodingLeague1;
import java.util.*;
/**
 *
 * @author avnegers
 */
public class Qn3_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        int div[]=new int[12];
        for (int i = 0; i < div.length; i++) {
           div[i]=sc.nextInt(); 
        }
        long ans=0;
        for (int i = 1; i <= div.length; i++) {
            if(i%2==0)
                ans-=gcd(div,i,-1);
            else
                ans+=gcd(div,i,-1);
        }
        System.out.println(ans);
    }
    static long gcd(int arr[],int noe,int si){
        for (int j = si+1; j < arr.length; j++) {
            //al.add(arr[j]);
            gcd(arr,noe-1,si+1);
        }
        return 0;
    }
    static long gcd(int arr[]){
   return 0;     
    }
    static long gcd(int a,int b){
        return 0;
    }
}
