/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matmatical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class Qn3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i <t; i++) {
            char c[]=sc.next().toCharArray();
            Arrays.sort(c);
        ArrayList<Character> ofChares=new ArrayList<>();
            for (int j = 0; j < c.length; j++) {
              ofChares.add(c[j]);
            }
        printPerm(ofChares,"");
        System.out.println("");
        }
    }
    static void printPerm(ArrayList<Character> al,String s){
        if(al.size()==0){System.out.print(s+" ");return;}
        for (int i = 0; i <al.size(); i++) {
            char cta=al.remove(i);
            printPerm(al, s+cta);
            al.add(i,cta);
        }
    }
}
