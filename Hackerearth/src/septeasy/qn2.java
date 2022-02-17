/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package septeasy;

import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c[]=sc.next().toCharArray();
        if(c[0]=='?')c[0]='a';
        for (int i = 1; i < c.length-1; i++) {
                   if(c[i]=='?'&&c[i-1]=='a'||c[i+1]=='a')c[i]='b';
                   else if(c[i]=='?')c[i]='a';
        }
        try{
        if(c[c.length-1]=='?'&&c[c.length-2]=='a')c[c.length-1]='a';
        }
        catch(Exception ex){
            
        }
        System.out.println(new String(c));
    }
}
