package Strings;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for (int i = 0; i <t; i++) {
        String s1,s2,s;
        s=sc.next();
        int slen=s.length();
        if(slen%2!=0){System.out.println("-1");continue;};
        s1=s.substring(0,slen/2);
        s2=s.substring(slen/2);
            System.out.println(ang(s1,s2));
        }
    }
    static int ang(String s1,String s2){
        int a[]=new int[26];
        for (int i = 0; i < s2.length(); i++) {
            a[s2.charAt(i)-'a']++;
        }
        for (int i = 0; i < s1.length(); i++) {
            a[s1.charAt(i)-'a']--;    
        }
        int r=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>0){r+=a[i];}
        }
        return r;
    }
}
