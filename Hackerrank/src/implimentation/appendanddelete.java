/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implimentation;

import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class appendanddelete {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        int k=sc.nextInt();
        if(s.length()>t.length()){
            int ext=s.length()-t.length();
            k-=ext;
            s=s.substring(0,t.length());
        }else{
            int ext=t.length()-s.length();
            k-=ext;
            t=t.substring(0,s.length());
        }
        int i;
        for (i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=t.charAt(i))break;
        }
        if((s.length()-i)*2>k)System.out.println("No");
        else System.out.println("Yes");
    }
}
