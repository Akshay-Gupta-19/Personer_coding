/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MStanly;

import java.util.LinkedList;
import java.
/**
 *
 * @author USER
 */
import java.util.List;
public class Q1 {
    static Q1 classRef;
    
    private Q1(){
        
    }
    LinkedList<myThread> ll=new LinkedList<>();
     LinkedList<I> taskQ=new LinkedList<>();
    public void enque(I task){
        if(ll.isEmpty())
            taskQ.add(task);
        
        myThread newT=ll.get(0);
        newT.waitHandle.reset();
        newT.run();
        newT.busy=false;
    }
}
class myThread extends Thread{
     Object waitHandle;
     LinkedList<I> task;

    public myThread(LinkedList<I> task) {
        this.task=task;
    }
     
    @Override
    public synchronized void start() {
        super.start(); //To change body of generated methods, choose Tools | Templates.
        while(true){
            waitHandle.wait();
            while(!task.isEmpty()){
                exec();
            }
            waitHandle.set();
        }
    }
    void exec(){
        task.pollFirst().exe();
    }
}

interface I{
    void exe();
}