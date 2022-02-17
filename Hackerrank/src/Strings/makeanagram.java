package Strings;
import java.util.Scanner;
public class makeanagram {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        String s1=sc.next(),s2=sc.next();
        System.out.println(ang(s1,s2));
    }   
    static int ang(String s1,String s2){
        int a[]=new int[26];
        for (int i = 0; i < s2.length(); i++)
            a[s2.charAt(i)-'a']++;        
        for (int i = 0; i < s1.length(); i++) 
            a[s1.charAt(i)-'a']--;    
        int r=0;
        for (int i = 0; i < a.length; i++)
            r+=Math.abs(a[i]);
        return r;
    }
}