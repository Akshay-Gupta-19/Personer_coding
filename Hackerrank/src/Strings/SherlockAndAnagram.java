/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author akshay gupta
 */
public class SherlockAndAnagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        int ans=0;
        ArrayList<String> al=new ArrayList<String>();
            String s=sc.next();
            
            System.out.println(ans);
    }
    
    static boolean ang(String s1,String s2){
        int a[]=new int[26];
        for (int i = 0; i < s2.length(); i++) 
            a[s2.charAt(i)-'a']++;
        for (int i = 0; i < s1.length(); i++)
            a[s1.charAt(i)-'a']--;
        for (int i = 0; i < a.length; i++)
            if(a[i]!=0)
                return false;
        return true;
  }
    
}
class a{
    int a;
    int b;
}