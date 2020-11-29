/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threadings;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.IntStream;

/**
 *
 * @author akggupta
 */
public class ThreadTest3 {
    public static void main(String[] args) throws InterruptedException {
        Data d=new Data();
        Thread t1=new Thread(d);
        Thread t2=new Thread(d);
        Thread t3=new Thread(d);
        t1.start();
        t2.start();
        t3.start();
           t1.join();t2.join();t3.join();//makes sure that main finishes execution after all these three
     System.out.println(d.data);

     Data2 d2=new Data2();
        Thread t4=new Thread(d2);
        Thread t5=new Thread(d2);
        Thread t6=new Thread(d2);
        t4.start();
        t5.start();
        t6.start();
           t4.join();t5.join();t6.join();//makes sure that main finishes execution after all these three
                                         //join blocks the parent thread untill j4 is completed
     System.out.println("Atomic data "+d2.ai.get());
        System.out.println("Non atomic data "+d2.nai);
     
        AtomicReference<String> as=new AtomicReference();
    }
}
class Data implements Runnable{
      int data=0;
   
      @Override
     public void  run() {
         synchronized(this){//ensures lock and makes sure section is critical/atomic
        IntStream.range(1, 10000).forEach(i->data++);
         }
         System.out.println("Child Finished");
    }
    
}

class Data2 implements Runnable{
      AtomicInteger ai=new AtomicInteger();
      int nai=0;
      @Override
     public void  run() {
        IntStream.range(1, 10001).forEach(i->{ai.incrementAndGet();nai++;}); 
         System.out.println("Child2 Finished");
    }
    
}