/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leetcode.Weekly171;

import java.util.Scanner;

/**
 *
 * @author akggupta
 */
public class Qn2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        System.out.println(minFlips(a, b, c));
    }
    static int minFlips(int a,int b,int c){
        String s1=Integer.toBinaryString(a);
        String s2=Integer.toBinaryString(b);
        String s3=Integer.toBinaryString(c);
        int maxLen=Math.max(s1.length(),Math.max(s2.length(),s3.length()));
        while(s1.length()<maxLen)s1="0"+s1;
        while(s2.length()<maxLen)s2="0"+s2;
        while(s3.length()<maxLen)s3="0"+s3;
        int ans=0;
        for (int i = 0; i <maxLen; i++) {
            if(s3.charAt(i)=='0'){
                if(s1.charAt(i)!='0')ans++;
                if(s2.charAt(i)!='0')ans++;
            }
            else{
                if(s1.charAt(i)!='1' && s2.charAt(i)!='1')ans++;
            }
        }
        return ans;
    }
    
}
