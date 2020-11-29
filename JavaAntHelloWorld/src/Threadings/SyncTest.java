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
public class SyncTest {
    public static void main(String[] args) throws InterruptedException{
        MyTask task=new MyTask();
        Thread t1=new Thread(task);t1.start();
        Thread.sleep(1000);
        System.out.println("Trying to wake up my task");
        synchronized(task){
            task.notify();//to notify main has to get the lock of task object
            //t1.join(); by doing this main will not relese the lock hence mytask cant take
            //and till the lock is not relese mytask cant execute furhter hence its dead lock
            System.out.println("Notified");
            Thread.sleep(5000);
        }
        System.out.println("Main End");
    
    }
}
class MyTask implements Runnable{

    @Override
    public void run() {
        f1();
    }
    private synchronized void f1(){
        System.out.println("I am going sleep");
        
        try {
            Thread.sleep(10000);
            wait();//releses the lock then go to sleep
        } catch (InterruptedException ex) {
            System.out.println("Exception has occured");
        }
        System.out.println("I am up");
    }
        

}