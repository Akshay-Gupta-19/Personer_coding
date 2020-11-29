/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threadings;

/**
 *
 * @author akggupta
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;
public class ExecuterService {
    public static void main(String[] args) {
        ExecutorService es1=Executors.newFixedThreadPool(10);
        Task t1=new Task();
        //IntStream.range(1, 10).forEach(i->es1.submit(t1));
        IntStream.range(1, 10).forEach(i->es1.submit(()->doSomething()));
        es1.shutdown();
    }
    static int count;
   static void doSomething(){
       System.out.println(Thread.currentThread().getName()+" count "+count++);
   }
}
class Task implements Runnable{
    int count;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" count "+count++);
    }
}
