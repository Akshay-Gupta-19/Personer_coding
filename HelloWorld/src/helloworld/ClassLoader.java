/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.*;

/**
 *
 * @author akggupta
 */
interface x{
    default void meth(){System.out.println("x");}
}
public class ClassLoader implements x{
    int x;
    int y=x;
    public static void main(String[] args) {
        short x=1;
        ArrayList<Integer> src=new ArrayList<>();
        ArrayList<Integer> des=new ArrayList<>();
        src.add(1);
        src.add(2);
        src.add(3);
        des.addAll(src);
        src.remove(1);
        System.out.println(des);
    }
}
