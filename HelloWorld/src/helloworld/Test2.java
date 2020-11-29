/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author akggupta
 */
public class Test2 {
    public static void main(String[] args) {
        Test3 a=new Test3();
        a.fun2();
        LinkedList<Integer> ll=new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            ll.add(i);
        }
        Iterator<Integer> it1=ll.iterator();
        Iterator<Integer> it2=ll.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
            System.out.println(it2.next());
        }
    }
    
}
