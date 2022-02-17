/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameofcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn2 {
    static char s[];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i <t; i++) {
            sc.nextInt();
            Arrays.asList(args);
           s=sc.next().toCharArray();
            //solve(new ArrayList<Char>,0);
        }
    }
    static boolean a=false;
    static void solve(ArrayList s2,int b){
        if(b==s.length){System.out.println(s2);return;}
        if(!a){
             a=true;
            //solve(s2+(char)s[b],b+1); 
            a=false;
            solve(s2,b+1);
        }
        else{
        solve(s2,b+1);
        }
    }
   
}
