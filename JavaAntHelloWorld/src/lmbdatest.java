/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author akggupta
 */
import java.util.*;
@FunctionalInterface
interface if1{
    int add(int a,int b);
  
}

public class lmbdatest {
    public static void main(String[] args) {
     if1 ab= (a,b)->a+b;
     List<Integer> l= new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
           l.add(i);
        }
     Collections.sort(l,(a,b) ->b-a);
        System.out.println(l);
    }
    
    
}
