/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author avnegers
 */
public class texteditor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int qu=sc.nextInt();
        String str="";
        Stack strs=new Stack();
        for (int i = 0; i < qu; i++) {
            int t=sc.nextInt();
            switch(t){
                case 1:
                    String inpstr=sc.next();
                   str+=inpstr;
                   strs.push(inpstr.length());
                   break;
                case 2:
                    int k=sc.nextInt();
                    strs.push(str.substring(str.length()-k, str.length()));
                    str=str.substring(0, str.length()-k);
                    break;
                case 3:
                    System.out.println(str.charAt(sc.nextInt()-1));
                    break;
                case 4:
                    Object stackpop=strs.pop();
                    if(stackpop instanceof String){
                        str+=stackpop;
                    }
                    else
                        str=str.substring(0,str.length()-(int)stackpop);
                    break;
            }
        }
    }
}
