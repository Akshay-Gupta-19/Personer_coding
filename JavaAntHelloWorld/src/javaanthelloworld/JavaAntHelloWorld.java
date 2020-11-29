package javaanthelloworld;

import java.util.*;


interface Test1{
    default void printA(){
        System.out.println("Hello Test1");
        
    }
}
interface Test2{
    default void printA(){
        System.out.println("Hello Test2");
    }
}
class IntTest implements Test1,Test2{
    public void printA(){
        Test2.super.printA();
        System.out.println("Hello IntTest");
    }
}
public class JavaAntHelloWorld {
    public static void main(String[] args) {
        
        Vector<String> ht=new Vector(3);
        System.out.println(ht.capacity());
        ht.add("akshay");
        ht.add("swapnil");
        ht.add("sumit");
        ht.add("kapil");
        ht.add("random");
        for (int i = 0; i < ht.size(); i++) {
            System.out.println(ht.get(i));
        }
        System.out.println(ht.capacity());
        System.out.println(ht);
        Collections.sort(ht);
        System.out.println(ht);
        
        
        long t1=System.currentTimeMillis();
        LinkedList<String> ll= new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
           ll.addFirst(i+""); 
        }
        long t2=System.currentTimeMillis();
        System.out.println("Linked List time "+(t2-t1));
        long t3=System.currentTimeMillis();
        ArrayList<String> al= new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
           al.add(0,i+""); 
        }
        long t4=System.currentTimeMillis();
        System.out.println("ArrayList time "+(t4-t3));
    
    }
    
}
