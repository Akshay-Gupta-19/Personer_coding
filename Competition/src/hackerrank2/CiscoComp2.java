/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank2;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class CiscoComp2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char x[]=sc.next().toCharArray();
        
        out:for (int i = 1; i < x.length-1; i++) {
            for (int j = i+1; j < x.length; j++) {
                String a=new String(x,0,i),b=new String(x,i,j-i),c=new String(x,j,x.length-j);
                //System.out.println(a+" "+b+" "+c);
                if(isSuper(a,b,c)){
                    System.out.println(c);
                     System.exit(0);
                }
                if(isSuper(a,c,b)){
                    System.out.println(b);
                     System.exit(0);
                }
                if(isSuper(b,c,a)){
                    System.out.println(a);
                     System.exit(0);
                }
                if(isSuper(b,a,c)){
                    System.out.println(c);
                     System.exit(0);
                }
                if(isSuper(c,a,b)){
                    System.out.println(b);
                     System.exit(0);
                }
                if(isSuper(c,b,a)){
                    System.out.println(a);
                     System.exit(0);
                }
            }
 
        }
        System.out.println("0");
    }
   
    static boolean isSuper(String a,String b,String c){
        if(!isMirror(a,b))return false;
        return Integer.parseInt(a)+Integer.parseInt(b) == Integer.parseInt(c);
    }
    static boolean isMirror(String a,String b){
        if(a.length() !=b.length())return false;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)!=b.charAt(b.length()-1-i))
                return false;
        }
        return true;
    }
}
