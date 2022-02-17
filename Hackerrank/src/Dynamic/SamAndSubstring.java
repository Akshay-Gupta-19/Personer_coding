/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dynamic;
import java.util.*;
/**
 *
 * @author avnegers
 */
public class SamAndSubstring {
    static int lm=1000000009;//limiting mod
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c[]=sc.next().toCharArray();
        int arr[]=new int[c.length];
        for (int i = 0; i < c.length; i++) {
           arr[i]=c[i]-'0'; 
        }
        long dy[]=new long[c.length+1];
        System.out.println(sol(arr,c.length-1,dy));
    }
    static long sol(int c[],int re,long dy[]){//right end of number
        if(re==0)return newSubstrs(c, re, dy);
        return (sol(c,re-1,dy)+newSubstrs(c,re,dy))%lm;
    }
    static long newSubstrs(int c[],int nci,long dyarr[]){//new Character index
        long ans=0;
        for (int i = 0; i <= nci; i++) {
           dyarr[i]=((dyarr[i]*10)+c[nci])%lm;
           ans=(ans+dyarr[i])%lm;
        }
        return ans;
    }
}