/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threadings;

import java.util.stream.IntStream;

/**
 *
 * @author akggupta
 */
public class ThreadingTest1 {
    public static void main(String[] args) {
        ThreadTest2 th=new ThreadTest2();
        Thread t=new Thread(th);
        t.start();
        
        IntStream.range(1, 100).forEach(i->System.out.print("main"+i));
        System.out.println("Main Thread Ends");
        
        new Thread(()->System.out.println("akshay")).start();
    }
}

