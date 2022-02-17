/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author akshay gupta
 */
public class sorting1 {
    public static void main(String[] args) {
        Arrays.asList(args);
        ArrayList al=new ArrayList();
        al.add("akshay");
        al.add("dkshay");
        al.add("bkshay");
        al.add("ckshay");
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
    }
    
}
