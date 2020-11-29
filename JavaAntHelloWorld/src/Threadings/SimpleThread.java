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
public class SimpleThread {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Hello all");
        Thread t=Thread.currentThread();
        System.out.println("CUrrent thread is "+t.getName());
        t.setName("oracle");
        System.out.println("New Name of thread is "+t.getName());
        //minimum priority is 1 max is 10 and default is 5
        t.setPriority(10);
        System.out.println(t.getPriority());
        
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            Thread.sleep(500);
        }
    }
}
