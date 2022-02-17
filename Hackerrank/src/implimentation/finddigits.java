/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implimentation;

import java.util.Scanner;

/**
 *
 * @author akshay gupta
 */
public class finddigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
           int n=sc.nextInt();
           String s=n+"";
           int ans=0;
            for (int j = 0; j < s.length(); j++) {
                int in=s.charAt(j);
                if(in!='0'&&n%(in-'0')==0)ans++;
            }
            System.out.println(ans);
        }
    }
    
}
