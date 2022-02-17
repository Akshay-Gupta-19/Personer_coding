/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekofcode31;

import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c[]=sc.next().toCharArray();
        for (int i = 1; i < c.length; i++) {
           if((c[i]==c[i-1])||(isvow(c[i])&&isvow(c[i-1]))){
               System.out.println("No");System.exit(0);
           } 
        }
        System.out.println("Yes");
    }
   static boolean isvow(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='y')return true;
        return false;
    }
}
