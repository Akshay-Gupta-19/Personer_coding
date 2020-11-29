/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.util.stream.IntStream;

/**
 *
 * @author akggupta
 */
 class IterateStream {
    public static void main(String[] args) {
       int a=10;
        IntStream.range(0,100)
                .filter(even -> even % 2 ==0)
                .limit(10)
                .forEach(System.out::println);
    }
}

