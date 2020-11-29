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
import java.util.*;
class NegetiveNumException extends RuntimeException{}
public class TestThrow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num<0)
            throw new NegetiveNumException();
        else 
            System.out.println("correct");
        
    }
}