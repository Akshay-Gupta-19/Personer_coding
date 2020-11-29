/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaanthelloworld;

/**
 *
 * @author akggupta
 */
@FunctionalInterface
interface Greet{
    String doGreet(String name);
}
public class Lambda2 {
    public static void main(String[] args) {
        Greet g1=new Greet() {
            @Override
            public String doGreet(String name) {
                return "Hi "+name;
            }
        };
        //greetPerson(g1, "akshay");
        Greet g2= a -> "Hi " + a ;
        greetPerson(g2, "swapnil");
        greetPerson(a -> "Hi " + a,"akshay");
    }
    static void greetPerson(Greet g,String name){
        System.out.println(g.doGreet(name));
    }
}
