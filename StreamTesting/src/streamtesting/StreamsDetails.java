/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streamtesting;

import java.util.stream.*;
import java.util.*;
import java.util.function.Function;
import java.util.regex.Pattern;

/**
 *
 * @author Akshay Gupta
 */
public class StreamsDetails {

    public static void main(String[] args) {
        int nums[] = new int[1];
        Stream<String> stream = Stream.of("25", "10", "15", "20", "25");
        TreeSet<String> collect = stream.collect(Collectors.toCollection(() -> new TreeSet<String>()));

        
        int nums2[] = new int[]{3,2,6,1,8,3,2,4,3,1,3,6,4,7,8};
        Map<Integer,Long> frequency=Arrays.stream(nums2).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(frequency);
        
        List<int[]> of = List.of(new int[]{1, 2, 6, 2, 3});
        HashMap hs = new HashMap();
        hs.put(0, 1);
        hs.put(2, 3);
        hs.put(2, 6);
        Random rand = new Random();
        int[][] operations = new int[7][3];
        IntStream.range(0, operations.length)
                .forEach(
                        i -> IntStream.range(0, operations[i].length).forEach(
                                j -> operations[i][j] = rand.nextInt(10)
                        )
                );

        Arrays.stream(operations).forEach(
                x -> {
                    Arrays.stream(x).forEach(
                            y -> System.out.print(y + " ")
                    );
                    System.out.println("");
                }
        );
        Set<Integer> collect1 = Stream.of(1,2,4,5,2).collect(Collectors.mapping((x)->(int)x,Collectors.toCollection(LinkedHashSet::new)));
        System.out.println(collect1);
        long sum=Arrays.stream(nums).asLongStream().sum();
    }
    
     public String largestWordCount(String[] messages, String[] senders) {
        String fullLog[][]=new String[messages.length][2];
        for(int i=0;i<fullLog.length;i++){
            fullLog[i][0]=messages[i];
            fullLog[i][1]=senders[i];
        }
        Map<String,Integer> ans= Arrays.stream(fullLog).collect(Collectors.groupingBy(x->x[0],Collectors.summingInt(x->x[1].split(" ").length)));
        return ans.entrySet().stream().sorted((x,y)->{
            if(x.getValue()==y.getValue())
                return x.getKey().compareTo(y.getKey());
            return x.getValue().compareTo(y.getValue());
        }).findFirst().get().getKey();
        
    }
}
