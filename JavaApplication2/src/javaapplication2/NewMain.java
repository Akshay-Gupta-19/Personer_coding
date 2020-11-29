/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Date;

/**
 *
 * @author akggupta
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        myClass1 m;
        long t1=new Date().getTime();
        
        for (int i = 0; i < 1000; i++) {
        
        m=new myClass1();
            System.out.println(i);
            m.meth();
        }
        long t2=new Date().getTime();
        System.out.println(t2-t1);
    }
    
}
