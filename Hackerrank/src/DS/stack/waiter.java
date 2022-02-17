/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS.stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author avnegers
 */
public class waiter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),q=sc.nextInt(),prim=2;
        LinkedList<Stack> al=new LinkedList<>();
        Stack<Integer> fs=new Stack<>();
        for (int i = 0; i < n; i++) {
            int x=sc.nextInt();
            fs.push(x);
        }
        al.addLast(fs);
        for (int i = 0; i < q; i++) {
            Stack<Integer> st=al.pollLast();
            Stack<Integer> nsd=new Stack(); //new stack deviding
            Stack<Integer> nsnd=new Stack(); //new stack not deviding
            while(!st.isEmpty()){
                int x=st.pop();
                if(x%prim==0)
                    nsd.push(x);
                else
                    nsnd.push(x);
            }
            al.addLast(nsnd);
            al.addLast(nsd);
            prim=getnextprim(prim);
        }
        
    }
    static int getnextprim(int x){
        for (int i = x+1;; i+=2) {
            if(isprime(i))
                return i;
        }
    }
    static boolean isprime(int x){
        if(x%2==0)
            return false;
        for (int i = 3; i*i <x ; i+=2) {
            if(x%i==0)
                return false;
        }
        return true;
    }
}
