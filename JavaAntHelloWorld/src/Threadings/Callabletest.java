/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threadings;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

/**
 *
 * @author akggupta
 */
public class Callabletest {
    public static void main(String[] args) {
        ExecutorService es=Executors.newFixedThreadPool(5);
        int arr[]=new int[]{1,2,3,4,5,6,2,4,4,76,3,7};
        SumTewst st=new SumTewst(arr);
        IntStream.range(1, 5).forEach(i->es.submit(st));
    }
}

class SumTewst implements Callable<Integer>{
    int arr[];

    public SumTewst(int[] arr) {
        this.arr = arr;
    }
    
    @Override
    public Integer call() throws Exception {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
           sum+=arr[i]; 
        }
        return sum;
    }
}