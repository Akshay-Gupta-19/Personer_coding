/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS.stack;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Injustice
 */
public class balanceParantheses {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        test: for (int k = 0; k <t; k++) {
        byte b[] = sc.next().getBytes();
        LinkedList<Character> ll = new LinkedList<Character>();
        try{for (int i = 0; i < b.length; i++) {
            switch (b[i]) {
                case '(':
                    ll.push('(');
                    break;
                case '{':
                    ll.push('{');
                    break;
                case '[':
                    ll.push('[');
                    break;
                case ']':
                    if (ll.pop() == '['); else {
                        System.out.println("NO");
                        continue test;
                    }
                    break;
                case ')':
                    if (ll.pop() == '('); else {
                        System.out.println("NO");
                        continue test;
                    }
                break;
                case '}':
                    if (ll.pop() == '{'); else {
                        System.out.println("NO");                    
                        continue test;
                    }
                break;
            }
        }
        if(ll.isEmpty())
        System.out.println("YES");
        else
                System.out.println("NO");
        }
        catch(Exception e){
            System.out.println("NO");
        }
        }
    }

}
