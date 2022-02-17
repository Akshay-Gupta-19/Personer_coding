/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class Ashtonstring {
    public static void main(String[] args) {
        byte t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextByte();
        for (int i = 0; i < t; i++) {
            ArrayList<String> al=new ArrayList<String>();
            String s=sc.next();
            String fin="";
            int k=sc.nextInt()-1;
            for (int j = 0; j < s.length(); j++) {
                for (int l = j+1; l < s.length()+1; l++) {
                    al.add(s.substring(j,l));
                }
            }
            al.sort(null);
            for (int j = 0; j < al.size(); j++) {
                fin+=al.get(j);
            }
            System.out.println(fin.charAt(k));
      
          //  System.out.println(fin);
        }
    }
}
