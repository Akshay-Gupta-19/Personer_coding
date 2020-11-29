/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParallelStreams;

/**
 *
 * @author akggupta
 */
import java.util.*;
import java.util.stream.IntStream;
public class PStreamsTest1 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        IntStream.range(1, 30).forEach(a->list.add(a));
        System.out.println(list);
        list.parallelStream().peek(i->System.out.print(Thread.currentThread().getName()+" "+i+" ")).forEach(i->System.out.println(i+" "));
        
        int sum=0;
        //list.stream().forEach(a->sum++);
        
        int sump=list.parallelStream().mapToInt(i->i).sum();
        System.out.println(sum);
        
    }
    
}
