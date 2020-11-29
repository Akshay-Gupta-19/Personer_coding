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
public class ThreadTest2 implements Runnable{

    @Override
    public void run() {
        System.out.println("File Download starter");
        
        IntStream.range(1, 100).forEach(i->System.out.println("Child"+i));
    }
}
